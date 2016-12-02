package com.baidu.rigel.cust.bo;

import java.io.Serializable;

/**
 * This bo is map to table : tb_trade_graph_down
 * Table description :
 *
 * @author BJF
 */
public abstract class TradeGraphDownBase implements Serializable {
    private Long id;
    private String name;
    private Long tradeId;
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

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }
}