/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.bo;

import java.io.Serializable;

/**
 * This bo is map to table : tb_cust_tag
 * Table description : 3.1.3客户标签
 *
 * @author BJF
 */
public abstract class CustTagBase implements Serializable {

    private Long id;


    private Long custId;


    private Long tagId;


    private String tagName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}