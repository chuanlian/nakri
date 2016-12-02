package com.baidu.rigel.cust.mapping;

import java.util.List;

import com.baidu.rigel.cust.bo.Trade;

public interface TradeMapper {

    List<Trade> selectAll();

    Trade selectByPrimaryKey(Long id);
}