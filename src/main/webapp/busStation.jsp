<%--
  Created by IntelliJ IDEA.
  User: DREAM
  Date: 2021/11/25
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>汽车站</title>
    <link rel="stylesheet" href="css/01.css">
    <link rel="stylesheet" href="css/swiper-bundle.min.css">
    <link rel="stylesheet" href="./css/bootstrap.min.css" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="./css/jquery.horizontalmenu.css"/>
</head>
<body>
<style>
    @font-face {
        font-family: 'iconfont';
        src: url('icon/iconfont.ttf') format('truetype');
    }

    .iconfont {
        font-family: "iconfont" !important;
        font-size: 16px;
        font-style: normal;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
    }
    strong{
        font-size: 20px;
        color: #C3C8CD;
    }

</style>
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
        <a class="ah-tab-item" href="">保险</a>
        <a class="ah-tab-item" href="">特卖惠</a>
    </div>
</div>

<div class="col-md-12 column" style=";height: 60px;text-align: center;border: 1px solid #E5E5E5;">
    <form class="form-inline" style="margin-top: 10px;">
        <div class="form-group">
            <label>出发城市</label>
            <input type="text" class="form-control" id="depart_station" placeholder="请输入">
        </div>
        <div class="form-group">
            <label>起始车站</label>
            <input type="text" class="form-control" id="dest_station" placeholder="请输入">
        </div>
        <div class="form-group">
            <label >时间</label>
            <input type="date" class="form-control" id="depart_time" placeholder="请输入">
        </div>
        <button type="submit" class="btn btn-default">搜索</button>
    </form>
</div>



<div class="container-fluid">
    <div class="row clearfix">
        <div class="col-md-4 column">
            <br>
            <img alt="300x300" src="image/back.jpg" width="400px" height="300px"/>
        </div>
        <div class="col-md-8 column">
            <ul style="">
                <br><br>
                <li><strong>车站名:</strong></li><br>
                <li><strong>车站所在城市:</strong></li><br>
                <li><strong>车站地址:</strong></li><br>
                <li><strong>车站咨询电话:</strong></li><br>
                <li><strong>取票方式:</strong></li><br>
            </ul>
        </div>
    </div>
</div>

<div class="foot">
    <%@ include file="footer.jsp" %>
</div>

</body>
<script src="js/jquery-3.1.1.js"crossorigin="anonymous"></script>
<script src="js/bootstrap.min.js"crossorigin="anonymous"></script>
<script src="js/swiper-bundle.min.js"></script>
</html>