/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.dao.impl;

import com.baidu.rigel.jichuang.dao.CustExchangeDao;
import com.baidu.rigel.jichuang.mapping.CustExchangeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Dao implement class for model : com.baidu.rigel.jichuang.bo.CustExchangeBase
 * @author BJF
 */
@Repository("custExchangeDao")
public class CustExchangeDaoImpl implements CustExchangeDao {
    /**
     * DaoMapper 'custExchangeMapper' reference.
     */
    @Autowired
    private CustExchangeMapper custExchangeMapper;


}