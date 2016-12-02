/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.vo;

import java.util.List;

/**
 * Created by zhanghu02 on 2016/10/28.
 */
public class CustTradeForm {

    private Long custId;
    private Long tradeId;
    private List<Long> upTrades;
    private List<Long> downTrades;

    public List<Long> getDownTrades() {
        return downTrades;
    }

    public void setDownTrades(List<Long> downTrades) {
        this.downTrades = downTrades;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public List<Long> getUpTrades() {
        return upTrades;
    }

    public void setUpTrades(List<Long> upTrades) {
        this.upTrades = upTrades;
    }
}
