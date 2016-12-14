/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon17.service.impl;

import com.baidu.rigel.hackathon17.dao.DuDao;
import com.baidu.rigel.hackathon17.service.DuService;
import com.baidu.rigel.hackathon17.utils.PropertyUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

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

    /**
     * 根据问题返回答案
     *
     * @param question
     * @return
     */
    public String askQuestions(String question) {
        Assert.notNull(question, "请输入问题");
        String answer = PropertyUtil.getProperty(question);
        return answer;
    }

    public static void main(String[] args) {
        try {
            System.out.println(PropertyUtil.getProperty("1"));
        } catch (Exception ex) {

        }
    }
}
