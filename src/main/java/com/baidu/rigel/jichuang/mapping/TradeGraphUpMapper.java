package com.baidu.rigel.jichuang.mapping;

import java.util.List;

import com.baidu.rigel.jichuang.bo.TradeGraphUp;

public interface TradeGraphUpMapper {

    List<TradeGraphUp> queryTradeUpByTradeId(Long id);

    void insertSelective(TradeGraphUp tradeGraphUp);
}