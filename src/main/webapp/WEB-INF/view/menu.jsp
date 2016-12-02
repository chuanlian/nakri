<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
            <li>
                <a href="/Nakri/cust/custList">
                    <i class="icon-double-angle-right"></i>
                    查询资料
                </a>
            </li>
        </ul>
        <ul class="submenu">
            <li class="active">
                <a href="/Nakri/cust/syncCust">
                    <i class="icon-double-angle-right"></i>
                    获取资料
                </a>
            </li>
        </ul>
    </li>
</ul>