/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.util;

/**
 * 与前端约定的JSON数据格式
 */
public class EJsonResult {
    /**
     * 状态码的约定
     * 0：成功，表示业务逻辑到达预想期待的结果。
     * 100～199：参数传递错误，请求数据错误，业务流程失败。
     * 200～299：UC权限错误，服务器未知的错误。
     * 300～399：UC登录超时，前端会新开登录页提醒重新登录。
     * 999：未知错误
     */
    protected int status;

    /**
     * 状态信息
     */
    protected String statusInfo;

    /**
     * 业务返回数据
     */
    protected Object data;

    public EJsonResult() {
    }

    public EJsonResult(EJsonResultType resultType, Object data) {
        this(resultType.getStatusCode(), resultType.getStatusInfo(), data);
    }

    public EJsonResult(Object data) {
        this(EJsonResultType.SUCCESS, data);
    }

    public EJsonResult(int status, String statusInfo, Object data) {
        this.status = status;
        this.statusInfo = statusInfo;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusInfo() {
        return statusInfo;
    }

    public void setStatusInfo(String statusInfo) {
        this.statusInfo = statusInfo;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 构建业务异常的EJSON结果
     *
     * @param statusInfo 出错信息,记录尽可能多的现场信息
     *
     * @return 组装结果
     */
    public static EJsonResult buildResultWhenBizError(String statusInfo) {
        return new EJsonResult(EJsonResultType.BIZ_ERROR.getStatusCode(), statusInfo, null);
    }

    /**
     * 构建未登录时的EJSON结果
     *
     * @param loginJumpUrl 跳转URL
     *
     * @return 组装结果
     */
    public static EJsonResult buildResultWhenNotLogin(String loginJumpUrl) {
        return new EJsonResult(EJsonResultType.LOGIN_STATUS_ERROR, loginJumpUrl);
    }

    /**
     * 构建没有功能权限的EJSON结果
     *
     * @param statusInfo   错误信息
     * @param authErrorUrl 跳转URL
     *
     * @return 组装结果
     */
    public static EJsonResult buildResultWhenNoRoleAuth(String statusInfo, String authErrorUrl) {
        return new EJsonResult(EJsonResultType.ROLE_AUTH_ERROR.getStatusCode(), statusInfo, authErrorUrl);
    }

    /**
     * 构建没有数据权限的EJSON结果
     *
     * @param statusInfo   错误信息
     * @param authErrorUrl 跳转URL
     *
     * @return 组装结果
     */
    public static EJsonResult buildResultWhenNoDataAuth(String statusInfo, String authErrorUrl) {
        return new EJsonResult(EJsonResultType.DATA_AUTH_ERROR.getStatusCode(), statusInfo, authErrorUrl);
    }

}
