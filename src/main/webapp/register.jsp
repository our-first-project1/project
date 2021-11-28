<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<meta charset="utf-8">
		<title>注册</title>
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
		<style type="text/css">

			body{
				background-size: 100%;
				background: url("image/borad.jpg") no-repeat center center fixed;
			}
			.control-label{
				color: black;
			}
		</style>
	</head>
<body>
    <div class="head" style="width: 100%;">
        <%@ include file="header.jsp" %>
    </div>
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-3">
            </div>
            <div class="col-md-6">
                <br>
                <h1 style="color: #46b8da;text-align: center;">注册会员</h1><br>
                <form action="/user?method=register" method="post" class="form-horizontal" id="registForm" style="text-align: center;">
                    <div class="form-group">
                        <%--@declare id="inputemail3"--%><label for="inputEmail3" class="col-sm-2 control-label">昵称</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="username" name="username" placeholder="请输入昵称" required="required"
                            value="" onblur="validateUsername()"><br>
                            <label></label>
                            <span id="nameMsg" style="color: red"></span>
                        </div>

                    </div>
                    <div class="form-group">
                        <%--@declare id="inputpassword3"--%><label for="inputPassword3" class="col-sm-2 control-label">密码</label>
                        <div class="col-sm-10">
                            <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码"><br>
                            <label ></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputPassword3" class="col-sm-2 control-label">重复密码</label>
                        <div class="col-sm-10">
                            <input type="password" class="form-control" id="repassword" placeholder="请再次输入密码"><br>
                            <label ></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-2 control-label">真实姓名</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="name" name="name" placeholder="请输入真实姓名"><br>
                            <label ></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-2 control-label">身份证号</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="personId" name="personId" placeholder="请输入身份证号"><br>
                            <label ></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-2 control-label">邮箱</label>
                        <div class="col-sm-10">
                            <input type="email" class="form-control" id="email" name="email" placeholder="请输入邮箱" required="required"><br>
                            <label ></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-2 control-label">电话</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="telephone" name="telephone" placeholder="请输入电话" required="required" value="" onblur="validatePhone()"><br>
                            <label ></label>
                            <span id="phoneMsg"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-2 control-label">生日</label>
                        <div class="col-sm-10">
                            <input type="date" class="form-control" name="birthday" id="birthday"><br>
                            <label ></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-2 control-label">性别</label>
                        <div class="col-sm-10">
                            <label class="radio-inline">
                                <input type="radio" name="sex" id="male" value="男"> <span style="color: black;">男</span>
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="sex" id="female" value="女"> <span style="color: black;">女</span><br>
                                <label ></label>
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <input type="submit" class="btn btn-default" value="注册">
                            <span style="color: #606060">已有账号，去</span><a href="login.jsp" style="color: #ec971f">登录</a>
                        </div>
                    </div>
                </form>
                <div class="col-md-3">

                </div>
            </div>
        </div>
    </div>
</body>


	<script src="js/jquery-3.1.1.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/jquery.validate.min.js"></script>
    <script src="js/mess.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript">
		$("#registForm").validate({
			rules:{
				"username":{
					required:true,
					minlength:3
				},
				"password":{
					required:true,
					rangelength:[6,12]
				},
				"repassword":{
					required:true,
					equalTo:"[name='password']"
				},
				"name":{
					required:true
				},
				"personId":{
					required:true
				},
				"telephone":{
					required:true
				},
				"birthday":{
					required:true,
					dateISO:true
				},
				"sex":{
					required:true
				}
			},
			messages:{
				"username":{
					required:"必填",
					minlength:"昵称长度至少为3位"
				},
				"password":{
					required:"必填",
					rangelength:"密码长度为6~12位"
				},
				"repassword":{
					required:"必填",
					equalTo:"两次密码输入一致"
				},
				"name":{
					required:"必填"
				},
				"personId":{
					required:"必填"
				},
				"telephone":{
					required:"必填"
				},
				"birthday":{
					required:"必填",
					dateISO:"日期格式必须正确"
				},
				"sex":{
					required:"必选"
				}
			},
            success:function(label){

                label.text("").addClass("success")
            }
		})
	</script>
</html>