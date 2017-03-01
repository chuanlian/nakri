/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.dao;

import java.util.List;

import com.baidu.rigel.jichuang.bo.Cust;
import com.baidu.rigel.jichuang.bo.CustTradeSelf;
import com.baidu.rigel.jichuang.bo.CustTradeUp;
import com.baidu.rigel.jichuang.bo.CustTradeDown;

import com.baidu.rigel.jichuang.vo.CustQueryCondition;
import com.baidu.rigel.jichuang.vo.CustQueryVo;

/**
 * Dao interface class for model com.baidu.rigel.jichuang.bo.CustBase
 *
 * @author BJF
 */
public interface CustDao {
    void addC2bCust(Cust cust);

    /**
     * 获取客户资料列表
     *
     * @param custQueryCondition
     * @return
     */
    Cust selectCustOne(CustQueryCondition custQueryCondition);

    /**
     * 获取客户资料列表
     *
     * @param custQueryCondition
     * @return
     */
    List<CustQueryVo> getCustList(CustQueryCondition custQueryCondition);

    /**
     * 从百度获取线索
     */
    void syncUpCusts();

    /**
     * 从百度获取线索
     */
    void syncDownCusts();

    void saveCustTrade(CustTradeSelf custTradeSelf);

    void saveCustTradeUp(CustTradeUp custTradeUp);

    void saveCustTradeDown(CustTradeDown custTradeDown);

    /**
     * 通过Id获取cust列表
     *
     * @param custIds
     * @return
     */
    List<Cust> getCustsByIds(List<Long> custIds);

    /**
     * 通过Id获取cust
     *
     * @param custId
     * @return
     */
    Cust getCustById(Long custId);
}