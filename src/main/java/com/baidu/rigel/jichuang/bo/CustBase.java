/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.bo;

import java.io.Serializable;

/**
 * This bo is map to table : tb_cust
 * Table description : 3.1.1客户主表
 *
 * @author BJF
 */
public abstract class CustBase implements Serializable {

    private Long id;


    private Long custCategory;


    private String custName;


    private Long custType;


    private Long source;


    private Long trade;


    private String addr;


    private Long status;


    private Long score;


    private String remark;


    private Long owner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustCategory() {
        return custCategory;
    }

    public void setCustCategory(Long custCategory) {
        this.custCategory = custCategory;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Long getCustType() {
        return custType;
    }

    public void setCustType(Long custType) {
        this.custType = custType;
    }

    public Long getSource() {
        return source;
    }

    public void setSource(Long source) {
        this.source = source;
    }

    public Long getTrade() {
        return trade;
    }

    public void setTrade(Long trade) {
        this.trade = trade;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getOwner() {
        return owner;
    }

    public void setOwner(Long owner) {
        this.owner = owner;
    }
}