/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon18.service.impl;

import com.baidu.rigel.hackathon18.bo.Feed;
import com.baidu.rigel.hackathon18.dao.FeedDao;
import com.baidu.rigel.hackathon18.service.FeedService;
import com.baidu.rigel.hackathon18.vo.FeedQueryCondition;
import com.baidu.rigel.hackathon18.vo.FeedQueryVo;
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
            feedQueryVo.setTrade(feed.getTrade() + "");
            feedQueryVo.setAddress(feed.getProvince() + "_" + feed.getCity() + "_" + feed.getCounty());
            feedQueryVo.setIsTuiguang(feed.getIsTuiguang().intValue());
            feedQueryVo.setIsCompetitor(feed.getIsCompetitor().intValue());
            feedQueryVo.setIsCall(feed.getIsCall().intValue());
            feedQueryVo.setScore(feed.getScore().intValue());
            feedQueryVos.add(feedQueryVo);
        }
        return feedQueryVos;
    }
}
