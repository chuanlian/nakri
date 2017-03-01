/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.service;

import com.baidu.rigel.jichuang.bo.CustScoreDetail;

import java.util.List;

/**
 * Service interface class for model com.baidu.rigel.jichuang.bo.CustScoreDetailBase
 *
 * @author BJF
 */
public interface CustScoreDetailService {

    void insert(CustScoreDetail custScoreDetail);

    CustScoreDetail selectByOne();

    List<CustScoreDetail> getCustScoreDetails();
}