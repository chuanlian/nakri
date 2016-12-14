package com.baidu.rigel.jichuang.bo;

import java.io.Serializable;

/**
 * This bo is map to table : tb_trade_graph_cust
 * Table description :
 *
 * @author BJF
 */
public abstract class TradeGraphCustBase implements Serializable {
    private Long id;
    private String name;
    private Long tradeId;
    private Long custId;

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
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

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }
}