<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 85066
  Date: 2021/12/2
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购票</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
</head>
<body>
<div class="head" style="width: 100%; margin-top: 0px">
    <%@ include file="header.jsp" %>
</div>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-1 column">
        </div>
        <div class="col-md-10 column">
            <div class="row clearfix" style="margin: 15px;">
                <div class="col-md-12 column">
                    <form class="form-inline" action="/ticket?method=buyTicket" method="post">
                        <div class="form-group">
                            <label>起始地</label>
                            <input type="text" class="form-control" name="departCity" placeholder="请输入">
                        </div>
                        <div class="form-group">
                            <label>目的地</label>
                            <input type="text" class="form-control" name="destCity" placeholder="请输入">
                        </div>
                        <div class="form-group">
                            <label>出发日期</label>
                            <input type="date" class="form-control" name="departTime" placeholder="请输入">
                        </div>
                        <button type="submit" class="btn btn-default">搜索</button>
                    </form>
                </div>
                <table class="table table-bordered">
                    <thead>
                    <tr>
                        <th style="text-align:center">班车号</th>
                        <th style="text-align:center">起始站</th>
                        <th style="text-align:center">终点站</th>
                        <th style="text-align:center">出发日期</th>
                        <th style="text-align:center">出发时间</th>
                        <th style="text-align:center">车型</th>
                        <th style="text-align:center">票价</th>
                        <th style="text-align:center">剩余票数</th>
                        <th style="text-align:center">操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${vo.list}" var="maps">
                        <tr class ="data" align="center">
                            <td class="busId">${maps.busId}</td>
                            <td class="departStation">${maps.departStation}</td>
                            <td class="destStation">${maps.destStation}</td>
                            <td class="departDate">${maps.departDate}</td>
                            <td class="departTime">${maps.departTime}</td>
                            <td class="busType">${maps.busType}</td>
                            <td class="ticketPrice">${maps.ticketPrice}</td>
                            <td class="ticketCounts">${maps.ticketCounts}</td>
                            <td class="order">
                                <input type="button" value="预定">
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                <ul class="pagination">
                    <li>
                        <a href="${pageContext.request.contextPath}/ticket?method=buyTicket&pageNow=1">首页</a>
                    </li>
                    <c:forEach begin="1" end="${vo.myPages}" var="page">
                        <li>
                            <c:if test="${vo.pageNow ne page}">
                                <a href="${pageContext.request.contextPath}/ticket?method=buyTicket&pageNow=${page}">${page}</a>
                            </c:if>
                            <c:if test="${vo.pageNow eq page}">
                                <a style="background: orange ;color: white;">${page}</a>
                            </c:if>
                        </li>
                    </c:forEach>
                    <li>
                        <a href="${pageContext.request.contextPath}/ticket?method=buyTicket&pageNow=${vo.myPages}">末页</a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="col-md-1 column">
        </div>
    </div>
</div>
</body>
<script src="js/jquery-3.1.1.js" type="text/javascript" charset="utf-8"></script>
<script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
<script>
    function searchTicket() {
        window.location.href="/ticket?method=buyTicket";
    }
</script>
</html>
