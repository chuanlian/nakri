/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.service.impl;

import com.baidu.rigel.cust.bo.Test;
import com.baidu.rigel.cust.bo.TestVo;
import com.baidu.rigel.cust.dao.TestDao;
import com.baidu.rigel.cust.service.TestService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yangchuanlian on 2016/10/19.
 */
@Service("testService")
public class TestServiceImpl implements TestService {

    private static final Logger LOGGER = Logger.getLogger(TestServiceImpl.class);

    @Resource(name = "testDao")
    private TestDao testDao;

    public TestVo sayHi(String name) {
        return testDao.sayHi(name);
    }

    public List<Test> getTests() {
        return testDao.getTests();
    }

    public Integer updateName(Long id, String name) {
        return testDao.updateName(id, name);
    }
}
