/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.web;

import com.baidu.rigel.cust.bo.CustScoreDetail;
import com.baidu.rigel.cust.service.CustScoreDetailService;
import com.baidu.rigel.cust.service.CustService;
import com.baidu.rigel.cust.util.IDGenerator;
import com.baidu.rigel.cust.vo.CustQueryCondition;
import com.baidu.rigel.cust.vo.CustQueryVo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 * Created by yangchuanlian on 2016/10/22.
 */
@RequestMapping("/cust")
@Controller
public class CustListController {

    /**
     * log for this class
     */
    private static final Logger LOGGER = Logger.getLogger(CustListController.class);

    @Resource(name = "custService")
    private CustService custService;

    @Resource(name = "custScoreDetailService")
    private CustScoreDetailService custScoreDetailService;

    /**
     * 查询客户资料初始化
     *
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/custList")
    public String init(CustQueryCondition custQueryCondition, Map<String, Object> model) {
        try {
            List<CustQueryVo> custQueryVos = custService.getCustList(custQueryCondition);
            model.put("custList", custQueryVos);
        } catch (Exception ex) {
            LOGGER.error("queryCusts error", ex);
        }
        return "custListInit";
    }

    /**
     * 录入客户资料
     *
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/addCustInit")
    public String addCustInit() {
        return "addCustInit";
    }

    /**
     * 录入客户资料
     *
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/addCustInitNew")
    public String addCustInitNew() {
        return "addCustInitNew";
    }

    /**
     * 录入客户资料
     *
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/addCust")
    public String addCust(CustQueryCondition custQueryCondition, Map<String, Object> model) {
        custService.addSelfCust(custQueryCondition);
        CustQueryCondition condition = new CustQueryCondition();
        if (custQueryCondition.getCustCategory() != null) {
            condition.setCustCategory(custQueryCondition.getCustCategory());
        }
        List<CustQueryVo> custQueryVos = custService.getCustList(condition);
        model.put("custList", custQueryVos);
        return "custListInit";
    }

    /**
     * 查询线索信息详细
     *
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET}, value = "/custDetailInit")
    public String custDetailInit() {
        return "custDetailInit";
    }

    /**
     * 查询线索信息详细
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(method = {RequestMethod.POST}, value = "/showCustDetail")
    public Object showCustDetail() {
        return "custDetailInit";
    }

    /**
     * 获取线索页面初始化
     *
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET}, value = "/syncCustInit")
    public String syncCustInit() {
        return "syncCustInit";
    }

    /**
     * 获取线索
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(method = {RequestMethod.POST}, value = "/syncCust")
    public String syncCust() {
        // 同步数据
        custService.syncUpCusts();
        custService.syncDownCusts();
        // 积分
        CustScoreDetail oldCustScoreDetail = custScoreDetailService.selectByOne();
        CustScoreDetail custScoreDetail = new CustScoreDetail();
        custScoreDetail.setCustId(IDGenerator.generateBigIntKey());
        custScoreDetail.setType(2L);
        if (oldCustScoreDetail != null) {
            custScoreDetail.setAmount(-10L);
            custScoreDetail.setBalance(oldCustScoreDetail.getBalance() - 10L);
        } else {
            custScoreDetail.setAmount(0L);
            custScoreDetail.setBalance(oldCustScoreDetail.getBalance() - 10L);
        }
        custScoreDetail.setRemark("积分换资料");
        custScoreDetail.setAddTime(Calendar.getInstance().getTime());
        custScoreDetailService.insert(custScoreDetail);
        return "syncCust";
    }

    /**
     * 贡献线索
     *
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET}, value = "/devoteCustInit")
    public String devoteCust() {
        return "devoteCustInit";
    }

    /**
     * 贡献线索
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(method = {RequestMethod.POST}, value = "/devote")
    public String devote() {
        CustScoreDetail oldCustScoreDetail = custScoreDetailService.selectByOne();
        CustScoreDetail custScoreDetail = new CustScoreDetail();
        custScoreDetail.setCustId(IDGenerator.generateBigIntKey());
        custScoreDetail.setType(1L);
        if (oldCustScoreDetail != null) {
            custScoreDetail.setAmount(210L);
            custScoreDetail.setBalance(210L + oldCustScoreDetail.getBalance());
        } else {
            custScoreDetail.setAmount(210L);
            custScoreDetail.setBalance(210L);
        }
        custScoreDetail.setRemark("贡献资料换取积分");
        custScoreDetail.setAddTime(Calendar.getInstance().getTime());
        custScoreDetailService.insert(custScoreDetail);
        return "devote";
    }


    /**
     * 积分明细
     *
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET}, value = "/showScore")
    public String showScore(Map<String, Object> model) {
        try {
            List<CustScoreDetail> custScoreDetails = custScoreDetailService.getCustScoreDetails();
            model.put("custScoreDetails", custScoreDetails);
        } catch (Exception ex) {
            LOGGER.error("showScore error", ex);
        }
        return "scoreDetail";
    }

    /**
     * 营销结果
     *
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET}, value = "/reachResult")
    public String reachResult() {
        return "reachResult";
    }

}
