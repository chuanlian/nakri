/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon17.utils;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangchuanlian on 2016/12/14.
 */
public class KnowledgeUtil {

    public static Map<String, String> knowledgeMap = new HashMap<String, String>();

    static {
        knowledgeMap.put("asdf", "asdfads");
    }

    public static void main(String[] args) {
        try {
            String text = "如何做百度推广";
            //创建分词对象
            Analyzer anal = new IKAnalyzer(true);
            StringReader reader = new StringReader(text);
            //分词
            TokenStream ts = anal.tokenStream("", reader);
            CharTermAttribute term = ts.getAttribute(CharTermAttribute.class);
            //遍历分词数据
            while (ts.incrementToken()) {
                System.out.print(term.toString() + "|");
            }
            reader.close();
            System.out.println();
        } catch (Exception ex) {

        }
    }
}
