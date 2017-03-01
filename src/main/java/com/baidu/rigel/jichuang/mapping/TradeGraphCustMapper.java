package com.baidu.rigel.jichuang.mapping;

import java.util.List;

import com.baidu.rigel.jichuang.bo.TradeGraphCust;

public interface TradeGraphCustMapper {

    List<TradeGraphCust> queryTradeCustByTradeId(Long id);

    void insertSelective(TradeGraphCust tradeGraphCust);
}