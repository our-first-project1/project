<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<link rel="stylesheet" href="css/01.css">
		<link href="./css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
		<div class="top">
		    <div class="container">
		        <div class="row">
		            <div class="col-md-8 top_left">
		                <div>
		                    <ul>
		                        <li>您好，欢迎光临胖胖<a href="index.jsp" style="color: #b92c28">旅途网!</a></li>

								<c:if test="${user==null}">
									<li>请</li>
									<li><a href="login.jsp">登录</a></li>
									<li><a href="register.jsp">快速注册</a></li>
								</c:if>

								<c:if test="${user!=null}">
									<li><strong>尊敬的会员</strong>${sessionScope.user.username}</li>
								</c:if>
		                    </ul>
		                </div>
		            </div>
		            
		            <div class="col-md-4 top_right">
		                <div>
		                    <ul>
		                        <li>
		                            <a href="/orders?method=viewAll">我的订单</a>
		                        </li>
		                        <li><a href="#">我的畅途</a></li>
		                        <li><a href="#">客户服务</a></li>
								<c:if test="${user!=null}">
									<li><a href="/user?method=logout" style="color: red">退出</a></li>
								</c:if>
		                    </ul>
						</div>
		            </div>
		        </div>
		    </div>
		</div>
		<input type="hidden" id = "path" value="${pageContext.request.contextPath}"/>
	</body>
</html>
