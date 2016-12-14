/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.mapping;

import com.baidu.rigel.jichuang.bo.User;

/**
 * Created by yangchuanlian on 2016/10/19.
 */
public interface UserMapper {

    User selectByPrimaryKey(Long id);

    void insertSelective(User user);

}
