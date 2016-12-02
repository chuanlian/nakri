/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.dao.impl;

import com.baidu.rigel.cust.dao.CustTagDao;
import com.baidu.rigel.cust.mapping.CustTagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Dao implement class for model : com.baidu.rigel.cust.bo.CustTagBase
 * @author BJF
 */
@Repository("custTagDao")
public class CustTagDaoImpl  implements CustTagDao {

    /**
     * DaoMapper 'custTagMapper' reference.
     */
    @Autowired
    private CustTagMapper custTagMapper;


}