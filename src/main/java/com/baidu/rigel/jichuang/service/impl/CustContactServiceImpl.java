/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.service.impl;

import com.baidu.rigel.jichuang.dao.CustContactDao;
import com.baidu.rigel.jichuang.service.CustContactService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Service implement class for model : com.baidu.rigel.jichuang.bo.CustContactBase
 *
 * @author BJF
 */
@Service("custContactService")
public class CustContactServiceImpl implements CustContactService {

    private static final Logger LOGGER = Logger.getLogger(CustContactServiceImpl.class);

    /**
     * Dao 'custContactDao' reference.
     */
    @Resource(name = "custContactDao")
    private CustContactDao custContactDao;


}