/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon17.vo;


import java.io.Serializable;

/**
 * Created by yangchuanlian on 2016/12/16.
 */


public class AnswersVo implements Serializable {


    private AnswerMsg resultLit;

    public AnswerMsg getResultLit() {
        return resultLit;
    }

    public void setResultLit(AnswerMsg resultLit) {
        this.resultLit = resultLit;
    }
}

