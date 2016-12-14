/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.service;

import java.util.List;

import com.baidu.rigel.jichuang.bo.ReachResult;
import com.baidu.rigel.jichuang.vo.ReachResultVo;

/**
 * Service interface class for model com.baidu.rigel.bo.ReachResultBase
 *
 * @author BJF
 */
public interface ReachResultService {
    List<ReachResult> getReachResultVosByCustIds(List<Long> custIds);

//    void insertReachResultByCustIds(List<Long> custIds);

//    List<ReachResultVo> getReachResultVos();

    List<ReachResultVo> getDownReachResultVos();

    List<ReachResultVo> getUpReachResultVos();

    void insertUpReachResultByCustIds(List<Long> custIds);

    void insertDownReachResultByCustIds(List<Long> custIds);
}