/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.cust.util;

import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

/**
 * Created by zhengweichao on 2016/10/29.
 */
public class CommonUtils {
    public static final String[] DATE_STYLES = new String[] {"yyyy-MM-dd", "yyyy/MM/dd", "yyyyMMdd",
            "yyyy-MM-dd HH:mm:ss", "yyyy/MM/dd HH:mm:ss"};

    /**
     * 把常见日期字符串解析成Date对象
     *
     * @param date 日期字符串
     *
     * @return Date
     */
    public static Date parseDate(String date) {
        try {
            return DateUtils.parseDate(date, DATE_STYLES);
        } catch (ParseException e) {
            throw new RuntimeException("parse date " + date + " error : " + e.getMessage());
        }
    }
}
