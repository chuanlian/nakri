/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.dao;

import java.util.List;

import com.baidu.rigel.jichuang.bo.ReachResult;

/**
 * Dao interface class for model com.baidu.rigel.bo.ReachResultBase
 *
 * @author BJF
 */
public interface ReachResultDao {
    List<ReachResult> getReachResultByCustIds(List<Long> custIds);

    void insert(ReachResult reachResult);

    List<ReachResult> getReachResultsByStateAndReachCategory(Integer state, Long reachCategory);
}