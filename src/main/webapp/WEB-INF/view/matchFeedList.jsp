<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--
  ~ Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
  --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/htm/loose.dtd">
<html>
<head>
    <meta charset="utf-8"/>
    <title>Feed潜客</title>

    <!-- basic styles -->

    <link rel="stylesheet" href="/Nakri/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/Nakri/css/font-awesome.min.css"/>

    <link rel="stylesheet" href="/Nakri/css/jquery-ui-1.10.3.full.min.css"/>
    <link rel="stylesheet" href="/Nakri/css/ace.min.css"/>
    <link rel="stylesheet" href="/Nakri/css/ace-rtl.min.css"/>
    <link rel="stylesheet" href="/Nakri/css/ace-skins.min.css"/>

    <script src="/Nakri/js/ace-extra.min.js"></script>
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
<jsp:include page="jichuangTop.jsp"></jsp:include>


<div class="page-content">

    <div class="row">
        <div class="col-xs-12">
            <div class="alert alert-block alert-success">
                <button type="button" class="close" data-dismiss="alert">
                    <i class="icon-remove"></i>
                </button>
                <i class="icon-book"></i>
                <strong class="green">
                    &nbsp;推荐理由：
                </strong>
                ${recommended}
            </div>
            <div class="row">
                <div class="col-xs-12">
                    <div class="table-responsive">
                        <table class="table table-striped table-bordered">
                            <thead>
                            <tr>
                                <th class="center">公司名称</th>
                                <th>行业</th>
                                <th>地域</th>
                                <th>联系方式</th>
                                <th class="hidden-480">推荐指数</th>
                                <th>跟进建议</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${feedList}" var="p">
                                <tr>
                                    <td>
                                            ${p.companyName}
                                    </td>

                                    <td>
                                            ${p.trade}
                                    </td>
                                    <td>
                                            ${p.address}
                                    </td>
                                    <td>
                                            ${p.contact}
                                    </td>
                                    <td align="center">
                                        <c:if test="${p.star == 3}">
                                            <%--<span class="badge badge-success">☆☆☆</span>--%>
                                            <span class="label label-sm label-inverse">C</span>
                                        </c:if>
                                        <c:if test="${p.star == 4}">
                                            <%--<span class="badge badge-warning">☆☆☆☆</span>--%>
                                            <span class="label label-sm label-info">B</span>
                                        </c:if>
                                        <c:if test="${p.star == 5}">
                                            <span class="label label-sm label-warning">A</span>
                                        </c:if>

                                    </td>
                                    <td align="center">
                                        <c:if test="${p.star == 3}">
                                            <%--<span class="badge badge-success">☆☆☆</span>--%>
                                            <i class="message-star icon-star-empty light-grey"></i>
                                            营销跟进
                                        </c:if>
                                        <c:if test="${p.star == 4}">
                                            <%--<span class="badge badge-warning">☆☆☆☆</span>--%>
                                            <i class="icon-warning-sign red"></i>
                                            &nbsp;&nbsp;高优跟进
                                        </c:if>
                                        <c:if test="${p.star == 5}">
                                            <i class="message-star icon-star orange2"></i>
                                            &nbsp;&nbsp;重点关注
                                        </c:if>

                                    </td>
                                    <td>
                                        <c:if test="${p.star == 3}">
                                            <button class="btn btn-xs btn-purple">
                                                <i class="icon-ok bigger-120">&nbsp;短信触达</i>
                                            </button>
                                            <button class="btn btn-xs btn-danger">
                                                <i class="icon-remove-sign">&nbsp;不推荐</i>
                                            </button>
                                        </c:if>
                                        <c:if test="${p.star == 4}">
                                            <button class="btn btn-xs btn-success">
                                                <i class="icon-ok bigger-120">&nbsp;销售跟进</i>
                                            </button>
                                            <button class="btn btn-xs btn-danger">
                                                <i class="icon-remove-sign">&nbsp;不推荐</i>
                                            </button>
                                        </c:if>
                                        <c:if test="${p.star == 5}">
                                            <button class="btn btn-xs btn-success">
                                                <i class="icon-ok bigger-120">&nbsp;销售跟进</i>
                                            </button>
                                            <button class="btn btn-xs btn-danger">
                                                <i class="icon-remove-sign">&nbsp;不推荐</i>
                                            </button>
                                        </c:if>

                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div><!-- /.col -->
    </div><!-- /.row -->
</div>


<script type="text/javascript">
    if ("ontouchend" in document) document.write("<script src='/Nakri/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
</script>
<!-- basic scripts -->
<script type="text/javascript" src="/Nakri/js/jquery-2.0.3.min.js"></script>

<script src="/Nakri/js/bootstrap.min.js"></script>
<script src="/Nakri/js/typeahead-bs2.min.js"></script>

<!-- page specific plugin scripts -->

<script src="/Nakri/js/jquery.dataTables.min.js"></script>
<script src="/Nakri/js/jquery.dataTables.bootstrap.js"></script>

<!-- ace scripts -->

<script src="/Nakri/js/ace-elements.min.js"></script>
<script src="/Nakri/js/ace.min.js"></script>

<script src="/Nakri/js/bootstrap.min.js"></script>
<script src="/Nakri/js/typeahead-bs2.min.js"></script>

<!-- page specific plugin scripts -->

<script src="/Nakri/js/jquery-ui-1.10.3.full.min.js"></script>
<script src="/Nakri/js/jquery.ui.touch-punch.min.js"></script>

<!-- ace scripts -->

<script src="/Nakri/js/ace-elements.min.js"></script>
<script src="/Nakri/js/ace.min.js"></script>

<!-- inline scripts related to this page -->

<script type="text/javascript">
    $('.doreach').on('click', function () {
        var custId = $(this).data('id') || '';
        if (!custId) {
            return false;
        }
        $.ajax({
            url: '/Nakri/upStreamReach/reach',
            method: 'GET',
            data: {
                custIds: custId
            }
        }).done(function (res) {
            alert(res.status === 0 ? res.data : res.statusInfo);
        });
    });

    jQuery(function ($) {
        var oTable1 = $('#sample-table-2').dataTable({
            "aoColumns": [
                {"bSortable": false},
                null, null, null, null, null,
                {"bSortable": false}
            ]
        });


        $('table th input:checkbox').on('click', function () {
            var that = this;
            $(this).closest('table').find('tr > td:first-child input:checkbox')
                    .each(function () {
                        this.checked = that.checked;
                        $(this).closest('tr').toggleClass('selected');
                    });

        });
//override dialog's title function to allow for HTML titles
        $.widget("ui.dialog", $.extend({}, $.ui.dialog.prototype, {
            _title: function (title) {
                var $title = this.options.title || '&nbsp;'
                if (("title_html" in this.options) && this.options.title_html == true)
                    title.html($title);
                else title.text($title);
            }
        }));
        $(".icon-envelope").on('click', function (e) {
            e.preventDefault();

            var dialog = $("#dialog-message").removeClass('hide').dialog({
                modal: true,
                title: "<div class='widget-header widget-header-small'><h6 class='smaller'><i class='icon-ok'></i> 设置营销参数</h6></div>",
                title_html: true,
                buttons: [
                    {
                        text: "Cancel",
                        "class": "btn btn-xs",
                        click: function () {
                            $(this).dialog("close");
                        }
                    },
                    {
                        text: "OK",
                        "class": "btn btn-primary btn-xs",
                        click: function () {
                            $(this).dialog("close");
                        }
                    }
                ]
            });

            /**
             dialog.data( "uiDialog" )._title = function(title) {
						title.html( this.options.title );
					};
             **/
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
</body>
</html>
