/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon18.bo;

import java.io.Serializable;

/**
 * This bo is map to table : tb_feed
 * Table description : FEED潜客表
 *
 * @author BJF
 */
public abstract class FeedBase implements Serializable {


    /**
     * serial Version UID.
     */
    private static final long serialVersionUID = -1L;


    private Long id;


    private String custName;


    private Long trade;


    private Long province;


    private Long city;


    private Long county;


    private Long isTuiguang;


    private Long isCompetitor;


    private Long isCall;


    private Long source;

    private Integer score;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Long getTrade() {
        return trade;
    }

    public void setTrade(Long trade) {
        this.trade = trade;
    }

    public Long getProvince() {
        return province;
    }

    public void setProvince(Long province) {
        this.province = province;
    }

    public Long getCity() {
        return city;
    }

    public void setCity(Long city) {
        this.city = city;
    }

    public Long getCounty() {
        return county;
    }

    public void setCounty(Long county) {
        this.county = county;
    }

    public Long getIsTuiguang() {
        return isTuiguang;
    }

    public void setIsTuiguang(Long isTuiguang) {
        this.isTuiguang = isTuiguang;
    }

    public Long getIsCompetitor() {
        return isCompetitor;
    }

    public void setIsCompetitor(Long isCompetitor) {
        this.isCompetitor = isCompetitor;
    }

    public Long getIsCall() {
        return isCall;
    }

    public void setIsCall(Long isCall) {
        this.isCall = isCall;
    }

    public Long getSource() {
        return source;
    }

    public void setSource(Long source) {
        this.source = source;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}