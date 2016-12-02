/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.web;

import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;

/**
 * Created by zhanghu02 on 2016/10/29.
 */
public class TradeControllerTest {

    TradeController tradeController = new TradeController();

    @Test
    public void testReanow() throws Exception {
        List<Integer> result = Lists.newArrayList();
        for (int i = 0; i < 10; i++) {
            int random = tradeController.getRandom(result);
            result.add(random);
        }

        Collections.sort(result);
        System.out.println(result);
    }
}