package com.baidu.rigel.cust.bo;

import com.baidu.rigel.cust.constant.CustConstants;

/**
 * This bo is map to table : tb_cust
 * Table description : 3.1.1客户主表
 *
 * @author BJF
 */
public class Cust extends CustBase {
    /**
     * serial Version UID.
     */
    private static final long serialVersionUID = -1L;

    public Cust() {
        setCustCategory(Long.valueOf(CustConstants.CustCategoryEnum.XIAYOU.getValue()));
        setCustType(Long.valueOf(CustConstants.CustTypeEnum.PERSON.getValue()));
        setStatus(Long.valueOf(CustConstants.StateEnum.VALID.getValue()));
        setAddr("");
        setRemark("");
        setScore(0L);
        setOwner(0L);

    }

}