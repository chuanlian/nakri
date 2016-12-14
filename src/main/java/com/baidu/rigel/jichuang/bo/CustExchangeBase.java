/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.bo;

import java.io.Serializable;

/**
 * This bo is map to table : tb_cust_exchange
 * Table description : 3.2.3积分换客户配置表
 *
 * @author BJF
 */
public abstract class CustExchangeBase implements Serializable {

    private Long id;


    private Long type;

    private Long lintegral;

    private Long custNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getLintegral() {
        return lintegral;
    }

    public void setLintegral(Long lintegral) {
        this.lintegral = lintegral;
    }

    public Long getCustNum() {
        return custNum;
    }

    public void setCustNum(Long custNum) {
        this.custNum = custNum;
    }
}