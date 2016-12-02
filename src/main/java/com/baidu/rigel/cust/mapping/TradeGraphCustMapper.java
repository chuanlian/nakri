package com.baidu.rigel.cust.mapping;

import java.util.List;

import com.baidu.rigel.cust.bo.TradeGraphCust;

public interface TradeGraphCustMapper {

    List<TradeGraphCust> queryTradeCustByTradeId(Long id);

    void insertSelective(TradeGraphCust tradeGraphCust);
}