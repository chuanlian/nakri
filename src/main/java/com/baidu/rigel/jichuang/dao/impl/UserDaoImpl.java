/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baidu.rigel.jichuang.dao.UserDao;
import com.baidu.rigel.jichuang.mapping.UserMapper;

/**
 * Created by zhanghu02 on 2016/10/29.
 */
@Service("userDao")
public class UserDaoImpl implements UserDao {

    /**
     * 日志
     */
    private static final Logger logger = Logger.getLogger(UserDaoImpl.class);

    @Autowired
    private UserMapper userMapper;

    public String getUserNameById(Long id) {
        return userMapper.selectByPrimaryKey(id).getName();
    }
}
