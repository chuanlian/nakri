/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.mapping;

import com.baidu.rigel.cust.bo.User;

/**
 * Created by yangchuanlian on 2016/10/19.
 */
public interface UserMapper {

    User selectByPrimaryKey(Long id);

    void insertSelective(User user);

}
