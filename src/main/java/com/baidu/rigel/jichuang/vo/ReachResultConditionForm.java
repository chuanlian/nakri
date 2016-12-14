/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengweichao on 2016/10/25.
 */
public class ReachResultConditionForm {

    List<Long> custIds = new ArrayList<Long>();

    public List<Long> getCustIds() {
        return custIds;
    }

    public void setCustIds(List<Long> custIds) {
        this.custIds = custIds;
    }

}
