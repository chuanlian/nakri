/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon17.vo;

import java.io.Serializable;

/**
 * Created by yangchuanlian on 2016/12/16.
 */
public class AnswerVo implements Serializable {

    private static final long serialVersionUID = 3817678215340746990L;

    private String key;

    private String answer;

    private Integer count = 0;

    public AnswerVo() {
        this.count = 1;
    }

    public AnswerVo(int count) {
        this.count = count;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
