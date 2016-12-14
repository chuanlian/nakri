/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.service.impl;

import com.baidu.rigel.jichuang.bo.CustScoreDetail;
import com.baidu.rigel.jichuang.dao.CustScoreDetailDao;
import com.baidu.rigel.jichuang.service.CustScoreDetailService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Service implement class for model : com.baidu.rigel.jichuang.bo.CustScoreDetailBase
 *
 * @author BJF
 */
@Service("custScoreDetailService")
public class CustScoreDetailServiceImpl implements CustScoreDetailService {

    private static final Logger LOGGER = Logger.getLogger(CustScoreDetailServiceImpl.class);

    /**
     * Dao 'custScoreDetailDao' reference.
     */

    @Resource(name = "custScoreDetailDao")
    private CustScoreDetailDao custScoreDetailDao;

    public void insert(CustScoreDetail custScoreDetail) {
        custScoreDetailDao.insert(custScoreDetail);
    }

    public CustScoreDetail selectByOne() {
        return custScoreDetailDao.selectByOne();
    }

    public List<CustScoreDetail> getCustScoreDetails() {
        List<CustScoreDetail> custScoreDetails = custScoreDetailDao.getCustScoreDetails();
        for (CustScoreDetail custScoreDetail : custScoreDetails) {
            if (custScoreDetail.getType().intValue() == 1) {
                custScoreDetail.setTypeDesc("资料换积分");
            }
            if (custScoreDetail.getType().intValue() == 2) {
                custScoreDetail.setTypeDesc("积分换资料");
            }
        }
        return custScoreDetails;
    }
}