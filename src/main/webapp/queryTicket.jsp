<%--
  Created by IntelliJ IDEA.
  User: DREAM
  Date: 2021/11/30
  Time: 9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="css/table.css" >
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <style>
        body{
            background-color: rgb(128, 232, 240);
        }
    </style>
</head>
<body>

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
        <a class="ah-tab-item" href="">路线</a>
    </div>
</div>

<div class="box2">
    <form action="/ticket?method=buyTicket" method="post">
        <select class="form-control date" name="">

        </select>
        <select class="form-control begin" name="departCity">
            <c:forEach items="departList" var="depart">
                <option value="${depart}">${depart}</option>
            </c:forEach>
        </select>
        <select class="form-control end" name="destCity">
            <c:forEach items="destList" var="dest">
                <option value="${dest}">${dest}</option>
            </c:forEach>
        </select>
        <%--    <button>查找</button>--%>
        <input type="submit" class="btn btn-default" value="搜索" />
    </form>


</div>
<div class="box1" style="margin-bottom: 50px">

    <table class="table  text-center">
        <tr >
            <th>班车号</th>
            <th>起始站</th>
            <th>终点站</th>
            <th>日期</th>
            <th>发车时间</th>
            <th>车型</th>
            <th>票价</th>
            <th>剩余票数</th>
            <th>操作</th>
        </tr>
        <%--<tr >
            <td>1</td>
            <td>2</td>
            <td>3</td>
            <td>4</td>
            <td>5</td>
            <td>6</td>
            <td>7</td>
            <td>8</td>
            <td><button>预定</button></td>
        </tr>--%>

        <c:forEach items="mapList" var="map">
            <tr >
                <td>${map.ticketId}</td>
                <td>${map.departStation}</td>
                <td>${map.destStation}</td>
                <td>${map.departDate}</td>
                <td>${map.departTime}</td>
                <td>${map.busType}</td>
                <td>${map.ticketPrice}</td>
                <td>${map.ticketCounts}</td>
                <td><button>预定</button></td>
            </tr>
        </c:forEach>
    </table>

    <c:if test="${empty mapList}">
        <div style="width: 100%;height: 200px;text-align: center;margin-top: 200px">
            <p style="font-size: 24px;text-align: center;color: #cccccc">暂无此车票</p>
        </div>
    </c:if>

</div>

<%--导入脚--%>
<div class="foot">
    <%@ include file="footer.jsp" %>
</div>

</body>

<script src="js/jquery-3.1.1.js" type="text/javascript" charset="utf-8"></script>
<script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>

<script>
    function dateTimenow() {
        var date = new Date();
        var year = date.getFullYear();
        var month = date.getMonth();
        var day = date.getDate() + 1;
        var today = year + '-' + month + '-' + day;
        for (var i = 0; i < 30; i++) {
            var option = "<option value='"+i+"'>"+today+"</option>"
            $(".date").append(option)
            day = day - (-1);
            if (day > monthDay(month)){
                month = month-(-1);
                if (month > 12){
                    month = 1
                }
                day = 1;
            }
            today = year + '-' + month + '-' + day;
        }

        // console.log(today)
    }

    function monthDay(m){
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 ||  m == 10 ||  m == 12){
            return 31;
        }
        if ( m == 2 ){
            var date = new Date();
            var year = date.getFullYear();
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                return 29;
            } else {
                return 28;
            }
        }
        return 30;
    }

    $(function () {
        dateTimenow()
    })
</script>

</html>
