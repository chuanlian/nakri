/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.dao;

import java.util.List;

import com.baidu.rigel.cust.bo.Test;
import com.baidu.rigel.cust.bo.TestVo;

/**
 * Created by yangchuanlian on 2016/10/19.
 */
public interface TestDao {

    TestVo sayHi(String name);

    List<Test> getTests();

    void markSet();

    boolean isSet();

    Integer updateName(Long id, String name);
}
