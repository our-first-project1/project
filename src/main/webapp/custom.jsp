<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
		<link rel="stylesheet" href="css/01.css">
		<link rel="stylesheet" type="text/css" href="./css/jquery.horizontalmenu.css"/>
		<style type="text/css">
			#userLeft{
				width: 165px;
				/* height: 30px; */
				/* line-height: 1.875rem; */
				overflow: hidden;
				padding: 17px 0 19px;
				background: #ff7600;
				border: solid 1px #ff7600;
				color: #fff;
				font: 20px "\5FAE\8F6F\96C5\9ED1";
				text-align: center;
			}
			.panel-body a{
				color: #000000;
				text-align: center;
				margin-left: 30px;
			}
			.panel-body:hover{
				background: #ff7600;
			}
			#mycount{
				height: 20px;
				font-size: 18px;
				margin-top: 20px;
			}
			.td1{
				height: 20px;
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

	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">

				<ul class="nav nav-pills">
					<li class="active">
						<a href="#">首页</a>
					</li>
					<li>
						<a href="#">汽车票</a>
					</li>
					<li>
						<a href="#">汽车站</a>
					</li>
					<li class="disabled">
						<a href="#">信息</a>
					</li>
				</ul>
				<ul class="breadcrumb">
					<li>
						<a href="#">首页</a>
					</li>
					<li>
						<a href="#">我的订单</a>
					</li>
					<li class="active">
						个人中心
					</li>
				</ul>

				<div class="row clearfix">
					<div class="col-md-2 column">
						<div id="userLeft">我的旅途</div>
						<div class="panel-group" id="panel-295734">
							<div class="panel panel-default">
								<div class="panel-heading">
									<a class="panel-title" data-toggle="collapse" data-parent="#panel-295734" href="#panel-element-424346">账户中心</a>
								</div>
								<div id="panel-element-424346" class="panel-collapse in">
									<div class="panel-body">
										<a href="" onclick="myCount()">个人账户</a>
									</div>
									<div class="panel-body">
										<a href="#">个人资料</a>
									</div>

								</div>
							</div>
							<div class="panel panel-default">
								<div class="panel-heading">
									<a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-295734" href="#panel-element-220019">订单中心</a>
								</div>
								<div id="panel-element-220019" class="panel-collapse collapse">
									<div class="panel-body">
										<a href="#">汽车票订单</a>
									</div>
									<div class="panel-body">
										<a href="#">景点订单</a>
									</div>
								</div>
							</div>
							<div class="panel panel-default">
								<div class="panel-heading">
									<a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-295734" href="#panel-element-205380">常用信息</a>
								</div>
								<div id="panel-element-205380" class="panel-collapse collapse">
									<div class="panel-body">
										<a href="#">常用旅客</a>
									</div>
									<div class="panel-body">
										<a href="#">常用路线</a>
									</div>
								</div>
							</div>

						</div>

					</div>
					<div class="col-md-10 column">
						<div class="showAjax">

						</div>


						<!-- 个人账户 -->
						<div id="account" hidden="hidden">
							<div >
								个人账户
							</div>
							<hr />

							<table id="element-table" class="table table-bordered">
								<thead>
								<tr>
									<th>时间</th>
									<th>金额</th>
									<th>备注</th>
									<th>订单号</th>
								</tr>
								</thead>
								<tbody>
								<tr>
									<td>1</td>
									<td>1</td>
									<td>1</td>
									<td>1</td>
								</tr>
								<tr>
									<td>1</td>
									<td>1</td>
									<td>1</td>
									<td>1</td>
								</tr>
								<tr>
									<td>1</td>
									<td>1</td>
									<td>1</td>
									<td>1</td>
								</tr>
								<tr>
									<td>1</td>
									<td>1</td>
									<td>1</td>
									<td>1</td>
								</tr>
								<tr>
									<td>1</td>
									<td>1</td>
									<td>1</td>
									<td>1</td>
								</tr>
								<tr>
									<td>1</td>
									<td>1</td>
									<td>1</td>
									<td>1</td>
								</tr>

								</tbody>
							</table>
							<nav aria-label="...">
								<ul class="pager">
									<li class="previous disabled"><a href="#"><span aria-hidden="true">&larr;</span> Older</a></li>
									<li class="next"><a href="#">Newer <span aria-hidden="true">&rarr;</span></a></li>
								</ul>
							</nav>
						</div>

						<!-- 个人资料 -->
						<div id="data">
							<div id="mycount">
								个人资料
							</div>
							<hr />

							<div >

								<table border="0px" cellspacing="10px" cellpadding="0" align="center">
									<tr>
										<td>
											<em style="color: red;">*</em>
											头  像&nbsp;&nbsp;&nbsp;
										</td>
										<td>
											<img id="pic" name="pic" width="100" height="100" src="${items.pic}" />
											<input type="file" id="file" placeholder="file" name="file" onchange="showPreview(this)">

										</td>
									</tr>
									<tr>
										<td>
											<em style="color: red;">*</em>
											昵  称&nbsp;&nbsp;&nbsp;
										</td>
										<td><input type="text" name="username"value="" /></td>
									</tr>
									<tr><td class="td1"></td></tr>
									<tr>
										<td>
											<em style="color: red;">*</em>
											手机号码&nbsp;&nbsp;&nbsp;
										</td>
										<td><input type="text" name="telephone"  value="" /></td>
									</tr>
									<tr><td class="td1"></td></tr>
									<tr>
										<td>
											<em style="color: red;">*</em>
											email&nbsp;&nbsp;&nbsp;
										</td>
										<td><input type="text" name="telephone" value="" /></td>
									</tr>
									<tr><td class="td1"></td></tr>
									<tr>
										<td>
											<em style="color: red;">*</em>
											密  码&nbsp;&nbsp;&nbsp;
										</td>
										<td>
											<input type="password" name="password"  value="12345" />
										</td>
									</tr>
									<tr><td class="td1"></td></tr>
									<tr>
										<td>
											<em style="color: red;">*</em>
											确认密码&nbsp;&nbsp;&nbsp;
										</td>
										<td><input type="password" name="password"  value="12345" /> </td>
									</tr>
									<tr><td class="td1"></td></tr>
									<tr>
										<td>
											<em style="color: red;">*</em>
											出生日期&nbsp;&nbsp;&nbsp;
										</td>
										<td><input type="text" name="telephone"  value="" /></td>
									</tr>
								</table>

								<!-- <label>
                                    <em style="color: red;">*</em>
                                    昵  称
                                </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <input type="text" name="username" id="" value="" /><br><br>
                                <label>
                                    <em style="color: red;">*</em>
                                    手机号码
                                </label>&nbsp;&nbsp;&nbsp;
                                <input type="text" name="telephone" id="" value="" /><br><br>
                                <label>
                                    <em style="color: red;">*</em>
                                    email
                                </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <input type="text" name="telephone" id="" value="" /><br><br>

                                <label>
                                    <em style="color: red;">*</em>
                                    密码
                                </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <input type="password" name="password" id="" value="12345" />
                                <button type="button">修改</button><br><br>

                                <label>
                                    <em style="color: red;">*</em>
                                    确认密码
                                </label>&nbsp;&nbsp;&nbsp;
                                <input type="password" name="password" id="" value="12345" /><br><br>

                                <label>
                                    <em style="color: red;">*</em>
                                    出生日期
                                </label>&nbsp;&nbsp;&nbsp;
                                <input type="text" name="telephone" id="" value="" /><br> -->
							</div>
						</div>

						<!-- 汽车票订单 -->

					</div>
				</div>
			</div>
		</div>
	</div>
	</body>
	<script src="js/jquery-3.1.1.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript">

	</script>
</html>
