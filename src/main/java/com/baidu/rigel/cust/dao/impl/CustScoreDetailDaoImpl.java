/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.dao.impl;

import com.baidu.rigel.cust.bo.CustScoreDetail;
import com.baidu.rigel.cust.dao.CustScoreDetailDao;
import com.baidu.rigel.cust.mapping.CustScoreDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Dao implement class for model : com.baidu.rigel.cust.bo.CustScoreDetailBase
 *
 * @author BJF
 */
@Repository("custScoreDetailDao")
public class CustScoreDetailDaoImpl implements CustScoreDetailDao {

    /**
     * DaoMapper 'custScoreDetailMapper' reference.
     */
    @Autowired
    private CustScoreDetailMapper custScoreDetailMapper;

    public void insert(CustScoreDetail custScoreDetail) {
        custScoreDetailMapper.insert(custScoreDetail);
    }

    public CustScoreDetail selectByOne() {
        return custScoreDetailMapper.selectByOne();
    }

    public List<CustScoreDetail> getCustScoreDetails() {
        return custScoreDetailMapper.getCustScoreDetails();
    }
}