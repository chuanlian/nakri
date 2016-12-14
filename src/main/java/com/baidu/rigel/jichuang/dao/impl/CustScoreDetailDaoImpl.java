/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.dao.impl;

import com.baidu.rigel.jichuang.bo.CustScoreDetail;
import com.baidu.rigel.jichuang.dao.CustScoreDetailDao;
import com.baidu.rigel.jichuang.mapping.CustScoreDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Dao implement class for model : com.baidu.rigel.jichuang.bo.CustScoreDetailBase
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