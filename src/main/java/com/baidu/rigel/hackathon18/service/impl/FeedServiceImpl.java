/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon18.service.impl;

import com.baidu.rigel.hackathon18.service.FeedService;
import com.baidu.rigel.hackathon18.vo.FeedQueryCondition;
import com.baidu.rigel.hackathon18.vo.FeedQueryVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangchuanlian on 2017/5/19.
 */
@Service("feedService")
public class FeedServiceImpl implements FeedService {

    public List<FeedQueryVo> getFeedList(FeedQueryCondition feedQueryCondition) {
        return null;
    }
}
