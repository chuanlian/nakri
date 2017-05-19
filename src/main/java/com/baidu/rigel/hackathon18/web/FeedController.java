/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon18.web;

import com.baidu.rigel.hackathon18.bo.Feed;
import com.baidu.rigel.hackathon18.service.FeedService;
import com.baidu.rigel.hackathon18.vo.FeedCalcResultVo;
import com.baidu.rigel.hackathon18.vo.FeedQueryCondition;
import com.baidu.rigel.hackathon18.vo.FeedQueryVo;
import com.baidu.rigel.hackathon18.vo.QualityDetailVo;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by yangchuanlian on 2017/5/19.
 */
@RequestMapping("/feed")
@Controller
public class FeedController {

    /**
     * log for this class
     */
    private static final Logger LOGGER = Logger.getLogger(FeedController.class);


    @Resource(name = "feedService")
    private FeedService feedService;

    /**
     * 查询潜FEED广告主程序
     *
     * @param feedQueryCondition
     * @param model
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/feedList")
    public String init(FeedQueryCondition feedQueryCondition, Map<String, Object> model) {
        try {
            if (StringUtils.equals(feedQueryCondition.getOperType(), "1")) {
                feedQueryCondition.setMinScore(feedQueryCondition.getScore());
            }
            if (StringUtils.equals(feedQueryCondition.getOperType(), "2")) {
                feedQueryCondition.setMaxScore(feedQueryCondition.getScore());
            }
            if (StringUtils.equals(feedQueryCondition.getOperType(), "3")) {
                feedQueryCondition.setMinScore(feedQueryCondition.getScore());
                feedQueryCondition.setMaxScore(feedQueryCondition.getScore());
            }
            List<FeedQueryVo> queryVos = feedService.getFeedList(feedQueryCondition);
            model.put("feedList", queryVos);
        } catch (Exception ex) {
            LOGGER.error("getFeedList error", ex);
        }
        return "feedListInit";
    }

    /**
     * 查询潜FEED广告主程序
     *
     * @param id
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/analysis")
    public String analysis(Long id, Map<String, Object> model) {
        FeedCalcResultVo feedCalcResultVo = feedService.getFeed(id);
        model.put("feedList", feedCalcResultVo);
        return "feedAnalysisDetail";
    }


    /**
     * 查询潜FEED广告主程序
     *
     * @param id
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/saleDetail")
    public String saleDetail(Long id, Map<String, Object> model) {
        return "saleDetail";
    }

    /**
     * 质量度管理
     *
     * @param model
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/qualityDetail")
    public String qualityDetail(Map<String, Object> model) {
        List<QualityDetailVo> qualityDetailVos = feedService.qualityDetail();
        model.put("feedList", qualityDetailVos);
        return "qualityDetail";
    }

    /**
     * 成单率预估
     *
     * @param model
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/rateDetail")
    public String rateDetail(Map<String, Object> model) {
        List<QualityDetailVo> qualityDetailVos = feedService.qualityDetail();
        model.put("feedList", qualityDetailVos);
        return "rateDetail";
    }
}
