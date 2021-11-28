<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>

		<link rel="stylesheet" href="css/bootstrap.min.css">
		<link rel="stylesheet" href="css/bootstrap-float-label.css">

		<style type="text/css">
			body{
				background: url(image/login-backgound.jpg) no-repeat center center fixed;
			}
			body > div{
				margin-top: 100px;
			}
			.form-control{
				width: 50%;
			}
		</style>
	</head>
	<body>
	<div class="head" style="width: 100%; margin-top: 0px">
		<%@ include file="header.jsp" %>
	</div>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-3 column">
			</div>
			<div class="col-md-6 column">
				<form action="/user?method=login" method="post">
					<div class="container" style="padding:2em 0;width: 600px;">
						<h1 style="color: #FF7600;">会员登录</h1>
						<div class="form-group floating-control-group">
							<label for="txtFloatingUsername">Userphone</label>
							<input type="text" class="form-control" id="txtFloatingUsername" name="telephone" placeholder="Enter Username" value="">
						</div>
						<div class="form-group floating-control-group">
							<label for="txtFloatingPassword">Password</label>
							<input type="password" class="form-control" id="txtFloatingPassword" name="password" placeholder="Enter Password">
						</div>
						<input type="submit" class="btn btn-primary" value="Submit">
						<div id="" align="right" style="color: #FFFFFF;">没有账号？
							<a href="register.jsp" style="color: #FF7600;;">立即注册</a>
						</div>
					</div>
				</form>
			</div>
			<div class="col-md-3 column">
			</div>
		</div>
	</div>
	</body>
	<script src="js/jquery-3.1.1.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/bootstrap-float-label.js"></script>
</html>
