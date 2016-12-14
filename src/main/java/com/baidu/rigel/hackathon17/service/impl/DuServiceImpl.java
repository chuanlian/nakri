/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon17.service.impl;

import com.baidu.rigel.hackathon17.dao.DuDao;
import com.baidu.rigel.hackathon17.service.DuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yangchuanlian on 2016/12/14.
 */
@Service("duService")
public class DuServiceImpl implements DuService {

    @Resource(name = "duDao")
    private DuDao duDao;

    public String sayHi(String name) {
        return duDao.sayHi(name);
    }
}
