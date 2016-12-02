/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.vo;

import java.io.Serializable;

/**
 * Created by yangchuanlian on 2016/10/28.
 */
public class CustQueryCondition implements Serializable {

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 公司种类
     */
    private Integer custCategory;

    /**
     * 行业
     */
    private Long trade;

    /**
     * 客户类型
     */
    private Integer custType;

    /**
     * 客户来源
     */
    private Integer source;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getCustCategory() {
        return custCategory;
    }

    public void setCustCategory(Integer custCategory) {
        this.custCategory = custCategory;
    }

    public Long getTrade() {
        return trade;
    }

    public void setTrade(Long trade) {
        this.trade = trade;
    }

    public Integer getCustType() {
        return custType;
    }

    public void setCustType(Integer custType) {
        this.custType = custType;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }
}
