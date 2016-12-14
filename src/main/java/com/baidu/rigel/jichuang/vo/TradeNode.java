/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.vo;

import java.util.Map;

/**
 * Created by zhanghu02 on 2016/10/28.
 */
public class TradeNode {

    private String id;
    private String name;
    private Integer symbolSize;
    private Double x;
    private Double y;
    private Integer category;
    private Map<String, Object> itemStyle;

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSymbolSize() {
        return symbolSize;
    }

    public void setSymbolSize(Integer symbolSize) {
        this.symbolSize = symbolSize;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Map<String, Object> getItemStyle() {
        return itemStyle;
    }

    public void setItemStyle(Map<String, Object> itemStyle) {
        this.itemStyle = itemStyle;
    }
}
