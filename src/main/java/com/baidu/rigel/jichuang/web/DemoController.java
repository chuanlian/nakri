/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.web;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhanghu02 on 2016/10/29.
 */
@RequestMapping("/demo")
@Controller
public class DemoController {

    /**
     * 日志
     */
    private static final Logger logger = Logger.getLogger(DemoController.class);

    /**
     * 查询客户资料初始化
     *
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET}, value = "/tuopu")
    public String init() {
        return "tuopu";
    }

}
