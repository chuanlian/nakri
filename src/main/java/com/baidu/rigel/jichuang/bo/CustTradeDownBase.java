package com.baidu.rigel.jichuang.bo;

import java.io.Serializable;

/**
 * This bo is map to table : tb_cust_trade_down
 * Table description :
 *
 * @author BJF
 */
public abstract class CustTradeDownBase implements Serializable {
    private Long id;
    private Long custId;
    private String name;
    private Long downTradeId;

    public Long getDownTradeId() {
        return downTradeId;
    }

    public void setDownTradeId(Long downTradeId) {
        this.downTradeId = downTradeId;
    }

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

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }
}