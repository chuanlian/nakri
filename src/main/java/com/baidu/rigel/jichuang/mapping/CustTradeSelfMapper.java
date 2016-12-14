package com.baidu.rigel.jichuang.mapping;

import com.baidu.rigel.jichuang.bo.CustTradeSelf;

public interface CustTradeSelfMapper {

    CustTradeSelf queryCustSelfById(Long id);

    void insertSelective(CustTradeSelf custTradeSelf);
}