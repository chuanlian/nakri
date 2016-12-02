/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baidu.rigel.cust.bo.CustTradeSelf;
import com.baidu.rigel.cust.bo.Trade;
import com.baidu.rigel.cust.bo.TradeGraphCust;
import com.baidu.rigel.cust.bo.TradeGraphDown;
import com.baidu.rigel.cust.bo.TradeGraphUp;
import com.baidu.rigel.cust.dao.TradeDao;
import com.baidu.rigel.cust.mapping.CustTradeSelfMapper;
import com.baidu.rigel.cust.mapping.TradeGraphCustMapper;
import com.baidu.rigel.cust.mapping.TradeGraphDownMapper;
import com.baidu.rigel.cust.mapping.TradeGraphUpMapper;
import com.baidu.rigel.cust.mapping.TradeMapper;

/**
 * Created by zhanghu02 on 2016/10/25.
 */
@Repository("tradeDao")
public class TradeDaoImpl implements TradeDao {

    @Autowired
    private TradeMapper tradeMapper;

    @Autowired
    private CustTradeSelfMapper custTradeSelfMapper;

    @Autowired
    private TradeGraphCustMapper tradeGraphCustMapper;

    @Autowired
    private TradeGraphDownMapper tradeGraphDownMapper;

    @Autowired
    private TradeGraphUpMapper tradeGraphUpMapper;

    /**
     * 日志
     */
    private static final Logger logger = Logger.getLogger(TradeDaoImpl.class);

    public List<Trade> getAllTrade() {
        return tradeMapper.selectAll();
    }

    public String getTradeNameById(Long id) {
        return tradeMapper.selectByPrimaryKey(id).getName();
    }

    public CustTradeSelf getCustTradeById(Long id) {
        return custTradeSelfMapper.queryCustSelfById(id);
    }

    public List<TradeGraphCust> queryTradeCustByTradeId(Long id) {
        return tradeGraphCustMapper.queryTradeCustByTradeId(id);
    }

    public List<TradeGraphDown> queryTradeDownByTradeId(Long id) {
        return tradeGraphDownMapper.queryTradeDownByTradeId(id);
    }

    public List<TradeGraphUp> queryTradeUpByTradeId(Long id) {
        return tradeGraphUpMapper.queryTradeUpByTradeId(id);
    }

    public void saveTradeCust(TradeGraphCust tradeGraphCust) {
        tradeGraphCustMapper.insertSelective(tradeGraphCust);
    }

    public void saveTradeCustUp(TradeGraphUp tradeGraphUp) {
        tradeGraphUpMapper.insertSelective(tradeGraphUp);
    }

    public void saveTradeCustDown(TradeGraphDown tradeGraphDown) {
        tradeGraphDownMapper.insertSelective(tradeGraphDown);
    }

}
