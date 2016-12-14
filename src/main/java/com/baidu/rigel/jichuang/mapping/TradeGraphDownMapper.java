package com.baidu.rigel.jichuang.mapping;

import java.util.List;

import com.baidu.rigel.jichuang.bo.TradeGraphDown;

public interface TradeGraphDownMapper {

    List<TradeGraphDown> queryTradeDownByTradeId(Long id);

    void insertSelective(TradeGraphDown tradeGraphDown);
}