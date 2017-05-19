/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon18.dao;

import com.baidu.rigel.hackathon18.bo.Feed;
import com.baidu.rigel.hackathon18.vo.FeedQueryCondition;
import com.baidu.rigel.hackathon18.vo.FeedQueryVo;

import java.util.List;

/**
 * Created by yangchuanlian on 2017/5/19.
 */
public interface FeedDao {

    Feed getFeedById(Long id);

    List<Feed> getFeedList(FeedQueryCondition feedQueryCondition);
}
