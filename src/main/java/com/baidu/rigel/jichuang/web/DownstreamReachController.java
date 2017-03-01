/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.rigel.jichuang.service.ReachResultService;
import com.baidu.rigel.jichuang.util.EJsonResult;
import com.baidu.rigel.jichuang.vo.ReachResultVo;

/**
 * Created by zhengweichao on 2016/10/22.
 */
@RequestMapping("/downStreamReach")
@Controller
public class DownstreamReachController {

    @Autowired
    private ReachResultService reachResultService;

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

        reachResultService.insertDownReachResultByCustIds(custIds);
        return new EJsonResult("触达成功，请及时关注营销结果展示页!");
    }

    /**
     * 获取触达上游结果
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/getReachResult")
    public EJsonResult getReachResult() {
        List<ReachResultVo> reachResultVos = reachResultService.getDownReachResultVos();
        return new EJsonResult(reachResultVos);
    }
}
