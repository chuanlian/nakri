<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.baidu.rigel.cust.vo.CustQueryVo" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--
  ~ Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
  --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <title>添加我的行业</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <!-- basic styles -->
        <link href="css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="css/font-awesome.min.css" />
        <!--[if IE 7]>
          <link rel="stylesheet" href="css/font-awesome-ie7.min.css" />
        <![endif]-->
        <!-- page specific plugin styles -->
        <!-- fonts -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300" />
        <!-- ace styles -->
        <link rel="stylesheet" href="css/ace.min.css" />
        <link rel="stylesheet" href="css/ace-rtl.min.css" />
        <link rel="stylesheet" href="css/ace-skins.min.css" />
        <style>
        .checkbox {
            display: inline-block;
            width: 150px;
        }
        </style>

        <!--[if lte IE 8]>
          <link rel="stylesheet" href="css/ace-ie.min.css" />
        <![endif]-->

        <!-- inline styles related to this page -->

        <!-- ace settings handler -->

        <script src="js/ace-extra.min.js"></script>

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

        <!--[if lt IE 9]>
        <script src="js/html5shiv.js"></script>
        <script src="js/respond.min.js"></script>
        <![endif]-->
    </head>

    <body>
        <jsp:include page="top.jsp"></jsp:include>

        <div class="main-container" id="main-container">
            <script type="text/javascript">
                try{ace.settings.check('main-container' , 'fixed')}catch(e){}
            </script>

            <div class="main-container-inner">
                <a class="menu-toggler" id="menu-toggler" href="#">
                    <span class="menu-text"></span>
                </a>

                <div class="sidebar" id="sidebar">
                <script type="text/javascript">
                    try {
                        ace.settings.check('sidebar', 'fixed')
                    } catch (e) {
                    }
                </script>

                <div class="sidebar-shortcuts" id="sidebar-shortcuts">
                    <div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
                        <button class="btn btn-success">
                            <i class="icon-signal"></i>
                        </button>

                        <button class="btn btn-info">
                            <i class="icon-pencil"></i>
                        </button>

                        <button class="btn btn-warning">
                            <i class="icon-group"></i>
                        </button>

                        <button class="btn btn-danger">
                            <i class="icon-cogs"></i>
                        </button>
                    </div>

                    <div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
                        <span class="btn btn-success"></span>

                        <span class="btn btn-info"></span>

                        <span class="btn btn-warning"></span>

                        <span class="btn btn-danger"></span>
                    </div>
                </div>

                <ul class="nav nav-list">
                    <li class="active open">
                        <a href="#" class="dropdown-toggle">
                            <i class="icon-list"></i>
                            <span class="menu-text"> 客户资料 </span>

                            <b class="arrow icon-angle-down"></b>
                        </a>
                        <ul class="submenu">
                            <li class="active">
                                <a href="/Nakri/cust/custList">
                                    <i class="icon-double-angle-right"></i>
                                    查询资料
                                </a>
                            </li>
                            <li>
                                <a href="/Nakri/cust/syncCustInit">
                                    <i class="icon-double-angle-right"></i>
                                    获取资料
                                </a>
                            </li>
                            <li>
                                <a href="/Nakri/cust/devoteCustInit">
                                    <i class="icon-double-angle-right"></i>
                                    贡献资料
                                </a>
                            </li>
                            <li>
                                <a href="/Nakri/cust/showScore">
                                    <i class="icon-double-angle-right"></i>
                                    积分明细
                                </a>
                            </li>
                        </ul>
                    </li>
                </ul>

                <div class="sidebar-collapse" id="sidebar-collapse">
                    <i class="icon-double-angle-left" data-icon1="icon-double-angle-left"
                       data-icon2="icon-double-angle-right"></i>
                </div>

                <script type="text/javascript">
                    try {
                        ace.settings.check('sidebar', 'collapsed')
                    } catch (e) {
                    }
                </script>
            </div>

                <div class="main-content">
                    <div class="breadcrumbs" id="breadcrumbs">
                        <script type="text/javascript">
                            try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
                        </script>

                        <ul class="breadcrumb">
                            <li>
                                <i class="icon-home home-icon"></i>
                                <a href="#">Home</a>
                            </li>
                            <li class="active">添加我的行业</li>
                        </ul><!-- .breadcrumb -->

                        <div class="nav-search" id="nav-search">
                            <form class="form-search">
                                <span class="input-icon">
                                    <input type="text" placeholder="Search ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
                                    <i class="icon-search nav-search-icon"></i>
                                </span>
                            </form>
                        </div><!-- #nav-search -->
                    </div>

                    <div class="page-content">
                        <div class="row">
                            <div class="col-xs-12">
                                <!-- PAGE CONTENT BEGINS -->
                                <div class="col-xs-12">
                                    <!-- PAGE CONTENT BEGINS -->
                                    <form class="form-horizontal" role="form">
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label no-padding-right" for="form-field-1">商户名称：</label>
                                            <div class="col-sm-9">
                                                <span>天使快递</span>
                                            </div>
                                        </div>
                                        <div class="space-4"></div>
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label no-padding-right" for="form-field-2">自身行业：</label>
                                            <div class="col-sm-9">
                                                <select class="form-control" id="form-field-select-1" style="width: 320px;">
                                                    <option value="-1">请选择</option>
                                                    <option value="1">物流</option>
                                                    <option value="2">仓库</option>
                                                    <option value="3">分拣设备</option>
                                                    <option value="4">升降台</option>
                                                    <option value="5">淘宝卖家</option>
                                                    <option value="6">京东卖家</option>
                                                    <option value="7">软件</option>
                                                    <option value="8">服务器</option>
                                                    <option value="9">数据库</option>
                                                    <option value="10">域名</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="space-4"></div>
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label no-padding-right" for="form-input-readonly">上游行业：</label>
                                            <div class="col-sm-9" id="upTradesList">
                                            </div>
                                        </div>
                                        <div class="space-4"></div>
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label no-padding-right" for="form-field-tags">下游行业：</label>
                                            <div class="col-sm-9" id="downTradesList">
                                            </div>
                                        </div>
                                        <div class="clearfix form-actions">
                                            <div class="col-md-offset-3 col-md-9">
                                                <button class="btn btn-info" id="saveBtn" type="button">
                                                    <i class="icon-ok bigger-110"></i>
                                                    提交
                                                </button>
                                                &nbsp; &nbsp; &nbsp;
                                                <button class="btn" type="reset">
                                                    <i class="icon-undo bigger-110"></i>
                                                    重置
                                                </button>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                                <!-- PAGE CONTENT ENDS -->
                            </div><!-- /.col -->
                        </div><!-- /.row -->
                    </div><!-- /.page-content -->
                </div><!-- /.main-content -->
            </div><!-- /.main-container-inner -->

            <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
                <i class="icon-double-angle-up icon-only bigger-110"></i>
            </a>
        </div><!-- /.main-container -->

        <script type="text/javascript" src="js/jquery-2.0.3.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/typeahead-bs2.min.js"></script>

        <!-- page specific plugin scripts -->

        <!-- ace scripts -->

        <script src="js/ace-elements.min.js"></script>
        <script src="js/ace.min.js"></script>
        <script src="js/echarts.min.js"></script>
        <script>
        $(function () {
            $('#form-field-select-1').on('change', function () {
                var tradeId = $('#form-field-select-1').val();
                $.ajax({
                    url: '/Nakri/trade/showTradeUpAndDown',
                    method: 'GET',
                    data: {
                        tradeId: tradeId
                    }
                }).done(function (res) {
                    if (res.status === 0) {
                        $('#upTradesList').html(buildTrade('tradeGraphUps', res.data.tradeGraphUps));
                        $('#downTradesList').html(buildTrade('tradeGraphDowns', res.data.tradeGraphDowns));
                    }
                    else {
                        alert(res.stautsInfo || '网络连接错误，请稍候重试！');
                    }
                });
            });

            function buildTrade(type, datalist) {
                var fieldName = type;
                var tpl = '<div class="checkbox"><label><input name=" ' + fieldName + '" type="checkbox" class="ace" value="#value#"> <span class="lbl">#text#</span></label></div>';
                var html = [];
                $.each(datalist || [], function (index, item) {
                    html.push(tpl.replace('#value#', item.id).replace('#text#', item.name));
                });
                return html.join('');
            }

            $('#saveBtn').on('click', function () {
                var tradeId = $('#form-field-select-1').val();
                var downTrades = $(':checkbox[name=tradeGraphDowns]:checked').val();
                var upTrades = $(':checkbox[name=tradeGraphUps]:checked').val();
                var formData = {
                    tradeId: tradeId,
                    custId: '123123',
                    tradeGraphDowns: downTrades,
                    tradeGraphUps: upTrades
                };
                $.ajax({
                    url: '/Nakri/trade/markCustTrade',
                    type: 'POST',
                    data: formData
                }).done(function (res) {
                    if (res.status === 0) {
                        window.location.href = '/Nakri/showHome';
                    }
                    else {
                        alert(res.stautsInfo || '网络连接错误，请稍候重试！');
                    }
                });
            });
        });
        </script>
</body>
</html>

