/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.web;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yangchuanlian on 2016/10/30.
 */
@RequestMapping("/touch")
@Controller
public class TouchController {


    /**
     * log for this class
     */
    private static final Logger LOGGER = Logger.getLogger(TouchController.class);

    /**
     * 录入客户资料
     *
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET}, value = "/touchDetail")
    public String touchDetail() {
        return "touchDetail";
    }
}
