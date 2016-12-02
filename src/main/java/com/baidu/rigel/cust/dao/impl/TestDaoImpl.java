/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baidu.rigel.cust.bo.Test;
import com.baidu.rigel.cust.bo.TestVo;
import com.baidu.rigel.cust.dao.TestDao;
import com.baidu.rigel.cust.mapping.TestMapper;

/**
 * Created by yangchuanlian on 2016/10/19.
 */

@Repository("testDao")
public class TestDaoImpl implements TestDao {

    @Autowired
    private TestMapper testMapper;
    private long id = 1L;

    public TestVo sayHi(String name) {
        TestVo testVo = new TestVo();
        testVo.setId(123L);
        testVo.setName(name);
        testVo.setAge(45);
        return testVo;
    }

    public List<Test> getTests() {
        return testMapper.getTests();
    }

    public void markSet() {
        Test test = new Test();
        test.setId(id);
        test.setName("b");

        testMapper.updateByPrimaryKey(test);
    }

    public boolean isSet() {
        Test test = testMapper.selectByPrimaryKey(id);
        return "b".equals(test.getName());
    }

    public Integer updateName(Long id, String name) {
        return testMapper.updateName(id, name);
    }
}
