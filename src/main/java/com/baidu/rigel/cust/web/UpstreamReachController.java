/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.rigel.cust.service.ReachResultService;
import com.baidu.rigel.cust.util.EJsonResult;
import com.baidu.rigel.cust.vo.ReachResultVo;

/**
 * Created by zhengweichao on 2016/10/22.
 */
@Controller
@RequestMapping("/upStreamReach")
public class UpstreamReachController {

    @Autowired
    private ReachResultService reachResultService;

    @RequestMapping(method = {RequestMethod.GET}, value = "/test")
    public String test() {
        return "index";
    }

    /**
     * 触达上游
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(method = {RequestMethod.GET}, value = "/reach")
    public EJsonResult reach(@RequestParam("custIds") List<Long> custIds) {

        if (custIds == null || custIds.size() < 1) {
            return new EJsonResult(99, "请选择需要触达的线索", null);
        }

        reachResultService.insertUpReachResultByCustIds(custIds);
        return new EJsonResult("触达成功，请及时关注营销结果展示页!");
    }

    /**
     * 获取触达上游结果
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getReachResult")
    public String getReachResult(Map<String, Object> model) {
        List<ReachResultVo> reachResultVos = reachResultService.getUpReachResultVos();
        model.put("reachResultVos", reachResultVos);
        return "reachResult";
    }
    //    @ResponseBody
    //    @RequestMapping(method = RequestMethod.GET, value = "/getReachResult")
    //    public EJsonResult getReachResult(@RequestParam("custIds") List<Long> custIds) {
    //
    //        if (custIds == null) {
    //            return new EJsonResult(99, "reachResultConditionForm is null", null);
    //        }
    //        if (custIds.size() == 0) {
    //            return new EJsonResult(99, "reachResultConditionForm.getCustIds() is null", null);
    //        }
    //                List<ReachResultVo> reachResultVos = reachResultService.getReachResultVosByCustIds(custIds);
    //        return new EJsonResult(reachResultVos);

}
