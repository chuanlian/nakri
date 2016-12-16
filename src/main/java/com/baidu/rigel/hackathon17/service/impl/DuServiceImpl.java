/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon17.service.impl;

import com.baidu.rigel.hackathon17.dao.DuDao;
import com.baidu.rigel.hackathon17.service.DuService;
import com.baidu.rigel.hackathon17.vo.AnswerVo;
import org.apache.commons.lang3.StringUtils;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.springframework.stereotype.Service;
import org.wltea.analyzer.lucene.IKAnalyzer;

import javax.annotation.Resource;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.baidu.rigel.hackathon17.utils.KnowledgeUtil.knowledgeMap;

/**
 * Created by yangchuanlian on 2016/12/14.
 */
@Service("duService")
public class DuServiceImpl implements DuService {

    @Resource(name = "duDao")
    private DuDao duDao;

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
        // 精确匹配
        AnswerVo accurateAnswerVo = accurateMatching(question);
        if (accurateAnswerVo != null && StringUtils.isNotBlank(accurateAnswerVo.getAnswer())) {
            return accurateAnswerVo.getAnswer();
        }
        // 分词后匹配
        List<AnswerVo> answerVoList = new ArrayList<AnswerVo>();
        List<String> words = segmentText(question);
        for (String word : words) {
            matching(word, answerVoList);
        }
        AnswerVo maxAnswerVo = new AnswerVo(0);
        for (AnswerVo answerVo : answerVoList) {
            if (answerVo.getCount().intValue() > maxAnswerVo.getCount().intValue()) {
                maxAnswerVo = answerVo;
            }
        }
        return maxAnswerVo.getAnswer();
    }

    /**
     * 答案全字匹配
     *
     * @param word
     * @return
     */
    private AnswerVo accurateMatching(String word) {
        AnswerVo answerVo = new AnswerVo();
        Iterator it = knowledgeMap.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            if (key.contains(word)) {
                String answer = knowledgeMap.get(key);
                answerVo.setKey(key);
                answerVo.setAnswer(answer);
            }
        }
        return answerVo;
    }


    /**
     * 答案匹配
     *
     * @param answerVoList
     * @return
     */
    private void matching(String word, List<AnswerVo> answerVoList) {
        Iterator it = knowledgeMap.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            if (key.contains(word)) {
                // 判断集合中是否包含这个答案
                boolean flag = false;
                for (AnswerVo answerVo : answerVoList) {
                    if (answerVo.getKey().contains(key)) {
                        flag = true;
                        answerVo.setCount(answerVo.getCount() + 1);
                        break;
                    }
                }
                if (!flag) {
                    AnswerVo answerVo = new AnswerVo();
                    answerVo.setKey(key);
                    answerVo.setAnswer(knowledgeMap.get(key));
                    answerVoList.add(answerVo);
                }
            }
        }
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

    public String sayHi(String name) {
        return duDao.sayHi(name);
    }
}
