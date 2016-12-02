package com.baidu.rigel.cust.mapping;

import java.util.List;

import com.baidu.rigel.cust.bo.TradeGraphDown;

public interface TradeGraphDownMapper {

    List<TradeGraphDown> queryTradeDownByTradeId(Long id);

    void insertSelective(TradeGraphDown tradeGraphDown);
}