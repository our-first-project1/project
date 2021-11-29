<%--
  Created by IntelliJ IDEA.
  User: DREAM
  Date: 2021/11/25
  Time: 18:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="zh-CN">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>肉肉汽车购票网</title>
  <link rel="stylesheet" href="css/01.css">
  <link rel="stylesheet" href="css/style.css">
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

  ul{
    list-style: none;
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

<div class="content">

  <div class="ah-tab-wrapper">
    <div class="ah-tab">
      <a class="ah-tab-item" data-ah-tab-active="true" href="">首页</a>
      <a class="ah-tab-item" href="">汽车票</a>
      <a class="ah-tab-item" href="">汽车站</a>
      <a class="ah-tab-item" href="">路线</a>

    </div>
  </div>
  <div class="ah-tab-content-wrapper">
    <div class="ah-tab-content" data-ah-tab-active="true">
      <div class="banner">
        <div class="box">
          <div class="tab">
            <label >出发
              <input type="text" placeholder="请输入中文">
            </label>
            <label >到达
              <input type="text" placeholder="请输入中文">
            </label>
            <label >出发日期
              <input type="date" id="txtEnterDate">
            </label>
            <button class="submit">搜索</button>
          </div>
        </div>
      </div>

    </div>
    <div class="ah-tab-content">
      <div class="banner">
        <div class="box">
          <div class="tab">
            <label >出发
              <input type="text" placeholder="请输入中文">
            </label>
            <label >到达
              <input type="text" placeholder="请输入中文">
            </label>
            <label >出发日期
              <input type="date" id="">
            </label>
            <button class="submit">搜索</button>
          </div>
        </div>
      </div>
    </div>
    <div class="ah-tab-content">
      <div class="banner">
        <div class="box" style="top: 56px;height: 250px">
          <div class="tab">
            <form action="/station?method=searchStation" method="post">
              <label>城市
                <input type="text" name="city" placeholder="请输入中文">
              </label>
              <label >汽车站
                <input type="text" name="stationName" placeholder="请输入中文">
              </label>

              <input class="submit" type="submit" value="搜索" />
            </form>

          </div>
        </div>
      </div>


    </div>
    <div class="ah-tab-content">
      <div class="banner">
        <div class="box" style="top: 56px;height: 250px">
          <div class="tab">
            <form action="/route?method=searchRoute" method="post">
              <label>起点城市
                <input type="text" name="routeDepartCity" placeholder="请输入中文">
              </label>
              <label >终点城市
                <input type="text" name="routeDestCity" placeholder="请输入中文" required="required" />
              </label>
              <input type="submit" class="submit" value="搜索" />
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>


<div class="fly">
  <div class="">
    <div class="container fly_top">
      <div class="row">
        <div class="col-xs-2 fly_left"><span>路线推荐</span></div>
        <div class="col-xs-8 fly_center"><span>热门路线</span></div>
        <div class="col-xs-2 fly_right"><span>热门班次</span></div>
      </div>
    </div>
  </div>
  <div class="container fly_contain">
    <div class="row">
      <div class="col-xs-10 fly_center">
        <div class="fly_cart">
          <ul>
            <li>
              <p class="position"><span>安康市</span><em>—</em><span>咸阳机场</span></p>
              <p class="price"><span>￥<b>99.0</b>起</span><a>购买</a></p>
            </li>
            <li>
              <p class="position"><span>北海市</span><em>—</em><span>南宁机场</span></p>
              <p class="price"><span>￥<b>100</b>起</span><a>购买</a></p>
            </li>
            <li>
              <p class="position"><span>桐乡市</span><em>—</em><span>萧山机场</span></p>
              <p class="price"><span>￥<b>45.0</b>起</span><a>购买</a></p>
            </li>
            <li>
              <p class="position"><span>新昌县</span><em>—</em><span>萧山机场</span></p>
              <p class="price"><span>￥<b>58.0</b>起</span><a>购买</a></p>
            </li>
            <li>
              <p class="position"><span>渭南市</span><em>—</em><span>咸阳机场</span></p>
              <p class="price"><span>￥<b>42.5</b>起</span><a>购买</a></p>
            </li>
          </ul>
        </div>
      </div>
      <div class="col-xs-2 fly_right">
        <div class="fly_box">
          <ul>
            <li>
              <div><span>南京</span><em>-</em><span>漯河</span></div>
            </li>
            <li>
              <div><span>南京</span><em>-</em><span>莱芜</span></div>
            </li>
            <li>
              <div><span>南京</span><em>-</em><span>连云港</span></div>
            </li>
            <li>
              <div><span>南京</span><em>-</em><span>莱州</span></div>
            </li>
            <li>
              <div><span>南京</span><em>-</em><span>含山</span></div>
            </li>
            <li>
              <div><span>南京</span><em>-</em><span>金坛</span></div>
            </li>
            <li>
              <div><span>南京</span><em>-</em><span>江阴</span></div>
            </li>
            <li>
              <div><span>南京</span><em>-</em><span>信阳</span></div>
            </li>
            <li>
              <div><span>南京</span><em>-</em><span>沂南</span></div>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>

</div>
<div class="quession">
  <div class="container ">
    <div class="row">
      <div class="col-md-10 box">
        <div class="box_left"><span>常见问题</span></div>
        <div class="box_right">
          <ul>
            <li><span class="iconfont">&#xe626;</span>
              <p>购票</p>
            </li>
            <li><span class="iconfont">&#xe810;</span>
              <p>支付</p>
            </li>
            <li><span class="iconfont">&#xe601;</span>
              <p>取票</p>
            </li>
            <li><span class="iconfont">&#xe511;</span>
              <p>退票改签</p>
            </li>
            <li><span class="iconfont">&#xe7b2;</span>
              <p>班次查询</p>
            </li>
            <li><span class="iconfont">&#xe8c0;</span>
              <p>优惠券</p>
            </li>
            <li><span class="iconfont">&#xe63c;</span>
              <p>个人账户</p>
            </li>
            <li><span class="iconfont">&#xe62a;</span>
              <p>在线客服</p>
            </li>
            <li><span class="iconfont">&#xe624;</span>
              <p>更多</p>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>
</div>
<div class="serve">
  <div class="container">
    <div class="row">
      <div class="col-md-3">
        <span class="iconfont">&#xe609;</span>
        <p>权威报道</p>
      </div>
      <div class="col-md-3">
        <span class="iconfont">&#xe610;</span>
        <p>全程服务</p>
      </div>
      <div class="col-md-3">
        <span class="iconfont">&#xe60f;</span>
        <p>全面覆盖</p>
      </div>
      <div class="col-md-3">
        <span class="iconfont">&#xe627;</span>
        <p>方便快捷</p>
      </div>

    </div>
  </div>
</div>
<div class="about">
  <div class="container">
    <div class="row">
      <div class="col-md-3 item1">
        <p>在线客服</p>
        <span class="iconfont">&#xe62a;</span>
        <p>在线及时解答您的问题</p>
        <button>立即使用</button>
      </div>
      <div class="col-md-3 item2">
        <p class="title">服务中心</p>
        <p><a href="#">新手指南</a></p>
        <p><a href="#">购票指南</a></p>
        <p><a href="#">会员服务</a></p>
        <p><a href="#">个人服务</a></p>
        <p><a href="#">投诉建议</a></p>
        <p><a href="#">保险说明</a></p>
      </div>
      <div class="col-md-3 item2">
        <p class="title">关于畅途</p>
        <p><a href="#">媒体报道</a></p>
        <p><a href="#">服务协议</a></p>
        <p><a href="#">法律声明</a></p>
        <p><a href="#">隐私声明</a></p>
        <p><a href="#">业务合作</a></p>
        <p><a href="#">友情链接</a></p>
        <p><a href="#">联系我们</a></p>
        <p><a href="#">网站地图</a></p>
      </div>
      <div class="col-md-3 item4">
        <div>
          <p>APP客户端</p>
<%--          <img src="image/eq2.gif" alt="">--%>
        </div>
      </div>
    </div>
  </div>
</div>
<div class="footer_copyright">
  <div class="container">
    <p><em class="fontA">Copyright  © 2007-2021</em> <a href="https://www.changtu.com/">畅途网 <em class="fontA"> www.changtu.com</em></a> ┆ 南京畅途网交通技术系统有限公司 版权所有 ┆ <a target="_blank" href="http://beian.miit.gov.cn" rel="nofollow"><em class="fontA">ICP</em>备案号：苏ICP备<em class="fontA">11079920</em>号-2</a> ┆ 经营许可证编号：<a target="_blank" href="https://res.changtu.com/img01/images/7cb2441f29b69c8b23d008ff8acffb06d7f0041c5d40dad4.jpg" rel="nofollow">苏<em class="fontA">B2-20120049</em></a></p>
    <p><a target="_blank" rel="nofollow" href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=32011102010194" class="mgr10"><img src="https://res02.changtu.com/ctw/image/beian_icon.png" />苏公网安备 32011102010015</a> ┆ <a target="_blank" href="https://res02.changtu.com/ctw/image/gxjsqyzs.jpg">高新技术企业证书</a> ┆ 联系地址：南京高新开发区星火路11号动漫大厦B座<span class="mgl20">联系电话：025-68593001</span></p>
  </div>
</div>





</body>
<script src="js/jquery-3.1.1.js"crossorigin="anonymous"></script>
<!-- integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" -->

<script src="js/bootstrap.min.js"crossorigin="anonymous"></script>
<!-- integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" -->

<script src="js/swiper-bundle.min.js"></script>

<script src="./js/jquery.horizontalmenu.js" type="text/javascript" charset="utf-8"></script>
<script>
  function dateTimenow() {
    var date = new Date();
    var year = date.getFullYear();
    var month = date.getMonth();
    var day = date.getDate() + 1;
    var today = year + '-' + month + '-' + day;
    $('#txtEnterDate').val(today)
    // console.log(today)
  }
  $(function () {
    dateTimenow()
  })
</script>
<script>
  var swiper = new Swiper(".mySwiper", {
    autoplay:true,
    scrollbar: {
      el: ".swiper-scrollbar",
      hide: true,
    },
  });


  $(function () {
    $('.ah-tab-wrapper').horizontalmenu({
      itemClick : function(item) {
        $('.ah-tab-content-wrapper .ah-tab-content').removeAttr('data-ah-tab-active');
        $('.ah-tab-content-wrapper .ah-tab-content:eq(' + $(item).index() + ')').attr('data-ah-tab-active', 'true');
        return false; //if this finction return true then will be executed http request
      }
    });
  });


</script>
</html>
