/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon18.web;

import com.baidu.rigel.hackathon18.service.FeedService;
import com.baidu.rigel.hackathon18.vo.FeedQueryCondition;
import com.baidu.rigel.hackathon18.vo.FeedQueryVo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
            List<FeedQueryVo> queryVos = feedService.getFeedList(feedQueryCondition);
            model.put("custList", queryVos);
        } catch (Exception ex) {
            LOGGER.error("queryCusts error", ex);
        }
        return "feedListInit";
    }
}
