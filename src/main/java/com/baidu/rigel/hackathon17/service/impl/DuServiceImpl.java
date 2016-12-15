/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon17.service.impl;

import com.baidu.rigel.hackathon17.dao.DuDao;
import com.baidu.rigel.hackathon17.service.DuService;
import com.baidu.rigel.hackathon17.utils.PropertyUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.wltea.analyzer.lucene.IKAnalyzer;

import javax.annotation.Resource;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangchuanlian on 2016/12/14.
 */
@Service("duService")
public class DuServiceImpl implements DuService {

    @Resource(name = "duDao")
    private DuDao duDao;


    public String sayHi(String name) {
        return duDao.sayHi(name);
    }

    /**
     * 根据问题返回答案
     *
     * @param question
     * @return
     */
    public String askQuestions(String question) {
        if (StringUtils.isBlank(question)) {
            throw new IllegalArgumentException("请输入问题");
        }

        List<String> words = segmentText(question);
        String answer = PropertyUtil.getProperty(question);
        return answer;
    }


    private List<String> segmentText(String question) {
        List<String> words = new ArrayList<String>();
        try {
            //创建分词对象
            Analyzer anal = new IKAnalyzer(true);
            StringReader reader = new StringReader(question);
            //分词
            TokenStream ts = anal.tokenStream("", reader);
            CharTermAttribute term = ts.getAttribute(CharTermAttribute.class);
            //遍历分词数据
            while (ts.incrementToken()) {
                System.out.print(term.toString() + "|");
                words.add(term.toString());
            }
            reader.close();
            System.out.println();
        } catch (Exception ex) {

        }
        return words;
    }

    public static void main(String[] args) {
        try {
            System.out.println(PropertyUtil.getProperty("1"));
        } catch (Exception ex) {

        }
    }
}
