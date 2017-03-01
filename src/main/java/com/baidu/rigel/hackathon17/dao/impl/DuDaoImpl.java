/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon17.dao.impl;

import com.baidu.rigel.hackathon17.dao.DuDao;
import com.baidu.rigel.hackathon17.mapping.DuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by yangchuanlian on 2016/12/14.
 */
@Repository(value = "duDao")
public class DuDaoImpl implements DuDao {

    //    @Autowired
    //    private DuMapper duMapper;

    public String sayHi(String name) {
        return "Hi," + name;
    }
}
