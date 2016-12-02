/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.dao.impl;

import com.baidu.rigel.cust.bo.CustContact;
import com.baidu.rigel.cust.dao.CustContactDao;
import com.baidu.rigel.cust.mapping.CustContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Dao implement class for model : com.baidu.rigel.cust.bo.CustContactBase
 *
 * @author BJF
 */
@Repository(value = "custContactDao")
public class CustContactDaoImpl implements CustContactDao {


    @Autowired
    private CustContactMapper custContactMapper;

    public void test() {

    }

    /**
     * 添加联系方式
     *
     * @param custContact
     */
    public void insert(CustContact custContact) {
        custContactMapper.insert(custContact);
    }
}