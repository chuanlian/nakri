/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.service;

import com.baidu.rigel.cust.bo.Test;
import com.baidu.rigel.cust.bo.TestVo;

import java.util.List;

/**
 * Created by yangchuanlian on 2016/10/19.
 */
public interface TestService {

    TestVo sayHi(String name);

    List<Test> getTests();

    Integer updateName(Long id, String name);

}
