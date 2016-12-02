/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.service.impl;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.baidu.rigel.cust.bo.Cust;
import com.baidu.rigel.cust.bo.ReachResult;
import com.baidu.rigel.cust.constant.CustConstants;
import com.baidu.rigel.cust.dao.ReachResultDao;
import com.baidu.rigel.cust.service.CustService;
import com.baidu.rigel.cust.service.ReachResultService;
import com.baidu.rigel.cust.util.CommonUtils;
import com.baidu.rigel.cust.util.IDGenerator;
import com.baidu.rigel.cust.vo.ReachResultVo;
import com.google.common.collect.Lists;

/**
 * Service implement class for model : com.baidu.rigel.bo.ReachResultBase
 *
 * @author BJF
 */
@Service("reachResultService")
public class ReachResultServiceImpl implements ReachResultService {
    /**
     * Dao 'reachResultDao' reference.
     */
    @Autowired
    private CustService custService;

    @Autowired
    private ReachResultDao reachResultDao;

    private final List<String> addresses = new ArrayList<String>(Arrays.asList("北京", "上海", "广州", "深圳", "东莞", "苏州", "淄博",
            "浙江", "南昌", "河南"));
    private final List<String> intention = new ArrayList<String>(Arrays.asList("高", "中", "低", "无"));

    public List<ReachResult> getReachResultVosByCustIds(List<Long> custIds) {
        List<Cust> custs = custService.getCustsByIds(custIds);
        List<ReachResult> reachResultByCustIds = reachResultDao.getReachResultByCustIds(custIds);

        return reachResultDao.getReachResultByCustIds(custIds);
    }

    public void insertReachResultByCustIds(List<Long> custIds, Long reachCategory) {

        for (Long custId : custIds) {

            ReachResult reachResult = new ReachResult();
            DecimalFormat dcmFmt = new DecimalFormat("0.00");
            Random random = new Random();
            reachResult.setId(IDGenerator.generateBigIntKey());
            reachResult.setAddress(addresses.get(random.nextInt(10)));
//            reachResult.setPrice(Float.valueOf(dcmFmt.format(random.nextFloat() * 100)));
            reachResult.setPrice(Long.valueOf(dcmFmt.format(random.nextFloat() * 100)));
            reachResult.setDefectiveRate(Long.valueOf(random.nextInt(100)));
            reachResult.setStock(Long.valueOf(random.nextInt(1000)));
            reachResult.setProductivity(Long.valueOf(random.nextInt(100)));
            reachResult.setRegisterCapita(Long.valueOf(random.nextInt(100)));
            reachResult.setReachCategory(reachCategory);
            reachResult.setReachType(Long.valueOf(CustConstants.ReachTypeEnum.MAIL.getValue()));
            reachResult.setState(Long.valueOf(CustConstants.ReachStateEnum.REACHED.getValue()));
            reachResult.setReachDate(new Date());
            reachResult.setResponseDate(CommonUtils.parseDate("1970-01-01 00:00:00"));
            reachResult.setIntention(intention.get(random.nextInt(4)));
            reachResult.setRelationId(custId);
            reachResult.setRemark("天使之翼");
            reachResultDao.insert(reachResult);
        }

    }

    /**
     * 查询已经触达的数据
     */
    public List<ReachResultVo> getReachResultVos(Long reachCategory) {

        List<ReachResultVo> reachResultVos = Lists.newArrayList();

        List<ReachResult> reachResults = reachResultDao
                .getReachResultsByStateAndReachCategory(CustConstants.ReachStateEnum.REACHED.getValue(), reachCategory);

        if (CollectionUtils.isEmpty(reachResults)) {
            return reachResultVos;
        }

        for (ReachResult reachResult : reachResults) {

            Cust cust = custService.getCustById(reachResult.getRelationId());
            if (cust != null) {
                ReachResultVo reachResultVo = new ReachResultVo();
                BeanUtils.copyProperties(reachResult, reachResultVo);
                reachResultVo.setCustName(cust.getCustName());
                reachResultVos.add(reachResultVo);
            }
        }
        return reachResultVos;
    }

    public List<ReachResultVo> getDownReachResultVos() {
        return this.getReachResultVos(Long.valueOf(CustConstants.CustCategoryEnum.XIAYOU.getValue()));
    }

    public List<ReachResultVo> getUpReachResultVos() {
        return this.getReachResultVos(Long.valueOf(CustConstants.CustCategoryEnum.SHANGYOU.getValue()));
    }

    public void insertUpReachResultByCustIds(List<Long> custIds) {

        this.insertReachResultByCustIds(custIds, Long.valueOf(CustConstants.CustCategoryEnum.SHANGYOU.getValue()));

    }

    public void insertDownReachResultByCustIds(List<Long> custIds) {

        this.insertReachResultByCustIds(custIds, Long.valueOf(CustConstants.CustCategoryEnum.XIAYOU.getValue()));
    }
}