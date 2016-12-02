/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.dao;

import com.baidu.rigel.cust.bo.CustScoreDetail;

import java.util.List;

/**
 * Dao interface class for model com.baidu.rigel.cust.bo.CustScoreDetailBase
 * @author BJF
 */
public interface CustScoreDetailDao  {

    void insert(CustScoreDetail custScoreDetail);

    CustScoreDetail selectByOne();

    List<CustScoreDetail> getCustScoreDetails();
}