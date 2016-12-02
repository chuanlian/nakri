/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.vo;

import java.io.Serializable;

/**
 * Created by yangchuanlian on 2016/10/28.
 */
public class CustQueryVo implements Serializable {

    /**
     * 客户资料id
     */
    private Long custId;
    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 公司种类
     */
    private Integer custCategory;

    /**
     * 公司种类
     */
    private String custCategoryDesc;


    /**
     * 行业
     */
    private Long trade;

    /**
     * 行业描述
     */
    private String tradeDesc;

    /**
     * 客户类型
     */
    private Integer custType;

    /**
     * 客户类型描述
     */
    private String custTypeDesc;

    /**
     * 客户来源
     */
    private Integer source;

    /**
     * 客户来源描述
     */
    private String sourceDesc;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 状态描述
     */
    private String statusDesc;

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

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

    public String getTradeDesc() {
        return tradeDesc;
    }

    public void setTradeDesc(String tradeDesc) {
        this.tradeDesc = tradeDesc;
    }

    public Integer getCustType() {
        return custType;
    }

    public void setCustType(Integer custType) {
        this.custType = custType;
    }

    public String getCustTypeDesc() {
        return custTypeDesc;
    }

    public void setCustTypeDesc(String custTypeDesc) {
        this.custTypeDesc = custTypeDesc;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getSourceDesc() {
        return sourceDesc;
    }

    public void setSourceDesc(String sourceDesc) {
        this.sourceDesc = sourceDesc;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public String getCustCategoryDesc() {
        return custCategoryDesc;
    }

    public void setCustCategoryDesc(String custCategoryDesc) {
        this.custCategoryDesc = custCategoryDesc;
    }
}
