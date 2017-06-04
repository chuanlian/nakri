/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang2.web;

import com.baidu.rigel.jichuang2.service.Jichuang2Service;
import com.baidu.rigel.jichuang2.vo.FeedCustVo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by yangchuanlian on 2017/5/19.
 */
@RequestMapping("/jichuang2")
@Controller
public class Jichuang2FeedController {

    /**
     * log for this class
     */
    private static final Logger LOGGER = Logger.getLogger(Jichuang2FeedController.class);


    @Resource(name = "jichuang2Service")
    private Jichuang2Service jichuang2Service;


    /**
     * 首页
     *
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/showPortal")
    public String showPortal() {
        return "feedPortal";
    }


    /**
     * 分析计算过度页
     *
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/analysis")
    public String analysis() {
        return "feedAnalysis2";
    }

    /**
     * 分析计算过度页
     *
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/analysis2")
    public String analysis2() {
        return "feedAnalysis2";
    }


    /**
     * 匹配的企业
     *
     * @param model
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/matchFeedList")
    public String showMatchFeed(Map<String, Object> model) {
        String recommended = getRecommended();
        model.put("recommended", recommended);
        List<FeedCustVo> feedCustVos = getFeedCustVos();
        model.put("feedList", feedCustVos);
        return "matchFeedList";
    }

    private String getRecommended() {
        return "培训、旅游、酒店、机票、电子产品、游戏";
    }

    /**
     * FEED客户信息
     *
     * @return
     */
    private List<FeedCustVo> getFeedCustVos() {
        List<FeedCustVo> feedCustVos = new ArrayList<FeedCustVo>();

        FeedCustVo feedCustVo1 = new FeedCustVo();
        feedCustVo1.setCompanyName("北京万学教育科技有限公司");
        feedCustVo1.setTrade("教育培训_休闲培训");
        feedCustVo1.setAddress("北京_北京");
        feedCustVo1.setContact("任小宏(13601229020,010-82487315)");
        feedCustVo1.setStar(5);
        feedCustVos.add(feedCustVo1);

        FeedCustVo feedCustVo2 = new FeedCustVo();
        feedCustVo2.setCompanyName("深圳市海洋国际旅行社有限公司");
        feedCustVo2.setTrade("旅游及票务_旅游");
        feedCustVo2.setAddress("广东_深圳");
        feedCustVo2.setContact("陈小寒(13510686834, 075583997023)");
        feedCustVo2.setStar(5);
        feedCustVos.add(feedCustVo2);

        FeedCustVo feedCustVo3 = new FeedCustVo();
        feedCustVo3.setCompanyName("鞍山市新东方培训学校");
        feedCustVo3.setTrade("教育培训_语言培训");
        feedCustVo3.setAddress("辽宁_鞍山");
        feedCustVo3.setContact("齐小姐(15084035290)");
        feedCustVo3.setStar(4);
        feedCustVos.add(feedCustVo3);

        FeedCustVo feedCustVo4 = new FeedCustVo();
        feedCustVo4.setCompanyName("西安成才高考补习培训中心");
        feedCustVo4.setTrade("教育培训_高教自考");
        feedCustVo4.setAddress("陕西_西安");
        feedCustVo4.setContact("刘老师(029-18691858857)");
        feedCustVo4.setStar(4);
        feedCustVos.add(feedCustVo4);

        FeedCustVo feedCustVo5 = new FeedCustVo();
        feedCustVo5.setCompanyName("厦门极致互动网络技术股份有限公司");
        feedCustVo5.setTrade("软件游戏_游戏");
        feedCustVo5.setAddress("福建_厦门");
        feedCustVo5.setContact("陈博翔(0592-3167501)");
        feedCustVo5.setStar(4);
        feedCustVos.add(feedCustVo5);

        FeedCustVo feedCustVo6 = new FeedCustVo();
        feedCustVo6.setCompanyName("深圳市豆悦网络科技有限公司");
        feedCustVo6.setTrade("软件游戏_游戏");
        feedCustVo6.setAddress("广东_深圳");
        feedCustVo6.setContact("瞿柳(18666019216)");
        feedCustVo6.setStar(4);
        feedCustVos.add(feedCustVo6);
//
//        FeedCustVo feedCustVo7 = new FeedCustVo();
//        feedCustVo7.setCompanyName("北京喜乐网络科技有限公司");
//        feedCustVo7.setTrade("电脑硬件");
//        feedCustVo7.setAddress("北京_北京");
//        feedCustVo7.setContact("李先生(13790876755)");
//        feedCustVo7.setStar(3);
//        feedCustVos.add(feedCustVo7);
//
//        FeedCustVo feedCustVo8 = new FeedCustVo();
//        feedCustVo8.setCompanyName("北京喜乐网络科技有限公司");
//        feedCustVo8.setTrade("电脑硬件");
//        feedCustVo8.setAddress("北京_北京");
//        feedCustVo8.setContact("李先生(13790876755)");
//        feedCustVo8.setStar(3);
//        feedCustVos.add(feedCustVo8);
//
//        FeedCustVo feedCustVo9 = new FeedCustVo();
//        feedCustVo9.setCompanyName("北京喜乐网络科技有限公司");
//        feedCustVo9.setTrade("电脑硬件");
//        feedCustVo9.setAddress("北京_北京");
//        feedCustVo9.setContact("李先生(13790876755)");
//        feedCustVo9.setStar(2);
//        feedCustVos.add(feedCustVo9);
//
//        FeedCustVo feedCustVo10 = new FeedCustVo();
//        feedCustVo10.setCompanyName("北京喜乐网络科技有限公司");
//        feedCustVo10.setTrade("电脑硬件");
//        feedCustVo10.setAddress("北京_北京");
//        feedCustVo10.setContact("李先生(13790876755)");
//        feedCustVo10.setStar(2);
//        feedCustVos.add(feedCustVo10);
//
//        FeedCustVo feedCustVo11 = new FeedCustVo();
//        feedCustVo11.setCompanyName("北京喜乐网络科技有限公司");
//        feedCustVo11.setTrade("电脑硬件");
//        feedCustVo11.setAddress("北京_北京");
//        feedCustVo11.setContact("李先生(13790876755)");
//        feedCustVo11.setStar(2);
//        feedCustVos.add(feedCustVo11);
        return feedCustVos;
    }
}
