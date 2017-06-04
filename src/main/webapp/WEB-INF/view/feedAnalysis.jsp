<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--
  ~ Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
  --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/hm/loose.dtd">
<html>
<head>
    <meta charset="utf-8"/>
    <%--<meta http-equiv="refresh" content="5;URL=/Nakri/jichuang2/matchFeedList">--%>
    <title>正在分析计算...</title>

    <!-- basic styles -->

    <link href="/Nakri/css/bootstrap.min.css" rel="stylesheet"/>
    <link rel="stylesheet" href="/Nakri/css/font-awesome.min.css"/>

    <!--[if IE 7]>
    <link rel="stylesheet" href="/Nakri/css/font-awesome-ie7.min.css"/>
    <![endif]-->

    <!-- page specific plugin styles -->

    <!-- fonts -->

    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300"/>

    <!-- ace styles -->

    <link rel="stylesheet" href="/Nakri/css/ace.min.css"/>
    <link rel="stylesheet" href="/Nakri/css/ace-rtl.min.css"/>

    <!--[if lte IE 8]>
    <link rel="stylesheet" href="/Nakri/css/ace-ie.min.css"/>
    <![endif]-->

    <!-- inline styles related to this page -->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

    <!--[if lt IE 9]>
    <script src="/Nakri/js/html5shiv.js"></script>
    <script src="/Nakri/js/respond.min.js"></script>
    <script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
    <![endif]-->
</head>

<body class="login-layout">
<div class="main-container">
    <div class="main-content">
        <div class="space-6"></div>
        <div class="space-6"></div>
        <div class="space-6"></div>
        <div class="space-6"></div>
        <div class="space-6"></div>
        <div class="space-6"></div>
        <div class="space-6"></div>
        <div class="space-6"></div>
        <div class="space-6"></div>
        <div class="space-6"></div>
        <div class="space-6"></div>
        <div class="space-6"></div>
        <div class="row">
            <div class="col-sm-10 col-sm-offset-1">
                <div class="login-container">
                    <div class="center">
                        <h1>
                            <i class="icon-leaf green"></i>
                            <span class="red">AI</span>
                            <span class="white">正在分析……</span>
                        </h1>
                        <%--<h4 class="blue">&copy; Company Name</h4>--%>
                    </div>

                    <div class="space-6"></div>
                    <div class="space-6"></div>
                    <div class="space-6"></div>


                    <div class="progress progress-striped">
                        <div  id="bar" class="progress-bar progress-bar-purple" style="width: 5%"></div>
                    </div>
                    <%--<div class="easy-pie-chart percentage" data-percent="55" data-color="#87CEEB">--%>
                    <%--<span class="percent">55</span>%--%>
                </div>
                <script>
                    function $(d) {
                        return document.getElementById(d);
                    }
                    function smation() {
                        $("bar").style.width = parseInt($("bar").style.width) + 1 + "%";
                        $("bar").innerHTML = $("bar").style.width;
                        if ($("bar").style.width == "100%") {
                            window.href("/Nakri/jichuang2/matchFeedList");
                        }
                    }
                    var bar = setInterval(function () {
                        smation();
                    }, 50);
                    ;
                    window.onload = function () {
                        bar;
                    }
                </script>

                <%--<script type="text/javascript">countDown(5, '/Nakri/jichuang2/matchFeedList');</script>--%>
                <%--<script   language= "javascript "> SetTimeOut( "this.location.href= '/Nakri/jichuang2/matchFeedList' ",5000) </script>--%>
                <div id="forgot-box" class="forgot-box widget-box no-border">
                    <div class="widget-body">
                        <div class="widget-main">
                            <h4 class="header red lighter bigger">
                                <i class="icon-key"></i>
                                Retrieve Password
                            </h4>

                            <div class="space-6"></div>
                            <p>
                                Enter your email and to receive instructions
                            </p>
                        </div><!-- /widget-main -->

                        <div class="toolbar center">
                            <a href="#" onclick="show_box('login-box'); return false;"
                               class="back-to-login-link">
                                Back to login
                                <i class="icon-arrow-right"></i>
                            </a>
                        </div>
                    </div><!-- /widget-body -->
                </div><!-- /forgot-box -->

                <div id="signup-box" class="signup-box widget-box no-border">
                    <div class="widget-body">
                        <div class="widget-main">
                            <h4 class="header green lighter bigger">
                                <i class="icon-group blue"></i>
                                New User Registration
                            </h4>

                            <div class="space-6"></div>


                            <select class="form-control-inline" id="operType" name="operType">
                                <option value="-1" selected>请选择</option>
                                <option value="1">大于</option>
                                <option value="2">小于</option>
                                <option value="3">等于</option>
                            </select>
                        </div>

                        <div class="toolbar center">
                            <a href="#" onclick="show_box('login-box'); return false;"
                               class="back-to-login-link">
                                <i class="icon-arrow-left"></i>
                                Back to login
                            </a>
                        </div>
                    </div><!-- /widget-body -->
                </div><!-- /signup-box -->
            </div><!-- /position-relative -->
        </div>
    </div><!-- /.col -->
</div><!-- /.row -->
</div>
</div><!-- /.main-container -->

<!-- basic scripts -->

<!--[if !IE]> -->

<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>

<!-- <![endif]-->

<!--[if IE]>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<![endif]-->

<!--[if !IE]> -->

<script type="text/javascript">
    window.jQuery || document.write("<script src='assets/js/jquery-2.0.3.min.js'>" + "<" + "/script>");
</script>

<!-- <![endif]-->

<!--[if IE]>
<script type="text/javascript">
    window.jQuery || document.write("<script src='assets/js/jquery-1.10.2.min.js'>" + "<" + "/script>");
</script>
<![endif]-->

<script type="text/javascript">
    if ("ontouchend" in document) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
</script>

<!-- inline scripts related to this page -->

<script type="text/javascript">

    function show_box(id) {
        jQuery('.widget-box.visible').removeClass('visible');
        jQuery('#' + id).addClass('visible');
    }

</script>

<div style="display:none">
    <script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script>
</div>
</body>
</html>
