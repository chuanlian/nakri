package com.baidu.rigel.jichuang.bo;

import com.baidu.rigel.jichuang.constant.CustConstants;

/**
 * This bo is map to table : tb_cust_contact
 * Table description :
 *
 * @author BJF
 */
public class CustContact extends CustContactBase {
    /**
     * serial Version UID.
     */
    private static final long serialVersionUID = -1L;

    public CustContact() {
        setType(-1L);
        setCountryCode("");
        setAreaCode("");
        setExtInfo("");
        setFullInfo("");
        setState(Long.valueOf(CustConstants.StateEnum.VALID.getValue()));
    }
}