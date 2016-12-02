/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.service.impl;

import com.baidu.rigel.cust.dao.CustScoreDao;
import com.baidu.rigel.cust.service.CustScoreService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Service implement class for model : com.baidu.rigel.cust.bo.CustScoreBase
 *
 * @author BJF
 */
@Service("custScoreService")
public class CustScoreServiceImpl implements CustScoreService {

    private static final Logger LOGGER = Logger.getLogger(CustScoreServiceImpl.class);

    @Resource(name = "custScoreDao")
    private CustScoreDao custScoreDao;

}