/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.web;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.rigel.cust.bo.Cust;
import com.baidu.rigel.cust.bo.CustContact;
import com.baidu.rigel.cust.service.CustService;
import com.baidu.rigel.cust.util.EJsonResult;

/**
 * Created by zhengweichao on 2016/10/28.
 */
@Controller
@RequestMapping("/custController")
public class CustController {

    @Autowired
    CustService custService;

    @ResponseBody
    @RequestMapping(method = {RequestMethod.GET}, value = "/sayHi")
    public Object sayHi(String name) {
        return 123;
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/addC2bCust")
    public EJsonResult addC2bCust(Cust cust, CustContact custContact) {

        if (cust == null || StringUtils.isBlank(cust.getCustName())) {
            return new EJsonResult(99, "您录入的客户名为空", null);
        }
        if (custContact == null || StringUtils.isBlank(custContact.getContactInfo())) {
            return new EJsonResult(99, "您录入的电话为空", null);
        }

        try {
            Long.valueOf(custContact.getContactInfo());
        } catch (NumberFormatException e) {
            return new EJsonResult(99, "请检查您输入的电话是否正确", null);
        }

        custService.addC2bCust(cust, custContact);

        return new EJsonResult("我们已经收到您的信息，我们会选择满足要求的最优秀客户联系您！");
    }


    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/baiduSearch")
    public String baiduSearch() {

        return "baiduSearch";
    }
}
