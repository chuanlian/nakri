/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon17.vo;

/**
 * Created by yangchuanlian on 2016/12/16.
 */
public class AnswerMsg {

    private resultList resultList;

    public AnswerMsg.resultList getResultList() {
        return resultList;
    }

    public void setResultList(AnswerMsg.resultList resultList) {
        this.resultList = resultList;
    }

    public class resultList {
        private String txt;
    }
}
