/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon17.service;

/**
 * Created by yangchuanlian on 2016/12/14.
 */
public interface DuService {

    String sayHi(String name);

    /**
     * 根据问题返回答案
     *
     * @param question
     * @return
     */
    String askQuestions(String question);
}
