<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" href="./css/bootstrap.min.css" crossorigin="anonymous">
    <link rel="stylesheet" href="css/01.css">
    <link rel="stylesheet" href="css/style.css">
<%--    <link rel="stylesheet" href="css/reset.css">--%>
    <link rel="stylesheet" href="css/swiper-bundle.min.css">
    <link rel="stylesheet" type="text/css" href="./css/jquery.horizontalmenu.css"/>

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
        body{
            background-color: white;
        }

        ul{
            list-style: none;
        }
    </style>
</head>
<body>
<div class="quession">
    <div class="container">
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
<div class="about" style="margin: 0;padding: 0px;outline: 0;font-family: 'Segoe UI', Arial, Tahoma, Geneva, Verdana, sans-serif;">
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
<script src="js/swiper-bundle.min.js"></script>
<script src="js/bootstrap.min.js"crossorigin="anonymous"></script>
<script src="./js/jquery.horizontalmenu.js" type="text/javascript" charset="utf-8"></script>
</html>