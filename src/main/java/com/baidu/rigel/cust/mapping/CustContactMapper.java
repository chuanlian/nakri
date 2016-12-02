/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.mapping;

import com.baidu.rigel.cust.bo.CustContact;

/**
 * Mapper interface class for model com.baidu.rigel.cust.bo.CustContactBase
 *
 * @author BJF
 */
public interface CustContactMapper {

    /**
     * 添加联系方式
     *
     * @param custContact
     */
    void insert(CustContact custContact);

}