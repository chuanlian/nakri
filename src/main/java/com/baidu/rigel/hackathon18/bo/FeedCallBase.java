/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon18.bo;

import java.io.Serializable;

/**
 * This bo is map to table : tb_feed_call
 * Table description : 通话记录表
 *
 * @author BJF
 */
public abstract class FeedCallBase implements Serializable {


    private Long id;


    private Long feedId;


    private Long callTime;


    private Long callRate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFeedId() {
        return feedId;
    }

    public void setFeedId(Long feedId) {
        this.feedId = feedId;
    }

    public Long getCallTime() {
        return callTime;
    }

    public void setCallTime(Long callTime) {
        this.callTime = callTime;
    }

    public Long getCallRate() {
        return callRate;
    }

    public void setCallRate(Long callRate) {
        this.callRate = callRate;
    }
}