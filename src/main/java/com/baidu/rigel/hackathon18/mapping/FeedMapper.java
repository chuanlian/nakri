/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon18.mapping;

import com.baidu.rigel.hackathon18.bo.Feed;
import com.baidu.rigel.hackathon18.vo.FeedQueryCondition;
import com.baidu.rigel.hackathon18.vo.FeedQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by yangchuanlian on 2017/5/19.
 */
public interface FeedMapper {

    Feed getFeedById(@Param("id") Long id);

    List<Feed> getFeedList(FeedQueryCondition feedQueryCondition);
}
