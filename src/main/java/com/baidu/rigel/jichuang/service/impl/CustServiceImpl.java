/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.service.impl;

import com.baidu.rigel.jichuang.bo.Cust;
import com.baidu.rigel.jichuang.bo.CustContact;
import com.baidu.rigel.jichuang.constant.CustConstants;
import com.baidu.rigel.jichuang.dao.CustContactDao;
import com.baidu.rigel.jichuang.dao.CustDao;
import com.baidu.rigel.jichuang.service.CustService;
import com.baidu.rigel.jichuang.util.IDGenerator;
import com.baidu.rigel.jichuang.vo.CustQueryCondition;
import com.baidu.rigel.jichuang.vo.CustQueryVo;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;

/**
 * Service implement class for model : com.baidu.rigel.jichuang.bo.CustBase
 *
 * @author BJF
 */
@Service("custService")
public class CustServiceImpl implements CustService {

    private static final Logger LOGGER = Logger.getLogger(CustServiceImpl.class);

    @Resource(name = "custDao")
    private CustDao custDao;
    @Resource(name = "custContactDao")
    private CustContactDao custContactDao;

    /**
     * 录入单条资料
     */
    public void addSelfCust(CustQueryCondition custQueryCondition) {
        Assert.notNull(custQueryCondition, "custQueryCondition is null");
        Cust cust1 = custDao.selectCustOne(custQueryCondition);
        Cust cust = new Cust();
        if (cust1 != null) {
            BeanUtils.copyProperties(cust1, cust);
            cust.setId(IDGenerator.generateBigIntKey());
            cust.setCustCategory(custQueryCondition.getCustCategory().longValue());
            cust.setCustType(custQueryCondition.getCustType().longValue());
            cust.setSource(Long.valueOf(CustConstants.SourceEnum.SELF.getValue()));
            cust.setStatus(Long.valueOf(CustConstants.StateEnum.VALID.getValue()));
            cust.setTrade(custQueryCondition.getTrade());
            cust.setCustName(custQueryCondition.getCompanyName());
            custDao.addC2bCust(cust);
        }
    }

    /**
     * 增加C2B线索
     *
     * @param cust
     * @param custContact
     */
    public void addC2bCust(Cust cust, CustContact custContact) {
        Long custId = IDGenerator.generateBigIntKey();
        cust.setId(custId);
        cust.setCustCategory(Long.valueOf(CustConstants.CustCategoryEnum.XIAYOU.getValue()));
        cust.setCustType(Long.valueOf(CustConstants.CustTypeEnum.PERSON.getValue()));
        cust.setSource(Long.valueOf(CustConstants.SourceEnum.C2B.getValue()));
        cust.setStatus(Long.valueOf(CustConstants.StateEnum.VALID.getValue()));
        cust.setTrade(5L);
        custDao.addC2bCust(cust);

        custContact.setId(IDGenerator.generateBigIntKey());
        custContact.setCustId(custId);
        custContact.setState(Long.valueOf(CustConstants.StateEnum.VALID.getValue()));
        custContactDao.insert(custContact);

    }

    /**
     * 获取客户资料列表
     *
     * @param custQueryCondition
     * @return
     */
    public List<CustQueryVo> getCustList(CustQueryCondition custQueryCondition) {
        Assert.notNull(custQueryCondition, "custQueryCondition is not null");
        if (StringUtils.isBlank(custQueryCondition.getCompanyName())) {
            custQueryCondition.setCompanyName(null);
        }
        List<CustQueryVo> custQueryVos = custDao.getCustList(custQueryCondition);
        if (custQueryVos != null && custQueryVos.size() > 0) {
            for (CustQueryVo custQueryVo : custQueryVos) {
                custQueryVo.setCustTypeDesc(CustConstants.CustTypeEnum.TYPE_MAP.get(custQueryVo.getCustType()));
                custQueryVo.setStatusDesc(CustConstants.StateEnum.TYPE_MAP.get(custQueryVo.getStatus()));
                custQueryVo.setSourceDesc(CustConstants.SourceEnum.TYPE_MAP.get(custQueryVo.getSource()));
                custQueryVo.setCustCategoryDesc(CustConstants.CustCategoryEnum.TYPE_MAP.get(
                        custQueryVo.getCustCategory()));
            }
        }
        return custQueryVos;
    }

    /**
     * 从百度获取线索
     */
    public void syncUpCusts() {
        custDao.syncUpCusts();
    }

    /**
     * 从百度获取线索
     */
    public void syncDownCusts() {
        custDao.syncDownCusts();
    }


    /**
     * 通过Id获取cust列表
     *
     * @param custIds
     * @return
     */
    public List<Cust> getCustsByIds(List<Long> custIds) {
        return custDao.getCustsByIds(custIds);
    }

    /**
     * 通过Id获取cust
     *
     * @param custId
     * @return
     */
    public Cust getCustById(Long custId) {
        return custDao.getCustById(custId);
    }
}