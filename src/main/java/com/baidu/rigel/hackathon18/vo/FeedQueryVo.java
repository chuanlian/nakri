/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon18.vo;

import java.io.Serializable;

/**
 * Created by yangchuanlian on 2017/5/19.
 */
public class FeedQueryVo implements Serializable {

    private Long id;

    private String companyName;

    private String trade;

    private String address;

    private Integer isCall;

    private Integer isTuiguang;

    private Integer isCompetitor;

    private Integer score;

    private String fromSource;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getIsCall() {
        return isCall;
    }

    public void setIsCall(Integer isCall) {
        this.isCall = isCall;
    }

    public Integer getIsTuiguang() {
        return isTuiguang;
    }

    public void setIsTuiguang(Integer isTuiguang) {
        this.isTuiguang = isTuiguang;
    }

    public Integer getIsCompetitor() {
        return isCompetitor;
    }

    public void setIsCompetitor(Integer isCompetitor) {
        this.isCompetitor = isCompetitor;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getFromSource() {
        return fromSource;
    }

    public void setFromSource(String fromSource) {
        this.fromSource = fromSource;
    }
}
