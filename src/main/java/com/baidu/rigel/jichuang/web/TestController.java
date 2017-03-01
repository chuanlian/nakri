/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.web;

import com.baidu.rigel.jichuang.bo.Test;
import com.baidu.rigel.jichuang.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by yangchuanlian on 2016/10/26.
 */
@Controller
@RequestMapping("/test")
public class TestController {


    @Resource(name = "testService")
    private TestService testService;

    @ResponseBody
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/updateName")
    public Object updateName(Long id, String name) {
        return testService.updateName(id, name);
    }


    @ResponseBody
    @RequestMapping(method = {RequestMethod.GET}, value = "/sayHi")
    public Object sayHi(String name) {
        return testService.sayHi(name);
    }


    @ResponseBody
    @RequestMapping(method = {RequestMethod.GET}, value = "/showInfo")
    public Object showInfo() {
        return testService.getTests();
    }

    @RequestMapping(method = {RequestMethod.GET}, value = "/showDbs")
    public String showDbs(Map<String, Object> model) {
        List<Test> tests = testService.getTests();
        model.put("testList", tests);
        return "test";
    }

}
