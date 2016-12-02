package com.baidu.rigel.cust.bo;

import java.io.Serializable;

/**
 * This bo is map to table : tb_cust_trade_self
 * Table description :
 *
 * @author BJF
 */
public abstract class CustTradeSelfBase implements Serializable {
    private Long id;
    private Long custId;
    private String name;
    private Long tradeId;

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

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }
}