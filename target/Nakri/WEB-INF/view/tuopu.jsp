<%--
  ~ Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
  --%>

<%--
  Created by IntelliJ IDEA.
  User: yangchuanlian
  Date: 2016/10/21
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Demo</title>
  <meta http-equiv="Content-Type" content="text/html">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width">
  <link rel="shortcut icon" href="https://www.baidu.com/favicon.ico">
  <link rel="stylesheet" href="/Nakri/css2/reset.css">
  <!-- <link rel="stylesheet" href="./asset/awesome/css/bootstrap.min.css"> -->
  <link rel="stylesheet" href="/Nakri/css2/font-awesome.min.css">
  <style type="text/css">
    #header {
      position: relative;
      height: 45px;
      line-height: 45px;
      background: #438eb9;
    }
    .main-container {
      position: static;
      overflow: hidden;
    }
    .sidebar {
      width: 200px;
      float: left;
      position: relative;
      border: 1px solid #ccc;
      border-width: 0 1px 0 0;
      background: #f2f2f2;
    }
    .sidebar:before {
      content: '';
      display: block;
      width: 200px;
      position: fixed;
      bottom: 0;
      top: 0;
      z-index: -1;
      background: #f2f2f2;
      border: 1px solid #ccc;
      border-width: 0 1px 0 0;
    }
    .main-content {
      margin-left: 200px;
    }
    .mask {
      position: absolute;
      top: 0;
      left: 0;
      right: 0;
      bottom: 0;
      background: #000;
      opacity: 0.3;
      z-index: 999;
    }
    .__permission-alert {
      background: #fff;
      width: 380px;
      height: 160px;
      margin: auto;
      position: absolute;
      top: 0;
      bottom: 0;
      left: 0;
      right: 0;
      z-index: 9999;
      border: 1px solid #ccc;
      border-radius: 3px;
      box-shadow: 1px 1px 1px #ccc;
    }
    .__alert-header{
      height: 36px;
      line-height: 36px;
      padding-left: 15px;
      background: #307ecc;
      color: #fff;
      font-size: 12px;
    }
    .__alert-body {
      padding-top: 36px;
      text-align: center;
    }
    .__alert-btns {
      position: absolute;
      bottom: 0;
      left: 0;
      right: 0;
      line-height: 40px;
      text-align: right;
    }
    .__permission_btn {
      float: right;
      margin-right: 30px;
      margin-bottom: 10px;
      background: #82af6f;
      width: 80px;
      height: 25px;
      line-height: 25px;
      text-align: center;
      color: #fff;
      font-size: 12px;
      text-decoration: none;
      border-radius: 5px;
    }
  </style>
</head>
<body>
<div id="header">
  <navbar></navbar>
</div>
<div class="main-container">
  <div id="menu" class="sidebar">
    <sidebar></sidebar>
  </div>
  <div id="app" class="main-content">
    <router-view></router-view>
  </div>
</div>
<script src="/Nakri/js2/index.js"></script>
</body>
</html>
