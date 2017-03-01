/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.baidu.rigel.jichuang.dao.TestDao;

/**
 * Created by yangchuanlian on 2016/10/19.
 */
@Controller
public class HomeController {

    @Autowired
    private TestDao testDao;
    

    @RequestMapping(method = {RequestMethod.GET}, value = "/test")
    public String test() {
        return "test";
    }

    @RequestMapping(method = {RequestMethod.GET}, value = "/showHome")
    public String home() {
        return testDao.isSet() ? "mycharts" : "addMyTrade";
    }

}
