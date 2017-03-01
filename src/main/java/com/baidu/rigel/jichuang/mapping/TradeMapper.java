package com.baidu.rigel.jichuang.mapping;

import java.util.List;

import com.baidu.rigel.jichuang.bo.Trade;

public interface TradeMapper {

    List<Trade> selectAll();

    Trade selectByPrimaryKey(Long id);
}