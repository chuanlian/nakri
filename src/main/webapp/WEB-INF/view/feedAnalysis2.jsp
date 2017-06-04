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
    <![endif]-->
    <style>
        * {
            margin: 0;
            padding: 0;
            list-style: none;
        }

        .lanren {
            width: 450px;
            border: 1px solid #2BB7E4;
            height: 25px;
            margin: 100px auto;
        }

        #bar {
            display: block;
            background: #2BB7E4;
            float: left;
            height: 100%;
            text-align: center;
            line-height: 25px;
            color: #FFF;
        }
    </style>
</head>
<body class="login-layout">
<div style="margin:auto;width:830px;">
    <script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
    <script>
        (adsbygoogle = window.adsbygoogle || []).push({});
    </script>
</div>
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
                    <span class="red">AI&nbsp;&nbsp;</span>
                    <span class="white">正在分析……</span>
                </h1>
                <%--<h4 class="blue">&copy; Company Name</h4>--%>
            </div>
            <div class="lanren">
                <div id="bar" style="width:1%;"></div>
            </div>
        </div>
    </div>
</div>


<script>
    function $(d) {
        return document.getElementById(d);
    }
    function smation() {
        $("bar").style.width = parseInt($("bar").style.width) + 1 + "%";
        $("bar").innerHTML = $("bar").style.width;
        if ($("bar").style.width == "100%") {
            location.href = "/Nakri/jichuang2/matchFeedList";
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
<!-- 代码部分end -->
</body>
</html>