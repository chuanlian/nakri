/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.service.impl;

import com.baidu.rigel.cust.dao.CustExchangeDao;
import com.baidu.rigel.cust.service.CustExchangeService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Service implement class for model : com.baidu.rigel.cust.bo.CustExchangeBase
 *
 * @author BJF
 */
@Service("custExchangeService")
public class CustExchangeServiceImpl implements CustExchangeService {

    private static final Logger LOGGER = Logger.getLogger(CustExchangeServiceImpl.class);

    /**
     * Dao 'custExchangeDao' reference.
     */
    @Resource(name = "custExchangeDao")
    private CustExchangeDao custExchangeDao;


}