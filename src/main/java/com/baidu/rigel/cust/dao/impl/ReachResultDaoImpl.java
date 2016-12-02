/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baidu.rigel.cust.bo.ReachResult;
import com.baidu.rigel.cust.dao.ReachResultDao;
import com.baidu.rigel.cust.mapping.ReachResultMapper;

/**
 * Dao implement class for model : com.baidu.rigel.bo.ReachResultBase
 *
 * @author BJF
 */
@Service("reachResultDao")
public class ReachResultDaoImpl implements ReachResultDao {

    @Autowired
    ReachResultMapper reachResultMapper;

    public List<ReachResult> getReachResultByCustIds(List<Long> custIds) {

        return reachResultMapper.getReachResultByCustIds(custIds);
    }

    public void insert(ReachResult reachResult) {
        reachResultMapper.insert(reachResult);
    }

    public List<ReachResult> getReachResultsByStateAndReachCategory(Integer state, Long reachCategory) {
        return reachResultMapper.getReachResultsByStateAndReachCategory(state, reachCategory);
    }
}