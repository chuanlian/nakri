/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon18.service;

import com.baidu.rigel.hackathon18.vo.FeedQueryCondition;
import com.baidu.rigel.hackathon18.vo.FeedQueryVo;

import java.util.List;

/**
 * Created by yangchuanlian on 2017/5/19.
 */
public interface FeedService {


    List<FeedQueryVo> getFeedList(FeedQueryCondition feedQueryCondition);

}
