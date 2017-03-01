/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.service;

import com.baidu.rigel.jichuang.bo.Cust;
import com.baidu.rigel.jichuang.bo.CustContact;

import com.baidu.rigel.jichuang.vo.CustQueryCondition;
import com.baidu.rigel.jichuang.vo.CustQueryVo;

import java.util.List;

/**
 * Service interface class for model com.baidu.rigel.jichuang.bo.CustBase
 *
 * @author BJF
 */
public interface CustService {

    /**
     * 录入单条资料
     */
    void addSelfCust(CustQueryCondition custQueryCondition);

    /**
     * 增加c2b客户
     *
     * @param cust
     * @param custContact
     */
    void addC2bCust(Cust cust, CustContact custContact);

    /**
     * 获取客户资料列表
     *
     * @param custQueryCondition
     * @return
     */
    List<CustQueryVo> getCustList(CustQueryCondition custQueryCondition);

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


    /**
     * 从百度获取线索
     */
    void syncUpCusts();

    /**
     * 从百度获取线索
     */
    void syncDownCusts();

}