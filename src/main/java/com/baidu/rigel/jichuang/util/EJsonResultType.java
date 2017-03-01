/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.util;

/**
 * Created by yanglei on 16/8/31.
 */
public enum EJsonResultType {
    SUCCESS(0, "ok"),
    LOGIN_STATUS_ERROR(301, "用户没有登录或登录失效"),
    ROLE_AUTH_ERROR(302, "用户没有相关功能权限"),
    DATA_AUTH_ERROR(303, "用户没有相关数据权限"),
    BIZ_ERROR(400, "逻辑异常") ,

    ;
    /**
     * 状态码
     */
    private int statusCode;

    /**
     * 详细描述
     */
    private String statusInfo;

    EJsonResultType(int status, String statusInfo) {
        this.statusCode = status;
        this.statusInfo = statusInfo;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusInfo() {
        return statusInfo;
    }

    public void setStatusInfo(String statusInfo) {
        this.statusInfo = statusInfo;
    }
}
