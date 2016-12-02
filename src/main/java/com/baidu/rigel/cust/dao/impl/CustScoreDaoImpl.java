/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.dao.impl;

import com.baidu.rigel.cust.dao.CustScoreDao;
import com.baidu.rigel.cust.mapping.CustScoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Dao implement class for model : com.baidu.rigel.cust.bo.CustScoreBase
 * @author BJF
 */
@Repository("custScoreDao")
public class CustScoreDaoImpl  implements CustScoreDao {
    /**
     * DaoMapper 'custScoreMapper' reference.
     */
    @Autowired
    private CustScoreMapper custScoreMapper;


}