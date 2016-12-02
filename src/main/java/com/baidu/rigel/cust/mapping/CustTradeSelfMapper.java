package com.baidu.rigel.cust.mapping;

import com.baidu.rigel.cust.bo.CustTradeSelf;

public interface CustTradeSelfMapper {

    CustTradeSelf queryCustSelfById(Long id);

    void insertSelective(CustTradeSelf custTradeSelf);
}