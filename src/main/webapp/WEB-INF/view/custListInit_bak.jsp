<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.baidu.rigel.cust.vo.CustQueryVo" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; carset=UTF-8">
    <title>客户资料</title>
    <!-- iocn -->
    <link type="image/x-icon" rel="shortcut icon" href="/Nakri/img/angela.jpg"/>
    <!-- basic styles -->
    <link rel="stylesheet" href="/Nakri/css/bootstrap.min.css"/>
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
    <link rel="stylesheet" href="/Nakri/css/ace-skins.min.css"/>

    <!--[if lte IE 8]>
    <link rel="stylesheet" href="/Nakri/css/ace-ie.min.css"/>
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
        try {
            ace.settings.check('main-container', 'fixed')
        } catch (e) {
        }
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
                <%--<li>
                    <a href="/Nakri/showHome">
                        <i class="icon-dashboard"></i>
                        <span class="menu-text"> 控制台 </span>
                    </a>
                </li>--%>
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
                    try {
                        ace.settings.check('breadcrumbs', 'fixed')
                    } catch (e) {
                    }
                </script>

                <ul class="breadcrumb">
                    <li>
                        <i class="icon-home home-icon"></i>
                        <a href="/Nakri/showHome">Home</a>
                    </li>

                    <li>
                        <a href="#">查询资料</a>
                    </li>
                </ul>
            </div>
            <div class="page-content">
                <div class="row12">
                    <div class="well">
                        <form action="/Nakri/cust/query" method="post" id="queryForm" class="form-inline">
                            <span class="input-icon align-middle">
                            客户名称：
                            <input id="companyName" name="companyName" type="text" class="search-query"
                                   placeholder="输入客户名称"/>
                            </span>
                            &nbsp;
                            <span class="input-icon align-middle">
                            客户种类：
                            <select class="form-control-inline" id="custCategory" name="custCategory">
                                    <option value="1" selected>上游目标客户</option>
                                    <option value="2">下游供应商</option>
                                </select>
                            </span>
                            &nbsp;
                            <span class="input-icon align-middle">
                            客户类型：
                            <select class="form-control-inline" id="custType" name="custType">
                                <option value="0" selected>普通企业</option>
                                <option value="1">特殊企业</option>
                                <option value="2">个人客户</option>
                                <option value="3">广告代理</option>
                                <option value="4">政府组织</option>
                                </select>
                            </span>
                            &nbsp;
                            <span class="input-icon align-middle">
                            来源：
                            <select class="form-control-inline" id="source" name="source">
                                    <option value="1">自上传</option>
                                    <option value="2">信任网络</option>
                                    <option value="3">加v客户</option>
                                <option value="4">c2b客户</option>
                                </select>
                            </span>
                            <button class="btn btn-sm" type="submit">
                                <i class="icon-search"></i>查询
                            </button>
                           <%-- <button class="btn btn-sm btn-info">
                                <i class="icon-external-link"></i>营销
                            </button>--%>
                        </form>
                    </div>
                </div>

                <div class="row">
                    <div class="col-xs-12">
                        <!-- PAGE CONTENT BEGINS -->
                        <div class="row">
                            <div class="col-xs-12">
                                <div class="table-responsive">
                                    <table id="sample-table-2" class="table table-striped table-bordered table-hover">
                                        <thead>
                                        <tr>
                                            <th class="center">
                                                <label>
                                                    <input type="checkbox" class="ace"/>
                                                    <span class="lbl"></span>
                                                </label>
                                            </th>
                                            <th>公司名称</th>
                                            <th>客户种类</th>
                                            <th>客户行业</th>
                                            <th>客户类型</th>
                                            <th class="hidden-480">状态</th>
                                            <th></th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${custList}" var="p">
                                            <tr>
                                                <td class="center">
                                                    <label>
                                                        <input type="checkbox" class="ace"/>
                                                        <span class="lbl"></span>
                                                    </label>
                                                </td>

                                                <td>
                                                    <a href="#">${p.companyName}</a>
                                                </td>
                                                <td>${p.custCategoryDesc}</td>

                                                <td>${p.tradeDesc}</td>

                                                <td class="hidden-480">
                                                    <span class="label label-sm label-success">${p.custTypeDesc}</span>
                                                </td>
                                                <td class="hidden-480">
                                                    <span class="label label-sm label-success">${p.statusDesc}</span>
                                                </td>
                                                <td>
                                                    <div class="visible-md visible-lg hidden-sm hidden-xs action-buttons">
                                                        <a class="blue" href="#">
                                                            <i class="icon-external-link"></i>
                                                        </a>

                                                        <a class="green" href="#">
                                                            <i class="icon-pencil bigger-130"></i>
                                                        </a>

                                                        <a class="red" href="#">
                                                            <i class="icon-trash bigger-130"></i>
                                                        </a>
                                                    </div>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>

                        <div id="modal-table" class="modal fade" tabindex="-1">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header no-padding">
                                        <div class="table-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                                <span class="white">&times;</span>
                                            </button>
                                            Results for "Latest Registered Domains
                                        </div>
                                    </div>

                                    <div class="modal-body no-padding">
                                        <table class="table table-striped table-bordered table-hover no-margin-bottom no-border-top">
                                            <thead>
                                            <tr>
                                                <th>Domain</th>
                                                <th>Price</th>
                                                <th>Clicks</th>

                                                <th>
                                                    <i class="icon-time bigger-110"></i>
                                                    Update
                                                </th>
                                            </tr>
                                            </thead>

                                            <tbody>
                                            <tr>
                                                <td>
                                                    <a href="#">ace.com</a>
                                                </td>
                                                <td>$45</td>
                                                <td>3,330</td>
                                                <td>Feb 12</td>
                                            </tr>

                                            <tr>
                                                <td>
                                                    <a href="#">base.com</a>
                                                </td>
                                                <td>$35</td>
                                                <td>2,595</td>
                                                <td>Feb 18</td>
                                            </tr>

                                            <tr>
                                                <td>
                                                    <a href="#">max.com</a>
                                                </td>
                                                <td>$60</td>
                                                <td>4,400</td>
                                                <td>Mar 11</td>
                                            </tr>

                                            <tr>
                                                <td>
                                                    <a href="#">best.com</a>
                                                </td>
                                                <td>$75</td>
                                                <td>6,500</td>
                                                <td>Apr 03</td>
                                            </tr>

                                            <tr>
                                                <td>
                                                    <a href="#">pro.com</a>
                                                </td>
                                                <td>$55</td>
                                                <td>4,250</td>
                                                <td>Jan 21</td>
                                            </tr>
                                            </tbody>
                                        </table>
                                    </div>

                                    <div class="modal-footer no-margin-top">
                                        <button class="btn btn-sm btn-danger pull-left" data-dismiss="modal">
                                            <i class="icon-remove"></i>
                                            Close
                                        </button>

                                        <ul class="pagination pull-right no-margin">
                                            <li class="prev disabled">
                                                <a href="#">
                                                    <i class="icon-double-angle-left"></i>
                                                </a>
                                            </li>

                                            <li class="active">
                                                <a href="#">1</a>
                                            </li>

                                            <li>
                                                <a href="#">2</a>
                                            </li>

                                            <li>
                                                <a href="#">3</a>
                                            </li>

                                            <li class="next">
                                                <a href="#">
                                                    <i class="icon-double-angle-right"></i>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                </div><!-- /.modal-content -->
                            </div><!-- /.modal-dialog -->
                        </div><!-- PAGE CONTENT ENDS -->
                    </div>
                </div>
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
    window.jQuery || document.write("<script src='/Nakri/js/jquery-2.0.3.min.js'>" + "<" + "/script>");
</script>

<!-- <![endif]-->

<!--[if IE]>
<script type="text/javascript">
    window.jQuery || document.write("<script src='/Nakri/js/jquery-1.10.2.min.js'>" + "<" + "/script>");
</script>
<![endif]-->

<script type="text/javascript">
    if ("ontouchend" in document) document.write("<script src='/Nakri/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
</script>
<script src="/Nakri/js/bootstrap.min.js"></script>
<script src="/Nakri/js/typeahead-bs2.min.js"></script>

<!-- page specific plugin scripts -->

<script src="/Nakri/js/jquery.dataTables.min.js"></script>
<script src="/Nakri/js/jquery.dataTables.bootstrap.js"></script>

<!-- ace scripts -->

<script src="/Nakri/js/ace-elements.min.js"></script>
<script src="/Nakri/js/ace.min.js"></script>

<!-- inline scripts related to this page -->

<a href="#">${p.companyName}</a>
</td>
<td>${p.custCategoryDesc}</td>

<td>${p.tradeDesc}</td>

<td class="hidden-480">
    <span class="label label-sm label-success">${p.custTypeDesc}</span>
</td>
<td class="hidden-480">
    <span class="label label-sm label-success">${p.statusDesc}</span>
</td>


<script type="text/javascript">
    jQuery(function ($) {
        function render(datalist) {
            var oTable1 = $('#sample-table-2').dataTable({
                data: datalist,
                columns: [
                    {"bSortable": false, "mDataProp": "custId"},
                    {"bSortable": false, "mDataProp": "companyName", 'title': '公司名称'},
                    {"bSortable": false, "mDataProp": "custCategoryDesc", 'title': '客户种类'},
                    {"bSortable": false, "mDataProp": "tradeDesc", 'title': '客户行业'},
                    {"bSortable": false, "mDataProp": "custTypeDesc", 'title': '客户类型'},
                    {"bSortable": false, "mDataProp": "statusDesc", 'title': '状态'},
                    {"bSortable": false}
                ],
                fnDrawCallback: function (settings) {
                    console.log('render completed...');
                }
            });
        }

        function queryToJson(query) {
            if (!query) {
                return {};
            }
            var rs = {};
            $.each(query.split('&'), function (index, item) {
                var param = item.split('=');
                param[0] && (rs[param[0]] = param[1] || '');
            });
            return rs;
        }

        $('#searchBtn').on('click', function () {
            var formData = $('#queryForm').serialize();
            formData = queryToJson(formData);
            $.ajax({
                url: '/Nakri/cust/query',
                method: 'post',
                data: formData,
                success: function (res) {
                    if (res.status === 0) {
                        render(res.data);
                    }
                    else {
                        alert('请求错误');
                    }
                }
            })
        });


        $('table th input:checkbox').on('click', function () {
            var that = this;
            $(this).closest('table').find('tr > td:first-child input:checkbox')
                    .each(function () {
                        this.checked = that.checked;
                        $(this).closest('tr').toggleClass('selected');
                    });

        });


        $('[data-rel="tooltip"]').tooltip({placement: tooltip_placement});
        function tooltip_placement(context, source) {
            var $source = $(source);
            var $parent = $source.closest('table')
            var off1 = $parent.offset();
            var w1 = $parent.width();

            var off2 = $source.offset();
            var w2 = $source.width();

            if (parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2)) return 'right';
            return 'left';
        }
    })
</script>
<div style="display:none">
    <script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script>
</div>
</body>
</html>
