/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.rigel.jichuang.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.rigel.jichuang.bo.CustTradeDown;
import com.baidu.rigel.jichuang.bo.CustTradeSelf;
import com.baidu.rigel.jichuang.bo.CustTradeUp;
import com.baidu.rigel.jichuang.bo.Trade;
import com.baidu.rigel.jichuang.bo.TradeGraphCust;
import com.baidu.rigel.jichuang.bo.TradeGraphDown;
import com.baidu.rigel.jichuang.bo.TradeGraphUp;
import com.baidu.rigel.jichuang.dao.CustDao;
import com.baidu.rigel.jichuang.dao.TestDao;
import com.baidu.rigel.jichuang.dao.TradeDao;
import com.baidu.rigel.jichuang.dao.UserDao;
import com.baidu.rigel.jichuang.vo.CustTradeForm;
import com.baidu.rigel.jichuang.vo.JsonResult;
import com.baidu.rigel.jichuang.vo.Point;
import com.baidu.rigel.jichuang.vo.TradeLink;
import com.baidu.rigel.jichuang.vo.TradeNode;
import com.baidu.rigel.jichuang.vo.TradeVo;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

/**
 * Created by zhanghu02 on 2016/10/25.
 */
@Controller
@RequestMapping("/trade")
public class TradeController {

    @Resource(name = "tradeDao")
    private TradeDao tradeDao;

    @Resource(name = "custDao")
    private CustDao custDao;

    @Resource(name = "userDao")
    private UserDao userDao;

    @Resource(name = "testDao")
    private TestDao testDao;

    public static final Long CUR_TRADE = 1L;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public String getAllTrade() {
        return tradeDao.getAllTrade().toString();
    }

    List<Point> points ;

    private void test() {
        points = Lists.newArrayList(
                new Point(-266.82776, 299.6904),
                new Point(-418.08344, 446.8853),
                new Point(-212.76357, 245.29176),
                new Point(-242.82404, 235.26283),
                new Point(-379.30386, 429.06424),
                new Point(-332.6012, 485.16974),
                new Point(-382.69568, 475.09113),
                new Point(-320.384, 387.17325),
                new Point(-344.39832, 451.16772),
                new Point(-89.34107, 234.56128),
                new Point(-87.93029, -6.8120565),
                new Point(-339.77908, -184.69139),
                new Point(-194.31313, 178.55301),
                new Point(-158.05168, 201.99768),
                new Point(-127.701546, 242.55057),
                new Point(-385.2226, -393.5572),
                new Point(-516.55884, -393.98975),
                new Point(-464.79382, -493.57944),
                new Point(-515.1624, -456.9891),
                new Point(-408.12122, -464.5048),
                new Point(-456.44113, -425.13303),
                new Point(-459.1107, -362.5133),
                new Point(-313.42786, -289.44803),
                new Point(-225.73984, 82.41631),
                new Point(-81.46074, -204.20204),
                new Point(-385.6842, -20.206686));
    }

    @RequestMapping(value = "/showTradeRelations", method = RequestMethod.GET)
    @ResponseBody
    public JsonResult showTradeRelation() {

        //        CustTradeSelf custTrade = tradeDao.getCustTradeById(custId);

        int count = 0;
        // 查询所有行业
        List<TradeLink> tradeDownList = Lists.newArrayList();
        List<TradeLink> tradeUpList = Lists.newArrayList();
        List<TradeNode> tradeNodes = Lists.newArrayList();
        int i = 0;

        Set<Long> currentDownList = Sets.newHashSet();
        Set<Long> currentUpList = Sets.newHashSet();

        ArrayList<Integer> xList = Lists.newArrayList(0);
        ArrayList<Integer> yList = Lists.newArrayList(0);
        for (Trade trade : tradeDao.getAllTrade()) {
            TradeNode tradeNode = new TradeNode();
            i++;

            Long tradeId = trade.getId();
            tradeNode.setId(tradeId.toString());
            tradeNode.setName(trade.getName());
            //            tradeNode.setSymbolSize(tradeDao.queryTradeCustByTradeId(tradeId).size());
            if (trade.getId().equals(CUR_TRADE)) {
//                tradeNode.setSymbolSize(150);
//                Map<String, Object> itemStyleMap = setNodeColor("#FF0000");
                Map<String, Object> itemStyleMap = setNodeColor("#CD2626");
                tradeNode.setItemStyle(itemStyleMap);
            } else {
//                tradeNode.setSymbolSize(RandomUtils.nextInt(50, 100));
                ;
            }

            tradeNode.setCategory(RandomUtils.nextInt(0, 9));

            //            int randomX = getRandom(xList);
            //            xList.add(randomX);
            //            tradeNode.setX(randomX);
            //            int randomY = getRandom(xList);
            //            yList.add(randomY);
            //            tradeNode.setY(randomY);

//            tradeNode.setX(RandomUtils.nextInt(0, 1000));
//            tradeNode.setY(RandomUtils.nextInt(0, 1000));
            tradeNode.setX(trade.getX().doubleValue());
            tradeNode.setY(trade.getY().doubleValue());
            tradeNode.setSymbolSize(trade.getSize());

            //            tradeNode.setX(i * 100);
            //            tradeNode.setY(i * 100);

            tradeNodes.add(tradeNode);

            // 构建下游
            for (TradeGraphDown tradeGraphDown : tradeDao.queryTradeDownByTradeId(tradeId)) {
                if (trade.getId().equals(CUR_TRADE)) {
                    currentDownList.add(tradeGraphDown.getDownTradeId());
                }

                TradeLink tradeLink = new TradeLink();
                tradeLink.setId(String.valueOf(++count));
                tradeLink.setSource(tradeId.toString());
                tradeLink.setTarget(tradeGraphDown.getDownTradeId().toString());

                tradeDownList.add(tradeLink);
            }

            // 构建上游
            for (TradeGraphUp tradeGraphUp : tradeDao.queryTradeUpByTradeId(tradeId)) {
                if (trade.getId().equals(CUR_TRADE)) {
                    currentUpList.add(tradeGraphUp.getUpTradeId());
                }

                TradeLink tradeLink = new TradeLink();
                tradeLink.setId(String.valueOf(++count));
                tradeLink.setSource(tradeId.toString());
                tradeLink.setTarget(tradeGraphUp.getUpTradeId().toString());

                tradeUpList.add(tradeLink);
            }
        }

        Map<String, Object> map = Maps.newHashMap();
        List<TradeLink> tradeLinks = Lists.newArrayList(tradeUpList);
        tradeLinks.addAll(tradeDownList);

        // 对当前行业的上下游特殊处理
        for (TradeNode tradeNode : tradeNodes) {
            for (Long upTrade : currentUpList) {
                if (upTrade.toString().equals(tradeNode.getId())) {
                    tradeNode.setItemStyle(setNodeColor("#CD2626"));
                }
            }

            for (Long downTrade : currentDownList) {
                if (downTrade.toString().equals(tradeNode.getId())) {
                    tradeNode.setItemStyle(setNodeColor("#698B22"));
                }
            }
        }

        map.put("nodes", tradeNodes);
        map.put("links", tradeLinks);

        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(map);

        Collections.sort(xList);
        Collections.sort(yList);
        System.out.println("X:" + xList);
        System.out.println("Y:" + yList);

        return jsonResult;
    }

    private Map<String, Object> setNodeColor(String color) {
        Map<String, Object> itemStyleMap = Maps.newHashMap();
        itemStyleMap.put("normal", ImmutableMap.of("color", color));
        return itemStyleMap;
    }

    @RequestMapping(value = "/showTradeUpAndDown", method = RequestMethod.GET)
    @ResponseBody
    public JsonResult showTradeUpAndDown(Long tradeId) {

        List<TradeGraphUp> tradeGraphUps = tradeDao.queryTradeUpByTradeId(tradeId);

        List<TradeGraphDown> tradeGraphDowns = tradeDao.queryTradeDownByTradeId(tradeId);

        Map<String, Object> map = Maps.newHashMap();

        map.put("tradeGraphUps", getTradeVoUp(tradeGraphUps));
        map.put("tradeGraphDowns", getTradeVoDown(tradeGraphDowns));

        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(map);

        return jsonResult;
    }

    @RequestMapping(value = "saveCustTrade", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult saveCustTrade(CustTradeForm custTradeForm) {

        // 保存行业方向
        TradeGraphCust tradeGraphCust = new TradeGraphCust();
        Long tradeId = custTradeForm.getTradeId();
        tradeGraphCust.setTradeId(tradeId);
        String tradeNameById = tradeDao.getTradeNameById(tradeId);
        tradeGraphCust.setName(tradeNameById);
        Long custId = custTradeForm.getCustId();
        tradeGraphCust.setCustId(custId);
        tradeDao.saveTradeCust(tradeGraphCust);

        for (Long upTrade : custTradeForm.getUpTrades()) {
            TradeGraphUp tradeGraphUp = new TradeGraphUp();

            tradeGraphUp.setName(tradeNameById);
            tradeGraphUp.setTradeId(tradeId);
            tradeGraphUp.setUpTradeId(upTrade);

            tradeDao.saveTradeCustUp(tradeGraphUp);
        }

        for (Long downTrade : custTradeForm.getDownTrades()) {
            TradeGraphDown tradeGraphDown = new TradeGraphDown();

            tradeGraphDown.setName(tradeNameById);
            tradeGraphDown.setTradeId(tradeId);
            tradeGraphDown.setDownTradeId(downTrade);

            tradeDao.saveTradeCustDown(tradeGraphDown);
        }

        // 保存客户方向
        CustTradeSelf custTradeSelf = new CustTradeSelf();
        custTradeSelf.setTradeId(tradeId);
        custTradeSelf.setCustId(custId);
        String custName = userDao.getUserNameById(custId);
        custTradeSelf.setName(custName);
        custDao.saveCustTrade(custTradeSelf);

        for (Long upTrade : custTradeForm.getUpTrades()) {
            CustTradeUp custTradeUp = new CustTradeUp();
            custTradeUp.setName(custName);
            custTradeUp.setCustId(custId);
            custTradeUp.setUpTradeId(upTrade);

            custDao.saveCustTradeUp(custTradeUp);
        }

        for (Long downTrade : custTradeForm.getDownTrades()) {
            CustTradeDown custTradeDown = new CustTradeDown();
            custTradeDown.setCustId(custId);
            custTradeDown.setName(custName);
            custTradeDown.setDownTradeId(downTrade);

            custDao.saveCustTradeDown(custTradeDown);
        }

        return new JsonResult();
    }

    private List<TradeVo> getTradeVoDown(List<TradeGraphDown> tradeGraphDownList) {
        Set<TradeVo> result = Sets.newHashSet();
        for (TradeGraphDown tradeGraphDown : tradeGraphDownList) {
            Long id = tradeGraphDown.getDownTradeId();
            result.add(new TradeVo(id.toString(), tradeDao.getTradeNameById(id)));
        }

        return Lists.newArrayList(result);
    }

    private List<TradeVo> getTradeVoUp(List<TradeGraphUp> tradeGraphUpList) {
        Set<TradeVo> result = Sets.newHashSet();
        for (TradeGraphUp tradeGraphUp : tradeGraphUpList) {
            Long id = tradeGraphUp.getUpTradeId();
            result.add(new TradeVo(id.toString(), tradeDao.getTradeNameById(id)));
        }

        return Lists.newArrayList(result);
    }

    public int getRandom(List<Integer> result) {
        while (true) {
            int nextInt = RandomUtils.nextInt(1, 1000);
            boolean flag = false;
            for (Integer j : result) {
                int abs = Math.abs(nextInt - j);
                flag = abs < 30;
                if (flag) {
                    break;
                }
            }

            if (!flag) {
                return nextInt;
            }

        }
    }

    @RequestMapping(value = "markCustTrade", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult markCustTrade() {
        testDao.markSet();

        return new JsonResult();
    }

}
