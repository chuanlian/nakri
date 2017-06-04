/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang2.vo;

import java.io.Serializable;

/**
 * Created by yangchuanlian on 2017/6/4.
 */
public class FeedCustVo implements Serializable {

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 行业
     */
    private String trade;

    /**
     * 地域
     */
    private String address;

    /**
     *
     */
    private String contact;

    /**
     * 推荐指数
     */
    private Integer star;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }
}
