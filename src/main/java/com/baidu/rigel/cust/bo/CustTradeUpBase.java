package com.baidu.rigel.cust.bo;

import java.io.Serializable;

/**
 * This bo is map to table : tb_cust_trade_up
 * Table description :
 *
 * @author BJF
 */
public abstract class CustTradeUpBase implements Serializable {
    private Long id;
    private Long custId;
    private String name;
    private Long upTradeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUpTradeId() {
        return upTradeId;
    }

    public void setUpTradeId(Long upTradeId) {
        this.upTradeId = upTradeId;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }
}