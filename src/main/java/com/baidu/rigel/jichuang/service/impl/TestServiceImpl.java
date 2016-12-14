/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.service.impl;

import com.baidu.rigel.jichuang.bo.Test;
import com.baidu.rigel.jichuang.bo.TestVo;
import com.baidu.rigel.jichuang.dao.TestDao;
import com.baidu.rigel.jichuang.service.TestService;
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
