/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon18.service.impl;

import com.baidu.rigel.hackathon18.bo.Feed;
import com.baidu.rigel.hackathon18.dao.FeedDao;
import com.baidu.rigel.hackathon18.service.FeedService;
import com.baidu.rigel.hackathon18.vo.FeedQueryCondition;
import com.baidu.rigel.hackathon18.vo.FeedQueryVo;
import org.apache.commons.lang3.StringUtils;
import org.apache.lucene.util.StringHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangchuanlian on 2017/5/19.
 */
@Service("feedService")
public class FeedServiceImpl implements FeedService {

    @Resource(name = "feedDao")
    private FeedDao feedDao;

    public List<FeedQueryVo> getFeedList(FeedQueryCondition feedQueryCondition) {
        List<FeedQueryVo> feedQueryVos = new ArrayList<FeedQueryVo>();
        List<Feed> feeds = feedDao.getFeedList(feedQueryCondition);
        for (Feed feed : feeds) {
            FeedQueryVo feedQueryVo = new FeedQueryVo();
            feedQueryVo.setCompanyName(feed.getCustName());
            feedQueryVo.setTrade(getTrade(feed.getTrade()));
            feedQueryVo.setAddress(getProName(feed.getProvince()) + "_" + getCityName(feed.getCity()) + "_" + getAreaName(feed.getCounty()));
            feedQueryVo.setIsTuiguang(feed.getIsTuiguang().intValue());
            feedQueryVo.setIsCompetitor(feed.getIsCompetitor().intValue());
            feedQueryVo.setIsCall(feed.getIsCall().intValue());
            feedQueryVo.setScore(feed.getScore().intValue());
            feedQueryVos.add(feedQueryVo);
        }
        return feedQueryVos;
    }

    private String getTrade(Long tradeId) {
        String tradeName = "";
        if (tradeId.intValue() == 1) {
            tradeName = "办公文教";
        }
        if (tradeId.intValue() == 2) {
            tradeName = "电脑硬件";
        }
        if (tradeId.intValue() == 3) {
            tradeName = "广播通讯";
        }
        if (tradeId.intValue() == 4) {
            tradeName = "机械设备";
        }
        if (tradeId.intValue() == 5) {
            tradeName = "交通运输";
        }
        return tradeName;
    }


    private String getProName(Long provId) {
        String provName = "";
        if (provId.intValue() == 1) {
            provName = "北京";
        }
        if (provId.intValue() == 2) {
            provName = "上海";
        }
        if (provId.intValue() == 3) {
            provName = "天津";
        }
        return provName;
    }

    private String getCityName(Long cityId) {
        String cityName = "";
        if (cityId.intValue() == 38) {
            cityName = "北京";
        }
        if (cityId.intValue() == 39) {
            cityName = "上海";
        }
        if (cityId.intValue() == 40) {
            cityName = "天津";
        }
        return cityName;
    }

    private String getAreaName(Long areaId) {
        String areaName = "";
        if (areaId.intValue() == 38) {
            areaName = "北京";
        }
        if (areaId.intValue() == 39) {
            areaName = "上海";
        }
        if (areaId.intValue() == 40) {
            areaName = "天津";
        }
        return areaName;
    }
}
