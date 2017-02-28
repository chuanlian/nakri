<%@ page import="java.util.Calendar" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8" />
    <title>触达结果</title>

    <!-- basic styles -->

    <link href="/Nakri/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="/Nakri/css/font-awesome.min.css" />

    <!--[if IE 7]>
    <link rel="stylesheet" href="/Nakri/css/font-awesome-ie7.min.css" />
    <![endif]-->

    <!-- page specific plugin styles -->

    <!-- fonts -->

    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300" />

    <!-- ace styles -->

    <link rel="stylesheet" href="/Nakri/css/ace.min.css" />
    <link rel="stylesheet" href="/Nakri/css/ace-rtl.min.css" />
    <link rel="stylesheet" href="/Nakri/css/ace-skins.min.css" />

    <!--[if lte IE 8]>
    <link rel="stylesheet" href="/Nakri/css/ace-ie.min.css" />
    <![endif]-->

    <!-- inline styles related to this page -->

    <!-- ace settings handler -->

    <script src="/Nakri/js/ace-extra.min.js"></script>

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

    <!--[if lt IE 9]>
    <script src="/Nakri/js/html5shiv.js"></script>
    <script src="/Nakri/js/respond.min.js"></script>
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
                try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
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
            </div><!-- #sidebar-shortcuts -->

            <ul class="nav nav-list">
                <li>
                    <a href="/Nakri/showHome">
                        <i class="icon-home home-icondashboard"></i>
                        <span class="menu-text"> Home </span>
                    </a>
                </li>
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
                <i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
            </div>

            <script type="text/javascript">
                try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
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
                        <a href="/Nakri/showHome">Home</a>
                    </li>

                    <li>
                        <a href="/Nakri/cust/custList">查询资料</a>
                    </li>
                    <li class="active">触达结果</li>
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
                <div class="page-header">
                    <h1>
                        Timeline
                    </h1>
                </div><!-- /.page-header -->

                <div class="row">
                    <div class="col-xs-12">
                        <!-- PAGE CONTENT BEGINS -->

                        <div id="timeline-1">
                            <div class="row">
                                <div class="col-xs-12 col-sm-10 col-sm-offset-1">
                                    <div class="timeline-container">
                                        <div class="timeline-label">
													<span class="label label-primary arrowed-in-right label-lg">
														<b>客户意向 ：高</b>
													</span>
                                        </div>

                                        <div class="timeline-items">
                                            <div class="timeline-item clearfix">
                                                <div class="timeline-info">
                                                    <img alt="Susan't Avatar" src="/Nakri/avatars/avatar1.png" />
                                                    <span class="label label-info label-sm"></span>
                                                </div>

                                                <div class="widget-box transparent">
                                                    <div class="widget-header widget-header-small">
                                                        <h5 class="smaller">
                                                            <span class="grey">注册成功</span>
                                                        </h5>

																<span class="widget-toolbar no-border">
																	<i class="icon-time bigger-110"></i>
																	 2016-10-28 12:36
																</span>

																<span class="widget-toolbar">
																	<a href="#" data-action="reload">
																		<i class="icon-refresh"></i>
																	</a>

																	<a href="#" data-action="collapse">
																		<i class="icon-chevron-up"></i>
																	</a>
																</span>
                                                    </div>

                                                    <div class="widget-body">
                                                        <div class="widget-main">
                                                            短信查看，注册成功
                                                            <span class="red">账户激活成功</span>

                                                            <div class="space-6"></div>

                                                            <div class="widget-toolbox clearfix">



                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="timeline-item clearfix">
                                                <div class="timeline-info">
                                                    <i class="timeline-indicator icon-food btn btn-success no-hover"></i>
                                                </div>

                                                <div class="widget-box transparent">
                                                    <div class="widget-header widget-header-small hidden"></div>

                                                    <div class="widget-body">
                                                        <div class="widget-main">
                                                            短信查看，打开注册页面第二步
                                                            <div class="pull-right">
                                                                <i class="icon-time bigger-110"></i>
                                                                2016-10-28 12:27
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="timeline-item clearfix">
                                                <div class="timeline-info">
                                                    <i class="timeline-indicator icon-star btn btn-warning no-hover green"></i>
                                                </div>

                                                <div class="widget-box transparent">
                                                    <div class="widget-header widget-header-small">
                                                        <h5 class="smaller">用户反馈</h5>

																<span class="widget-toolbar no-border">
																	<i class="icon-time bigger-110"></i>
																	2016-10-28 12:23
																</span>

																<span class="widget-toolbar">
																	<a href="#" data-action="reload">
																		<i class="icon-refresh"></i>
																	</a>

																	<a href="#" data-action="collapse">
																		<i class="icon-chevron-up"></i>
																	</a>
																</span>
                                                    </div>

                                                    <div class="widget-body">
                                                        <div class="widget-main">
                                                            短信查看，打开注册页面第一步
                                                            <div class="space-6"></div>

                                                            <div class="widget-toolbox clearfix">
                                                                <div class="pull-right action-buttons">
                                                                    <div class="space-4"></div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="timeline-item clearfix">
                                                <div class="timeline-info">
                                                    <i class="timeline-indicator icon-beaker btn btn-default no-hover"></i>
                                                </div>

                                                <div class="widget-box transparent">
                                                    <div class="widget-header widget-header-small hidden"></div>

                                                    <div class="widget-body">
                                                        <div class="widget-main">
                                                            营销短信下发
                                                            <div class="pull-right">
                                                                <i class="icon-time bigger-110"></i>
                                                                2016-10-26 08:27
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
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

<!-- basic scripts -->

<!--[if !IE]> -->

<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>

<!-- <![endif]-->

<!--[if IE]>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<![endif]-->

<!--[if !IE]> -->

<script type="text/javascript">
    window.jQuery || document.write("<script src='/Nakri/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
</script>

<!-- <![endif]-->

<!--[if IE]>
<script type="text/javascript">
    window.jQuery || document.write("<script src='/Nakri/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
</script>
<![endif]-->

<script type="text/javascript">
    if("ontouchend" in document) document.write("<script src='/Nakri/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
</script>
<script src="/Nakri/js/bootstrap.min.js"></script>
<script src="/Nakri/js/typeahead-bs2.min.js"></script>

<!-- page specific plugin scripts -->

<!-- ace scripts -->

<script src="/Nakri/js/ace-elements.min.js"></script>
<script src="/Nakri/js/ace.min.js"></script>

<!-- inline scripts related to this page -->

<script type="text/javascript">
    jQuery(function($) {
        $('[data-toggle="buttons"] .btn').on('click', function(e){
            var target = $(this).find('input[type=radio]');
            var which = parseInt(target.val());
            $('[id*="timeline-"]').addClass('hide');
            $('#timeline-'+which).removeClass('hide');
        });
    });
</script>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>
