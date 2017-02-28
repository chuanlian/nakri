<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8" />
    <title>获取客户资料列表</title>

    <!-- basic styles -->

    <link href="/Nakri/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="/Nakri/css/font-awesome.min.css" />

    <!--[if IE 7]>
    <link rel="stylesheet" href="/Nakri/css/font-awesome-ie7.min.css" />
    <![endif]-->

    <!-- page specific plugin styles -->

    <link rel="stylesheet" href="/Nakri/css/select2.css" />

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
                        <li >
                            <a href="/Nakri/cust/custList">
                                <i class="icon-double-angle-right"></i>
                                查询资料
                            </a>
                        </li>

                        <li >
                            <a href="/Nakri/cust/syncCustInit">
                                <i class="icon-double-angle-right"></i>
                                获取资料
                            </a>
                        </li>
                        <li class="active">
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
                        <a href="#">获取资料</a>
                    </li>
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


                        <div class="row-fluid">
                            <div class="span12">
                                <div class="widget-box">
                                    <div class="widget-header widget-header-blue widget-header-flat">
                                        <h4 class="lighter">贡献资料向导</h4>


                                    </div>

                                    <div class="widget-body">
                                        <div class="widget-main">
                                            <div id="fuelux-wizard" class="row-fluid" data-target="#step-container">
                                                <ul class="wizard-steps">
                                                    <li data-target="#step1" class="active">
                                                        <span class="step">1</span>
                                                        <span class="title">填写参数</span>
                                                    </li>

                                                    <li data-target="#step2" >
                                                        <span class="step">2</span>
                                                        <span class="title">查询资料</span>
                                                    </li>

                                                    <li data-target="#step3" >
                                                        <span class="step">3</span>
                                                        <span class="title">推送资料</span>
                                                    </li>

                                                    <li data-target="#step4" >
                                                        <span class="step">4</span>
                                                        <span class="title">换取积分</span>
                                                    </li>
                                                </ul>
                                            </div>

                                            <hr />
                                            <div class="step-content row-fluid position-relative" id="step-container">
                                                <div class="step-pane active" id="step1">
                                                    <h3 class="lighter block green">设置参数</h3>

                                                    <form class="form-horizontal" id="sample-form">
                                                        <div class="form-group has-success">
                                                            <label for="inputInfo" class="col-xs-12 col-sm-3 control-label no-padding-right">选择客户行业</label>

                                                            <div class="col-xs-12 col-sm-5">
																		<span class="block input-icon input-icon-right">
																			 <select class="form-control" id="form-field-select-3">
                                                                                <option value="0" selected>物流</option>
                                                                                <option value="1">仓库</option>
                                                                                <option value="2">软件</option>
                                                                                <option value="3">域名</option>
                                                                                <option value="4">餐饮</option>
                                                                                </select>

                                                                            <span class="icon-caret-down icon-only"></span>
																		</span>
                                                            </div>
                                                        </div>

                                                        <div class="form-group has-success">
                                                            <label for="inputWarning" class="col-xs-12 col-sm-3 control-label no-padding-right">选择客户类型</label>

                                                            <div class="col-xs-12 col-sm-5">
																		<span class="block input-icon input-icon-right">
																			 <select class="form-control" id="form-field-select-1">
                                                                                <option value="0" selected>普通企业</option>
                                                                                <option value="1">特殊企业</option>
                                                                                <option value="2">个人客户</option>
                                                                                <option value="3">广告代理</option>
                                                                                <option value="4">政府组织</option>
                                                                            </select>
																			<span class="icon-caret-down icon-only"></span>
																		</span>
                                                            </div>
                                                        </div>

                                                        <div class="form-group has-success">
                                                            <label for="inputError" class="col-xs-12 col-sm-3 col-md-3 control-label no-padding-right">选择客户种类</label>
                                                            <div class="col-xs-12 col-sm-5">
																		<span class="block input-icon input-icon-right">
																			 <select class="form-control" id="form-field-select-2">
                                                                                <option value="1" selected>下游目标客户</option>
                                                                                <option value="2">上游供应商</option>
                                                                            </select>
																			<span class="icon-caret-down icon-only"></span>
																		</span>
                                                            </div>

                                                        </div>

                                                        <div class="form-group has-success">
                                                            <label for="inputSuccess" class="col-xs-12 col-sm-3 control-label no-padding-right">输入获取数量</label>

                                                            <div class="col-xs-12 col-sm-5">
																		<span class="block input-icon input-icon-right">
																			<input type="text" id="inputSuccess" class="width-100" value="21" />
																			<i class="icon-ok-sign"></i>
																		</span>
                                                            </div>
                                                        </div>


                                                    </form>

                                                    <form class="form-horizontal hide" id="validation-form" method="get">
                                                        <div class="form-group">
                                                            <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="email">Email Address:</label>

                                                            <div class="col-xs-12 col-sm-9">
                                                                <div class="clearfix">
                                                                    <input type="email" name="email" id="email" class="col-xs-12 col-sm-6" />
                                                                </div>
                                                            </div>
                                                        </div>

                                                        <div class="space-2"></div>

                                                        <div class="form-group">
                                                            <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="password">Password:</label>

                                                            <div class="col-xs-12 col-sm-9">
                                                                <div class="clearfix">
                                                                    <input type="password" name="password" id="password" class="col-xs-12 col-sm-4" />
                                                                </div>
                                                            </div>
                                                        </div>

                                                        <div class="space-2"></div>

                                                        <div class="form-group">
                                                            <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="password2">Confirm Password:</label>

                                                            <div class="col-xs-12 col-sm-9">
                                                                <div class="clearfix">
                                                                    <input type="password" name="password2" id="password2" class="col-xs-12 col-sm-4" />
                                                                </div>
                                                            </div>
                                                        </div>

                                                        <div class="hr hr-dotted"></div>

                                                        <div class="form-group">
                                                            <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="name">Company Name:</label>

                                                            <div class="col-xs-12 col-sm-9">
                                                                <div class="clearfix">
                                                                    <input type="text" id="name" name="name" class="col-xs-12 col-sm-5" />
                                                                </div>
                                                            </div>
                                                        </div>

                                                        <div class="space-2"></div>

                                                        <div class="form-group">
                                                            <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="phone">Phone Number:</label>

                                                            <div class="col-xs-12 col-sm-9">
                                                                <div class="input-group">
																			<span class="input-group-addon">
																				<i class="icon-phone"></i>
																			</span>

                                                                    <input type="tel" id="phone" name="phone" />
                                                                </div>
                                                            </div>
                                                        </div>

                                                        <div class="space-2"></div>

                                                        <div class="form-group">
                                                            <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="url">Company URL:</label>

                                                            <div class="col-xs-12 col-sm-9">
                                                                <div class="clearfix">
                                                                    <input type="url" id="url" name="url" class="col-xs-12 col-sm-8" />
                                                                </div>
                                                            </div>
                                                        </div>

                                                        <div class="hr hr-dotted"></div>

                                                        <div class="form-group">
                                                            <label class="control-label col-xs-12 col-sm-3 no-padding-right">Subscribe to</label>

                                                            <div class="col-xs-12 col-sm-9">
                                                                <div>
                                                                    <label>
                                                                        <input name="subscription" value="1" type="checkbox" class="ace" />
                                                                        <span class="lbl"> Latest news and announcements</span>
                                                                    </label>
                                                                </div>

                                                                <div>
                                                                    <label>
                                                                        <input name="subscription" value="2" type="checkbox" class="ace" />
                                                                        <span class="lbl"> Product offers and discounts</span>
                                                                    </label>
                                                                </div>
                                                            </div>
                                                        </div>

                                                        <div class="space-2"></div>

                                                        <div class="form-group">
                                                            <label class="control-label col-xs-12 col-sm-3 no-padding-right">Gender</label>

                                                            <div class="col-xs-12 col-sm-9">
                                                                <div>
                                                                    <label class="blue">
                                                                        <input name="gender" value="1" type="radio" class="ace" />
                                                                        <span class="lbl"> Male</span>
                                                                    </label>
                                                                </div>

                                                                <div>
                                                                    <label class="blue">
                                                                        <input name="gender" value="2" type="radio" class="ace" />
                                                                        <span class="lbl"> Female</span>
                                                                    </label>
                                                                </div>
                                                            </div>
                                                        </div>

                                                        <div class="hr hr-dotted"></div>

                                                        <div class="form-group">
                                                            <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="state">State</label>

                                                            <div class="col-xs-12 col-sm-9">
                                                                <select id="state" name="state" class="select2" data-placeholder="Click to Choose...">
                                                                    <option value="">&nbsp;</option>
                                                                    <option value="AL">Alabama</option>
                                                                    <option value="AK">Alaska</option>
                                                                    <option value="AZ">Arizona</option>
                                                                    <option value="AR">Arkansas</option>
                                                                    <option value="CA">California</option>
                                                                    <option value="CO">Colorado</option>
                                                                    <option value="CT">Connecticut</option>
                                                                    <option value="DE">Delaware</option>
                                                                    <option value="FL">Florida</option>
                                                                    <option value="GA">Georgia</option>
                                                                    <option value="HI">Hawaii</option>
                                                                    <option value="ID">Idaho</option>
                                                                    <option value="IL">Illinois</option>
                                                                    <option value="IN">Indiana</option>
                                                                    <option value="IA">Iowa</option>
                                                                    <option value="KS">Kansas</option>
                                                                    <option value="KY">Kentucky</option>
                                                                    <option value="LA">Louisiana</option>
                                                                    <option value="ME">Maine</option>
                                                                    <option value="MD">Maryland</option>
                                                                    <option value="MA">Massachusetts</option>
                                                                    <option value="MI">Michigan</option>
                                                                    <option value="MN">Minnesota</option>
                                                                    <option value="MS">Mississippi</option>
                                                                    <option value="MO">Missouri</option>
                                                                    <option value="MT">Montana</option>
                                                                    <option value="NE">Nebraska</option>
                                                                    <option value="NV">Nevada</option>
                                                                    <option value="NH">New Hampshire</option>
                                                                    <option value="NJ">New Jersey</option>
                                                                    <option value="NM">New Mexico</option>
                                                                    <option value="NY">New York</option>
                                                                    <option value="NC">North Carolina</option>
                                                                    <option value="ND">North Dakota</option>
                                                                    <option value="OH">Ohio</option>
                                                                    <option value="OK">Oklahoma</option>
                                                                    <option value="OR">Oregon</option>
                                                                    <option value="PA">Pennsylvania</option>
                                                                    <option value="RI">Rhode Island</option>
                                                                    <option value="SC">South Carolina</option>
                                                                    <option value="SD">South Dakota</option>
                                                                    <option value="TN">Tennessee</option>
                                                                    <option value="TX">Texas</option>
                                                                    <option value="UT">Utah</option>
                                                                    <option value="VT">Vermont</option>
                                                                    <option value="VA">Virginia</option>
                                                                    <option value="WA">Washington</option>
                                                                    <option value="WV">West Virginia</option>
                                                                    <option value="WI">Wisconsin</option>
                                                                    <option value="WY">Wyoming</option>
                                                                </select>
                                                            </div>
                                                        </div>

                                                        <div class="space-2"></div>

                                                        <div class="form-group">
                                                            <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="platform">Platform</label>

                                                            <div class="col-xs-12 col-sm-9">
                                                                <div class="clearfix">
                                                                    <select class="input-medium" id="platform" name="platform">
                                                                        <option value="">------------------</option>
                                                                        <option value="linux">Linux</option>
                                                                        <option value="windows">Windows</option>
                                                                        <option value="mac">Mac OS</option>
                                                                        <option value="ios">iOS</option>
                                                                        <option value="android">Android</option>
                                                                    </select>
                                                                </div>
                                                            </div>
                                                        </div>

                                                        <div class="space-2"></div>

                                                        <div class="form-group">
                                                            <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="comment">Comment</label>

                                                            <div class="col-xs-12 col-sm-9">
                                                                <div class="clearfix">
                                                                    <textarea class="input-xlarge" name="comment" id="comment"></textarea>
                                                                </div>
                                                            </div>
                                                        </div>

                                                        <div class="space-8"></div>

                                                        <div class="form-group">
                                                            <div class="col-xs-12 col-sm-4 col-sm-offset-3">
                                                                <label>
                                                                    <input name="agree" id="agree" type="checkbox" class="ace" />
                                                                    <span class="lbl"> I accept the policy</span>
                                                                </label>
                                                            </div>
                                                        </div>
                                                    </form>
                                                </div>

                                                <div class="step-pane" id="step2">
                                                    <div class="row-fluid">
                                                        <div class="alert alert-success">
                                                            <button type="button" class="close" data-dismiss="alert">
                                                                <i class="icon-remove"></i>
                                                            </button>

                                                            <strong>
                                                                <i class="icon-ok"></i>
                                                                Well done!
                                                            </strong>

                                                            库中有足够符合条件的资料，请继续下一步.
                                                            <br />
                                                        </div>


                                                    </div>
                                                </div>

                                                <div class="step-pane" id="step3">
                                                    <div class="center">
                                                        <h3 class="blue lighter">正在将符合条件的资料分享到百度资料库……</h3>
                                                    </div>
                                                </div>

                                                <div class="step-pane" id="step4">
                                                    <div class="center">
                                                        <h3 class="green">Congrats!</h3>
                                                        分享成功，成功换取积分！
                                                    </div>
                                                </div>
                                            </div>

                                            <hr />
                                            <div class="row-fluid wizard-actions">
                                                <button class="btn btn-success btn-next" data-last="Finish ">
                                                    下一步
                                                </button>
                                            </div>
                                        </div><!-- /widget-main -->
                                    </div><!-- /widget-body -->
                                </div>
                            </div>
                        </div>

                        <div id="modal-wizard" class="modal">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header" data-target="#modal-step-contents">
                                        <ul class="wizard-steps">
                                            <li data-target="#modal-step1" class="active">
                                                <span class="step">1</span>
                                                <span class="title">Validation states</span>
                                            </li>

                                            <li data-target="#modal-step2">
                                                <span class="step">2</span>
                                                <span class="title">Alerts</span>
                                            </li>

                                            <li data-target="#modal-step3">
                                                <span class="step">3</span>
                                                <span class="title">Payment Info</span>
                                            </li>

                                            <li data-target="#modal-step4">
                                                <span class="step">4</span>
                                                <span class="title">Other Info</span>
                                            </li>
                                        </ul>
                                    </div>

                                    <div class="modal-body step-content" id="modal-step-contents">
                                        <div class="step-pane active" id="modal-step1">
                                            <div class="center">
                                                <h4 class="blue">Step 1</h4>
                                            </div>
                                        </div>

                                        <div class="step-pane" id="modal-step2">
                                            <div class="center">
                                                <h4 class="blue">Step 2</h4>
                                            </div>
                                        </div>

                                        <div class="step-pane" id="modal-step3">
                                            <div class="center">
                                                <h4 class="blue">Step 3</h4>
                                            </div>
                                        </div>

                                        <div class="step-pane" id="modal-step4">
                                            <div class="center">
                                                <h4 class="blue">Step 4</h4>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="modal-footer wizard-actions">
                                        <button class="btn btn-sm btn-prev">
                                            <i class="icon-arrow-left"></i>
                                            Prev
                                        </button>

                                        <button class="btn btn-success btn-sm btn-next" data-last="Finish ">
                                            Next
                                            <i class="icon-arrow-right icon-on-right"></i>
                                        </button>

                                        <button class="btn btn-danger btn-sm pull-left" data-dismiss="modal">
                                            <i class="icon-remove"></i>
                                            Cancel
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div><!-- PAGE CONTENT ENDS -->
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

<script src="/Nakri/js/fuelux/fuelux.wizard.min.js"></script>
<script src="/Nakri/js/jquery.validate.min.js"></script>
<script src="/Nakri/js/additional-methods.min.js"></script>
<script src="/Nakri/js/bootbox.min.js"></script>
<script src="/Nakri/js/jquery.maskedinput.min.js"></script>
<script src="/Nakri/js/select2.min.js"></script>

<!-- ace scripts -->

<script src="/Nakri/js/ace-elements.min.js"></script>
<script src="/Nakri/js/ace.min.js"></script>

<!-- inline scripts related to this page -->

<script type="text/javascript">
    jQuery(function($) {

        $('[data-rel=tooltip]').tooltip();

        $(".select2").css('width','200px').select2({allowClear:true})
                .on('change', function(){
                    $(this).closest('form').validate().element($(this));
                });


        var $validation = false;
        $('#fuelux-wizard').ace_wizard().on('change' , function(e, info){
            if(info.step == 1 && $validation) {
                if(!$('#validation-form').valid()) return false;
            }
        }).on('finished', function(e) {
            $.ajax({
                type: 'POST',
                url: "/Nakri/jichuang/devote" ,
                data: "" ,
                success: function(data) {
                    bootbox.dialog({
                        message: "分享资料，获取积分成功",
                        buttons: {
                            "success" : {
                                "label" : "OK",
                                "className" : "btn-sm btn-primary"
                            }
                        }
                    })
                }
            });
        }).on('stepclick', function(e){
            //return false;//prevent clicking on steps
        });


        $('#skip-validation').removeAttr('checked').on('click', function(){
            $validation = this.checked;
            if(this.checked) {
                $('#sample-form').hide();
                $('#validation-form').removeClass('hide');
            }
            else {
                $('#validation-form').addClass('hide');
                $('#sample-form').show();
            }
        });



        //documentation : http://docs.jquery.com/Plugins/Validation/validate


        $.mask.definitions['~']='[+-]';
        $('#phone').mask('(999) 999-9999');

        jQuery.validator.addMethod("phone", function (value, element) {
            return this.optional(element) || /^\(\d{3}\) \d{3}\-\d{4}( x\d{1,6})?$/.test(value);
        }, "Enter a valid phone number.");

        $('#validation-form').validate({
            errorElement: 'div',
            errorClass: 'help-block',
            focusInvalid: false,
            rules: {
                email: {
                    required: true,
                    email:true
                },
                password: {
                    required: true,
                    minlength: 5
                },
                password2: {
                    required: true,
                    minlength: 5,
                    equalTo: "#password"
                },
                name: {
                    required: true
                },
                phone: {
                    required: true,
                    phone: 'required'
                },
                url: {
                    required: true,
                    url: true
                },
                comment: {
                    required: true
                },
                state: {
                    required: true
                },
                platform: {
                    required: true
                },
                subscription: {
                    required: true
                },
                gender: 'required',
                agree: 'required'
            },

            messages: {
                email: {
                    required: "Please provide a valid email.",
                    email: "Please provide a valid email."
                },
                password: {
                    required: "Please specify a password.",
                    minlength: "Please specify a secure password."
                },
                subscription: "Please choose at least one option",
                gender: "Please choose gender",
                agree: "Please accept our policy"
            },

            invalidHandler: function (event, validator) { //display error alert on form submit
                $('.alert-danger', $('.login-form')).show();
            },

            highlight: function (e) {
                $(e).closest('.form-group').removeClass('has-info').addClass('has-error');
            },

            success: function (e) {
                $(e).closest('.form-group').removeClass('has-error').addClass('has-info');
                $(e).remove();
            },

            errorPlacement: function (error, element) {
                if(element.is(':checkbox') || element.is(':radio')) {
                    var controls = element.closest('div[class*="col-"]');
                    if(controls.find(':checkbox,:radio').length > 1) controls.append(error);
                    else error.insertAfter(element.nextAll('.lbl:eq(0)').eq(0));
                }
                else if(element.is('.select2')) {
                    error.insertAfter(element.siblings('[class*="select2-container"]:eq(0)'));
                }
                else if(element.is('.chosen-select')) {
                    error.insertAfter(element.siblings('[class*="chosen-container"]:eq(0)'));
                }
                else error.insertAfter(element.parent());
            },

            submitHandler: function (form) {
            },
            invalidHandler: function (form) {
            }
        });




        $('#modal-wizard .modal-header').ace_wizard();
        $('#modal-wizard .wizard-actions .btn[data-dismiss=modal]').removeAttr('disabled');
    })
</script>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>
