/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.bo;

import java.io.Serializable;

/**
 * This bo is map to table : tb_cust_score
 * Table description : 3.2.1积分主表
 *
 * @author BJF
 */
public abstract class CustScoreBase implements Serializable {

    private Long id;


    private Long custId;


    private Long totalLintegral;


    private Long effectiveLintegral;


    private Long consumedLintegral;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Long getTotalLintegral() {
        return totalLintegral;
    }

    public void setTotalLintegral(Long totalLintegral) {
        this.totalLintegral = totalLintegral;
    }

    public Long getEffectiveLintegral() {
        return effectiveLintegral;
    }

    public void setEffectiveLintegral(Long effectiveLintegral) {
        this.effectiveLintegral = effectiveLintegral;
    }

    public Long getConsumedLintegral() {
        return consumedLintegral;
    }

    public void setConsumedLintegral(Long consumedLintegral) {
        this.consumedLintegral = consumedLintegral;
    }
}