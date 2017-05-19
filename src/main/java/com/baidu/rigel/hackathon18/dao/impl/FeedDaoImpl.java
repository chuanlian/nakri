/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon18.dao.impl;

import com.baidu.rigel.hackathon18.bo.Feed;
import com.baidu.rigel.hackathon18.dao.FeedDao;
import com.baidu.rigel.hackathon18.mapping.FeedMapper;
import com.baidu.rigel.hackathon18.vo.FeedQueryCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yangchuanlian on 2017/5/19.
 */
@Repository(value = "feedDao")
public class FeedDaoImpl implements FeedDao {

    @Autowired
    private FeedMapper feedMapper;

    public Feed getFeedById(Long id) {
        return feedMapper.getFeedById(id);
    }

    public List<Feed> getFeedList(FeedQueryCondition feedQueryCondition) {
        return feedMapper.getFeedList(feedQueryCondition);
    }
}
