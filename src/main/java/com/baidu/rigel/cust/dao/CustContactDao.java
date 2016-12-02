/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.dao;

import com.baidu.rigel.cust.bo.CustContact;

/**
 * Dao interface class for model com.baidu.rigel.cust.bo.CustContactBase
 *
 * @author BJF
 */
public interface CustContactDao {

    /**
     * 添加联系方式
     *
     * @param custContact
     */
    void insert(CustContact custContact);
}