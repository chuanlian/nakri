/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baidu.rigel.jichuang.bo.ReachResult;

/**
 * Mapper interface class for model com.baidu.rigel.bo.ReachResultBase
 *
 * @author BJF
 */
public interface ReachResultMapper {
    List<ReachResult> getReachResultByCustIds(@Param("custIds") List<Long> custIds);

    void insert(ReachResult reachResult);

    List<ReachResult> getReachResultsByState(@Param("state") Integer state);

    List<ReachResult> getReachResultsByStateAndReachCategory(@Param("state") Integer state,
                                                         @Param("reachCategory") Long reachCategory);
}