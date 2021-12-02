<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 85066
  Date: 2021/11/29
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>orderList</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
</head>
<body>
<div class="head" style="width: 100%; margin-top: 0px">
    <%@ include file="header.jsp" %>
</div>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="row clearfix">
                <div class="col-md-3 column">
                    <div class="dropdown">
                        <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                            按时间选择订单
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                            <li><a href="#">所有订单</a></li>
                            <li><a href="#">一个月之内订单</a></li>
                            <li><a href="#">一个月之前订单</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-3 column">
                    <div class="dropdown">
                        <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                            订单状态
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                            <li><a href="#">全部订单状态</a></li>
                            <li><a href="#">成功订单</a></li>
                            <li><a href="#">关闭订单</a></li>
                            <li><a href="#">待支付订单</a></li>
                            <li><a href="#">退款处理中</a></li>
                            <li><a href="#">已退款</a></li>
                            <li><a href="#">订单处理中</a></li>
                            <li><a href="#">待购票</a></li>
                            <li><a href="#">出票中</a></li>
                            <li><a href="#">改签处理中</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-6 column">
                </div>
            </div>
            <table class="table table-bordered">
                <thead>
                <tr>
                    <th style="text-align:center">订单编号</th>
                    <th style="text-align:center">姓名</th>
                    <th style="text-align:center">身份证号</th>
                    <th style="text-align:center">出发日期</th>
                    <th style="text-align:center">出发时间</th>
                    <th style="text-align:center">起始站</th>
                    <th style="text-align:center">目的地</th>
                    <th style="text-align:center">班次</th>
                    <th style="text-align:center">座位号</th>
                    <th style="text-align:center">检票窗口</th>
                    <th style="text-align:center">车票类型</th>
                    <th style="text-align:center">车票价格</th>
                    <th style="text-align:center">车票状态</th>
                    <th style="text-align:center">操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${vo.list}" var="orderslist">
                    <tr class ="data" align="center">
                        <td class="orderId">${orderslist.orderId}</td>
                        <td class="name">${orderslist.name}</td>
                        <td class="personId">${orderslist.personId}</td>
                        <td class="departDate">${orderslist.departDate}</td>
                        <td class="departTime">${orderslist.departTime}</td>
                        <td class="departStation">${orderslist.departStation}</td>
                        <td class="destStation">${orderslist.destStation}</td>
                        <td class="ticketId">${orderslist.ticketId}</td>
                        <td class="seatId">${orderslist.seatId}</td>
                        <td class="checkoutId">${orderslist.checkoutId}</td>
                        <td class="ticketType">${orderslist.ticketType}</td>
                        <td class="ticketPrice">${orderslist.ticketPrice}</td>
                        <td class="ticketStatus">${orderslist.ticketStatus}</td>
                        <td class="operate">
                            <c:if test="${orderslist.orderStatus==0}">
                                <input type="button" value="付款">
                            </c:if>
                            <c:if test="${orderslist.orderStatus==1}">
                                <input type="button" value="改签">
                                <input type="button" value="退票">
                            </c:if>
                            <c:if test="${orderslist.orderStatus==2}">
                                <input type="button" value="退票">
                            </c:if>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <ul class="pagination">
                <li>
                    <a href="${pageContext.request.contextPath}/orders?method=viewAll&pageNow=1">首页</a>
                </li>
                <c:forEach begin="1" end="${vo.myPages}" var="page">
                    <li>
                        <c:if test="${vo.pageNow ne page}">
                            <a href="${pageContext.request.contextPath}/orders?method=viewAll&pageNow=${page}">${page}</a>
                        </c:if>
                        <c:if test="${vo.pageNow eq page}">
                            <a style="background: orange ;color: white;">${page}</a>
                        </c:if>
                    </li>
                </c:forEach>
                <li>
                    <a href="${pageContext.request.contextPath}/orders?method=viewAll&pageNow=${vo.myPages}">末页</a>
                </li>
            </ul>
        </div>
    </div>
</div>
</body>
<script src="js/jquery-3.1.1.js" type="text/javascript" charset="utf-8"></script>
<script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
<script src="js/mess.js" type="text/javascript" charset="utf-8"></script>
<script src="js/paging.js" type="text/javascript" charset="utf-8"></script>
</html>
