<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DREAM
  Date: 2021/11/29
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>路线搜索</title>
    <link rel="stylesheet" href="./css/bootstrap.min.css" crossorigin="anonymous">

    <style>
        body{
            background-color: white;
        }
    </style>

</head>
<body>

<%--导入头--%>
<div class="head" style="width: 100%; margin-top: 0px">
    <%@ include file="header.jsp" %>
</div>

<div class="container logo">
    <div class="row">
        <div class="col-md-8">
            <img src="image/pangpang-logo.PNG" style="width: 300px;height: 120px;">
            <img src="image/pang-sub.jpg" alt="">
        </div>
        <div class="col-md-4 logo_right"><img src="image/right.jpg" alt=""></div>
    </div>
</div>

<div class="ah-tab-wrapper">
    <div class="ah-tab" style="margin-left: 40px;">
        <a class="ah-tab-item" href="">首页</a>
        <a class="ah-tab-item" href="">汽车票</a>
        <a class="ah-tab-item" href="">汽车站</a>
    </div>
</div>


<div class="container">
    <div  style="margin-top: 40px;font-size: 24px;width: 100px;height: 40px;background-color: #f0ad4e">
        路线搜索
    </div>

    <div class="container" style="border: #000000 solid 1px;margin-top: 5px;width: 100px;margin-left: 0px;"></div>
</div>


<div class="container" style="margin-top: 30px;">
    <form action="/route?method=searchRoute" method="post">
        <table>
            <tr>
                <td style="font-size: 18px;">起点城市：</td>
                <td>
                    <input type="text" name="routeDepartCity" value="" placeholder="请输入出发城市" style="width: 300px;"/>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                </td>
                <td style="font-size: 18px;">终点城市：</td>
                <td><input type="text" name="routeDestCity" value="" placeholder="请输入终点城市" style="width: 300px;" required="required" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                <td><input type="submit" class="btn btn-info" value="搜索" /></td>
            </tr>
        </table>
    </form>
</div>

<div class="container" style="border: #000000 solid 1px;margin-top: 10px;"></div>

<div class="container" style="margin-top: 40px;">
    <div class="row" >
        <table class="table table-bordered">
            <tr align="center" >
                <th style="text-align:center"><span style="color: #000000;">起点城市</span> </th>
                <th style="text-align:center"><span style="color: #000000;">终点城市</span></th>
                <th style="text-align:center"><span style="color: #000000;">购买热度</span></th>
                <th style="text-align:center"><span style="color: #000000;">区间最低价格</span></th>

                <th style="text-align:center"><span style="color: #000000;">购买</span></th>
            </tr>

            <c:forEach items="${routes}" var="route">
                <tr class="data" align="center">
                    <td ><span style="color: #000000;">${route.routeDepartCity}</span></td>
                    <td><span style="color: #000000;">${route.routeDestCity}</span></td>
                    <td><span style="color: #000000;">${route.hot}</span></td>
                    <td><span style="color: #000000;">${route.routePrice}</span></td>

                    <td>
                        <a href="/ticket?method=buyTicketByRoute&routeDepartCity=${route.routeDepartCity}&routeDestCity=${route.routeDestCity}&routePrice=${route.routePrice}" class="btn btn-info" >购买</a>
                    </td>
                </tr>
            </c:forEach>


            <%--<tr align="center">
                <td colspan="8">
                    <input class="btn btn-success" type="button" value="首页"
                           onclick=""/>&nbsp;&nbsp;
                    <input class="btn btn-success" type="button" id="pre" value="上一页"
                           onclick=""/>&nbsp;&nbsp;
                    <!-- 当前页 -->
                    <input type="text" id="pageNow" value="1" style="text-align:center"/>&nbsp;&nbsp;
                    <input class="btn btn-success" type="button" value="跳转"
                           onclick=""/>&nbsp;&nbsp;
                    <input class="btn btn-success" type="button" id="next" value="下一页"
                           onclick=""/>&nbsp;&nbsp;
                    <input class="btn btn-success" type="button" value="末页"
                           onclick=""/>&nbsp;&nbsp;
                </td>
            </tr>--%>
        </table>
        <c:if test="${empty routes}">
            <div style="width: 100%;height: 200px;text-align: center;margin-top: 100px">
                <p style="font-size: 24px;text-align: center;color: #cccccc">暂无此数据</p>
            </div>
        </c:if>
    </div>

</div>

<%--导入脚--%>
<div class="foot">
    <%@ include file="footer.jsp" %>
</div>

</body>
<script src="js/jquery-3.1.1.js"crossorigin="anonymous"></script>
<script src="js/bootstrap.min.js"crossorigin="anonymous"></script>
<script></script>
</html>