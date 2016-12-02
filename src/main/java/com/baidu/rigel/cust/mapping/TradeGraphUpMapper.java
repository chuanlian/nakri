package com.baidu.rigel.cust.mapping;

import java.util.List;

import com.baidu.rigel.cust.bo.TradeGraphUp;

public interface TradeGraphUpMapper {

    List<TradeGraphUp> queryTradeUpByTradeId(Long id);

    void insertSelective(TradeGraphUp tradeGraphUp);
}