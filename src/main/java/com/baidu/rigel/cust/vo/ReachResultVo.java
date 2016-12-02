/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.vo;

import com.baidu.rigel.cust.bo.ReachResult;

/**
 * Created by zhengweichao on 2016/10/28.
 */
public class ReachResultVo extends ReachResult {
    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    private String custName;

}
