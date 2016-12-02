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
		<title>我的行业拓扑图</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<!-- basic styles -->
		<link href="css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="css/font-awesome.min.css" />
		<!--[if IE 7]>
		  <link rel="stylesheet" href="css/font-awesome-ie7.min.css" />
		<![endif]-->
		<!-- page specific plugin styles -->
		<!-- fonts -->
		<!-- ace styles -->
		<link rel="stylesheet" href="css/ace.min.css" />
		<link rel="stylesheet" href="css/ace-rtl.min.css" />
		<link rel="stylesheet" href="css/ace-skins.min.css" />

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
                        <a href="/Nakri/showHome">
                            <i class="icon-home home-icondashboard"></i>
                            <span class="menu-text"> Home </span>
                        </a>
                    </li>
	                <li>
	                    <a href="#" class="dropdown-toggle">
	                        <i class="icon-list"></i>
	                        <span class="menu-text"> 客户资料 </span>

	                        <b class="arrow icon-angle-down"></b>
	                    </a>
	                    <ul class="submenu">
	                        <li>
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
							<li class="active">行业拓扑图</li>
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
							<!-- PAGE CONTENT BEGINS -->
							<div id="tpChart"　style="width: 660px; height: 500px;"></div>
							<!-- PAGE CONTENT ENDS -->
						</div><!-- /.row -->
					</div><!-- /.page-content -->
				</div><!-- /.main-content -->


			</div><!-- /.main-container-inner -->

			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="icon-double-angle-up icon-only bigger-110"></i>
			</a>
		</div><!-- /.main-container -->

		<!-- basic scripts -->
		<script type="text/javascript" src="js/jquery-2.0.3.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/typeahead-bs2.min.js"></script>

		<!-- page specific plugin scripts -->

		<!-- ace scripts -->

		<script src="js/ace-elements.min.js"></script>
		<script src="js/ace.min.js"></script>
		<script src="js/echarts.min.js"></script>
		<script>
			$('#tpChart').css('height', 500);
			$('#tpChart').css('width', 600);
		$(function () {
			var echart = echarts.init(document.getElementById('tpChart'));
			function getData () {
				$.ajax({
					url: '/Nakri/trade/showTradeRelations',
	                type: 'GET'
	            }).done(function (res) {
	                showChart(res.data);
	            });
			}

			// 图点击事件
			function eConsole (param) {
	            if (param.data.id === '1') {
	                location.href = '/Nakri/cust/custList';
	            }
			}

			function showChart (graph) {
			    var categories = [];
			    for (var i = 0; i < 9; i++) {
			        categories.push({
			            name: '~' + (i + 1)
			        });
			    }
			    graph.nodes.forEach(node => {
			        node.value = node.symbolSize;
			        node.symbolSize /= 1.5;
			        node.label = {
			            normal: {
			                show: node.symbolSize > 5
			            }
			        };
			        node.category = node.category;
			    });
			    var option = {
			        tooltip: {},
			        legend: [{
			            data: [] // categories
			        }],
			        animationDuration: 1500,
			        animationEasingUpdate: 'quinticInOut',
			        series: [{
			            name: '',
			            type: 'graph',
			            layout: 'none',
			            data: graph.nodes,
			            links: graph.links,
			            categories: categories,
			            roam: true,
			            label: {
			                normal: {
			                    position: 'right',
			                    formatter: '{b}'
			                }
			            },
			            lineStyle: {
			                normal: {
			                    color: 'source',
			                    curveness: 0.5 // 弧度
			                }
			            },
			            focusNodeAdjacency: true
			        }]
			    };
			    echart.setOption(option);
			    // 绑定点击事件
			    echart.on('click', eConsole);
			}

			getData();
		});
		</script>
</body>
</html>

