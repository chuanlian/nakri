/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baidu.rigel.jichuang.bo.Cust;
import com.baidu.rigel.jichuang.bo.CustTradeDown;
import com.baidu.rigel.jichuang.bo.CustTradeSelf;
import com.baidu.rigel.jichuang.bo.CustTradeUp;
import com.baidu.rigel.jichuang.dao.CustDao;
import com.baidu.rigel.jichuang.mapping.CustMapper;
import com.baidu.rigel.jichuang.mapping.CustTradeDownMapper;
import com.baidu.rigel.jichuang.mapping.CustTradeSelfMapper;
import com.baidu.rigel.jichuang.mapping.CustTradeUpMapper;
import com.baidu.rigel.jichuang.vo.CustQueryCondition;
import com.baidu.rigel.jichuang.vo.CustQueryVo;

/**
 * Dao implement class for model : com.baidu.rigel.jichuang.bo.CustBase
 *
 * @author BJF
 */
@Repository("custDao")
public class CustDaoImpl implements CustDao {
    /**
     * DaoMapper 'custMapper' reference.
     */
    @Autowired
    private CustMapper custMapper;

    @Autowired
    private CustTradeSelfMapper custTradeSelfMapper;

    @Autowired
    private CustTradeUpMapper custTradeUpMapper;

    @Autowired
    private CustTradeDownMapper custTradeDownMapper;

    public void addC2bCust(Cust cust) {

        custMapper.insert(cust);

    }

    /**
     * 获取客户资料列表
     *
     * @param custQueryCondition
     * @return
     */
    public Cust selectCustOne(CustQueryCondition custQueryCondition) {
        return custMapper.selectCustOne();
    }

    /**
     * 获取客户资料列表
     *
     * @param custQueryCondition
     * @return
     */
    public List<CustQueryVo> getCustList(CustQueryCondition custQueryCondition) {
        return custMapper.getCustList(custQueryCondition);
    }

    /**
     * 通过Id获取cust列表
     *
     * @param custIds
     * @return
     */
    public List<Cust> getCustsByIds(List<Long> custIds) {

        return custMapper.getCustsByIds(custIds);
    }

    /**
     * 通过Id获取cust
     *
     * @param custId
     * @return
     */
    public Cust getCustById(Long custId) {
        return custMapper.getCustById(custId);
    }

    /**
     * 从百度获取线索
     */
    public void syncUpCusts() {
        custMapper.syncUpCusts();
    }

    /**
     * 从百度获取线索
     */
    public void syncDownCusts() {
        custMapper.syncDownCusts();
    }


    public void saveCustTrade(CustTradeSelf custTradeSelf) {
        custTradeSelfMapper.insertSelective(custTradeSelf);
    }

    public void saveCustTradeUp(CustTradeUp custTradeUp) {
        custTradeUpMapper.insertSelective(custTradeUp);
    }

    public void saveCustTradeDown(CustTradeDown custTradeDown) {
        custTradeDownMapper.insertSelective(custTradeDown);
    }
}