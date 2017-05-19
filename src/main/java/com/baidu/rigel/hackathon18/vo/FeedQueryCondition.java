/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon18.vo;

import java.io.Serializable;

/**
 * Created by yangchuanlian on 2017/5/19.
 */
public class FeedQueryCondition implements Serializable {

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 得分
     */
    private Integer score;

    private Integer minScore;

    private Integer maxScore;

    /**
     * 操作类型：>,=,<
     */
    private String operType;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getMinScore() {
        return minScore;
    }

    public void setMinScore(Integer minScore) {
        this.minScore = minScore;
    }

    public Integer getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(Integer maxScore) {
        this.maxScore = maxScore;
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType;
    }
}
