<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>test</title>
    <link href="/Nakri/css/bootstrap.min.css" rel="stylesheet"/>
    <link rel="stylesheet" href="/Nakri/css/font-awesome.min.css"/>
    <script src="/Nakri/js/bootstrap.min.js"></script>
</head>
<body>
<table border="1" cellpadding="10px" cellspacing="10px">
    <tr>
        <td>
            id
        </td>
        <td>
            名字
        </td>
    </tr>
    <c:forEach items="${testList}" var="p">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
