/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.hackathon18.service.impl;

import com.baidu.rigel.hackathon18.bo.Feed;
import com.baidu.rigel.hackathon18.dao.FeedDao;
import com.baidu.rigel.hackathon18.service.FeedService;
import com.baidu.rigel.hackathon18.vo.FeedCalcResultVo;
import com.baidu.rigel.hackathon18.vo.FeedQueryCondition;
import com.baidu.rigel.hackathon18.vo.FeedQueryVo;
import com.baidu.rigel.hackathon18.vo.QualityDetailVo;
import org.apache.commons.lang3.StringUtils;
import org.apache.lucene.util.StringHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangchuanlian on 2017/5/19.
 */
@Service("feedService")
public class FeedServiceImpl implements FeedService {

    @Resource(name = "feedDao")
    private FeedDao feedDao;

    public List<QualityDetailVo> qualityDetail() {
        List<QualityDetailVo> qualityDetailVos = new ArrayList<QualityDetailVo>();

        QualityDetailVo qualityDetailVo1 = new QualityDetailVo();
        qualityDetailVo1.setSale("Alex Doe");
        qualityDetailVo1.setCompanyName("北京北达同人投资管理有限公司");
        qualityDetailVo1.setScore(91);
        qualityDetailVo1.setApplTime("2017-05-01 14:08");
        qualityDetailVos.add(qualityDetailVo1);

        QualityDetailVo qualityDetailVo2 = new QualityDetailVo();
        qualityDetailVo2.setSale("Alex Doe");
        qualityDetailVo2.setCompanyName("广州市戴誉信息科技有限公司");
        qualityDetailVo2.setScore(83);
        qualityDetailVo2.setApplTime("2017-05-05 11:08");
        qualityDetailVos.add(qualityDetailVo2);

        QualityDetailVo qualityDetailVo3 = new QualityDetailVo();
        qualityDetailVo3.setSale("Alex Doe");
        qualityDetailVo3.setCompanyName("南昌喜乐网络科技有限公司");
        qualityDetailVo3.setScore(78);
        qualityDetailVo3.setApplTime("2017-04-23 13:08");
        qualityDetailVos.add(qualityDetailVo3);


        QualityDetailVo qualityDetailVo4 = new QualityDetailVo();
        qualityDetailVo4.setSale("Alex Doe");
        qualityDetailVo4.setCompanyName("北京世银投资基金管理有限公司");
        qualityDetailVo4.setScore(67);
        qualityDetailVo4.setApplTime("2017-02-01 17:08");
        qualityDetailVos.add(qualityDetailVo4);


        QualityDetailVo qualityDetailVo5 = new QualityDetailVo();
        qualityDetailVo5.setSale("Susan Smith");
        qualityDetailVo5.setCompanyName("北京爱尚春天电子商务有限公司");
        qualityDetailVo5.setScore(88);
        qualityDetailVo5.setApplTime("2017-03-16 17:08");
        qualityDetailVos.add(qualityDetailVo5);


        QualityDetailVo qualityDetailVo6 = new QualityDetailVo();
        qualityDetailVo6.setSale("Susan Smith");
        qualityDetailVo6.setCompanyName("北京巧苹果文化发展有限公司");
        qualityDetailVo6.setScore(83);
        qualityDetailVo6.setApplTime("2017-05-15 11:08");
        qualityDetailVos.add(qualityDetailVo6);

        QualityDetailVo qualityDetailVo7 = new QualityDetailVo();
        qualityDetailVo7.setSale("Susan Smith");
        qualityDetailVo7.setCompanyName("河南凡品电子商务有限公司");
        qualityDetailVo7.setScore(81);
        qualityDetailVo7.setApplTime("2017-04-21 13:16");
        qualityDetailVos.add(qualityDetailVo7);

        QualityDetailVo qualityDetailVo8 = new QualityDetailVo();
        qualityDetailVo8.setSale("Susan Smith");
        qualityDetailVo8.setCompanyName("东莞互度电子商务有限公司");
        qualityDetailVo8.setScore(45);
        qualityDetailVo8.setApplTime("2017-03-27 18:11");
        qualityDetailVos.add(qualityDetailVo8);

        return qualityDetailVos;
    }

    public FeedCalcResultVo getFeed(Long id) {
        FeedCalcResultVo feedCalcResultVo = new FeedCalcResultVo();
        Feed feed = feedDao.getFeedById(id);
        if (feed != null) {
            feedCalcResultVo.setCompanyName(feed.getCustName());
        }
        return feedCalcResultVo;
    }

    public List<FeedQueryVo> getFeedList(FeedQueryCondition feedQueryCondition) {
        List<FeedQueryVo> feedQueryVos = new ArrayList<FeedQueryVo>();
        List<Feed> feeds = feedDao.getFeedList(feedQueryCondition);
        for (Feed feed : feeds) {
            FeedQueryVo feedQueryVo = new FeedQueryVo();
            feedQueryVo.setId(feed.getId());
            feedQueryVo.setCompanyName(feed.getCustName());
            feedQueryVo.setTrade(getTrade(feed.getTrade()));
            feedQueryVo.setAddress(getProName(feed.getProvince()) + "_" + getCityName(feed.getCity()) + "_" + getAreaName(feed.getCounty()));
            feedQueryVo.setIsTuiguang(feed.getIsTuiguang().intValue());
            feedQueryVo.setIsCompetitor(feed.getIsCompetitor().intValue());
            feedQueryVo.setIsCall(feed.getIsCall().intValue());
            feedQueryVo.setScore(feed.getScore().intValue());
            feedQueryVo.setFromSource(getSource(feed.getSource()));
            feedQueryVos.add(feedQueryVo);
        }
        return feedQueryVos;
    }

    private String getTrade(Long tradeId) {
        String tradeName = "";
        if (tradeId.intValue() == 1) {
            tradeName = "办公文教";
        }
        if (tradeId.intValue() == 2) {
            tradeName = "电脑硬件";
        }
        if (tradeId.intValue() == 3) {
            tradeName = "广播通讯";
        }
        if (tradeId.intValue() == 4) {
            tradeName = "机械设备";
        }
        if (tradeId.intValue() == 5) {
            tradeName = "交通运输";
        }
        return tradeName;
    }


    private String getProName(Long provId) {
        String provName = "";
        if (provId.intValue() == 1) {
            provName = "北京";
        }
        if (provId.intValue() == 2) {
            provName = "上海";
        }
        if (provId.intValue() == 3) {
            provName = "天津";
        }
        return provName;
    }

    private String getCityName(Long cityId) {
        String cityName = "";
        if (cityId.intValue() == 38) {
            cityName = "北京";
        }
        if (cityId.intValue() == 39) {
            cityName = "上海";
        }
        if (cityId.intValue() == 40) {
            cityName = "天津";
        }
        return cityName;
    }

    private String getAreaName(Long areaId) {
        String areaName = "";
        if (areaId.intValue() == 38) {
            areaName = "北京";
        }
        if (areaId.intValue() == 39) {
            areaName = "上海";
        }
        if (areaId.intValue() == 40) {
            areaName = "天津";
        }
        return areaName;
    }

    private String getSource(Long source) {
        String sourceName = "";
        if (source.intValue() == 0) {
            sourceName = "第三方抓取";
        }
        if (source.intValue() == 1) {
            sourceName = "公共库";
        }
        if (source.intValue() == 2) {
            sourceName = "今日头条抓取";
        }
        return sourceName;
    }
}
