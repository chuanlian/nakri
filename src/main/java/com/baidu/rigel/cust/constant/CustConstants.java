/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangchuanlian on 2016/10/28.
 */
public class CustConstants {

    public static final long PERSON = 0;

    public enum StatusEnum {
        WAIT(0, "待营销"),

        FINISHED(1, "已触达"),

        DEL(2, "作废");

        StatusEnum(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        /**
         * 类型值和类型名称对应关系表
         */
        public static final Map<Integer, String> TYPE_MAP = new HashMap<Integer, String>();

        static {
            TYPE_MAP.put(DEL.getValue(), DEL.getDesc());
            TYPE_MAP.put(WAIT.getValue(), WAIT.getDesc());
            TYPE_MAP.put(FINISHED.getValue(), FINISHED.getDesc());
        }

        private Integer value;

        private String desc;

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    /**
     * 1 自上传 2 信任网络 3 加v客户 4 c2b客户'
     */
    public enum SourceEnum {

        SELF(1, "自上传"),

        TRUST(2, "信任网络"),

        V(3, "百度推荐"),

        C2B(4, "c2b客户");

        SourceEnum(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        /**
         * 类型值和类型名称对应关系表
         */
        public static final Map<Integer, String> TYPE_MAP = new HashMap<Integer, String>();

        static {
            TYPE_MAP.put(SELF.getValue(), SELF.getDesc());
            TYPE_MAP.put(TRUST.getValue(), TRUST.getDesc());
            TYPE_MAP.put(V.getValue(), V.getDesc());
            TYPE_MAP.put(C2B.getValue(), C2B.getDesc());
        }

        private Integer value;

        private String desc;

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    public enum CustTypeEnum {

        NORMAL(0, "普通客户"),

        SPECIAL(1, "特殊客户"),

        PERSON(2, "个人客户"),

        PROXY(3, "广告代理"),

        GOV(4, "政府组织");

        CustTypeEnum(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        /**
         * 类型值和类型名称对应关系表
         */
        public static final Map<Integer, String> TYPE_MAP = new HashMap<Integer, String>();

        static {
            TYPE_MAP.put(NORMAL.getValue(), NORMAL.getDesc());
            TYPE_MAP.put(SPECIAL.getValue(), SPECIAL.getDesc());
            TYPE_MAP.put(PERSON.getValue(), PERSON.getDesc());
            TYPE_MAP.put(PROXY.getValue(), PROXY.getDesc());
            TYPE_MAP.put(GOV.getValue(), GOV.getDesc());
        }

        private Integer value;

        private String desc;

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    public enum CustCategoryEnum {

        XIAYOU(1, "下游目标客户"),

        SHANGYOU(2, "上游供应商");

        CustCategoryEnum(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        /**
         * 类型值和类型名称对应关系表
         */
        public static final Map<Integer, String> TYPE_MAP = new HashMap<Integer, String>();

        static {
            TYPE_MAP.put(XIAYOU.getValue(), XIAYOU.getDesc());
            TYPE_MAP.put(SHANGYOU.getValue(), SHANGYOU.getDesc());
        }

        private Integer value;

        private String desc;

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    /**
     * 客户资料和联系人状态
     */
    public enum StateEnum {

        VALID(0, "有效"),

        INVALID(1, "无效");

        StateEnum(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        /**
         * 类型值和类型名称对应关系表
         */
        public static final Map<Integer, String> TYPE_MAP = new HashMap<Integer, String>();

        static {
            TYPE_MAP.put(VALID.getValue(), VALID.getDesc());
            TYPE_MAP.put(INVALID.getValue(), INVALID.getDesc());
        }

        private Integer value;

        private String desc;

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    /**
     * 0:待触达;1:触达中;2:已触达
     */
    public enum ReachStateEnum {

        WILLREACH(0, "待触达"),
        REACHING(1, "触达中"),
        REACHED(2, "已触达");

        ReachStateEnum(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        /**
         * 类型值和类型名称对应关系表
         */
        public static final Map<Integer, String> TYPE_MAP = new HashMap<Integer, String>();

        static {
            TYPE_MAP.put(WILLREACH.getValue(), WILLREACH.getDesc());
            TYPE_MAP.put(REACHING.getValue(), REACHING.getDesc());
            TYPE_MAP.put(REACHED.getValue(), REACHED.getDesc());
        }

        private Integer value;

        private String desc;

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

    }

    /**
     * 0:站内信;1:短信;2:邮件
     */

    public enum ReachTypeEnum {

        MAIL(0, "站内信"),
        MESSAGE(1, "短信"),
        EMAIL(2, "邮件");

        ReachTypeEnum(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        /**
         * 类型值和类型名称对应关系表
         */
        public static final Map<Integer, String> TYPE_MAP = new HashMap<Integer, String>();

        static {
            TYPE_MAP.put(MAIL.getValue(), MAIL.getDesc());
            TYPE_MAP.put(MESSAGE.getValue(), MESSAGE.getDesc());
            TYPE_MAP.put(EMAIL.getValue(), EMAIL.getDesc());
        }

        private Integer value;

        private String desc;

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

    }
}
