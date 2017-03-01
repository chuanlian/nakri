/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.mapping;

import com.baidu.rigel.jichuang.bo.CustContact;

/**
 * Mapper interface class for model com.baidu.rigel.jichuang.bo.CustContactBase
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