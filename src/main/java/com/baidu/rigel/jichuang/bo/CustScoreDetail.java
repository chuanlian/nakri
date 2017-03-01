package com.baidu.rigel.jichuang.bo;

/**
 * This bo is map to table : tb_cust_score_detail
 * Table description : 3.2.2积分明细表
 *
 * @author BJF
 */
public class CustScoreDetail extends CustScoreDetailBase {
    /**
     * serial Version UID.
     */
    private static final long serialVersionUID = -1L;

    private String typeDesc;

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }
}