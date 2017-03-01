/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.mapping;

import com.baidu.rigel.jichuang.bo.Test;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by yangchuanlian on 2016/10/19.
 */
public interface TestMapper {

    List<Test> getTests();

    Test selectByPrimaryKey(Long id);

    void updateByPrimaryKey(Test test);

    Integer updateName(@Param("id") Long id, @Param("name") String name);
}
