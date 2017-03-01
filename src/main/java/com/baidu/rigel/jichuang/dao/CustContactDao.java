/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.dao;

import com.baidu.rigel.jichuang.bo.CustContact;

/**
 * Dao interface class for model com.baidu.rigel.jichuang.bo.CustContactBase
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