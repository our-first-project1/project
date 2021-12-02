<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>在线预定</title>
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
		<style type="text/css">
			#alo{
				color: #D58512;
			}
			#alo:hover{
				color: #EB9316;
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
			<div class="col-md-2 column">
			</div>
			<div class="col-md-8 column" style="color: black">
				<h3 style="text-align: center;">
					<strong>在线预定</strong>
				</h3>
				<form action="/order?method=insertOrderList" method="post" class="form-horizontal" role="form">
					<div class="form-group">
						<label class="col-sm-2 control-label">出行日期</label>
						<div class="col-sm-10">

							<input type="text" class="form-control" name="departDate" id="depart_date" disabled="disabled" value="${departDate}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label" >出发时间</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="departTime" id="depart_time" disabled="disabled" value="${departTime}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">始发站</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="departStation" id="depart_station" disabled="disabled" value="${departStation}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">终点站</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="destStation" id="dest_station" disabled="disabled" value="${destStation}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">乘车人姓名</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="name" name="name" required />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">身份证号</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="person_id" name="personId" required />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">电话</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="telephone" name="telephone" required />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">车票类型</label>
						<div class="col-sm-10">
							<div class="btn-group" role="group" style="font-size: 16px;">
								<input type="radio" name="ticketType" value="1" checked="checked"/>全票 &nbsp;&nbsp;&nbsp;&nbsp;
								<input type="radio" name="ticketType" value="0" />半票
							</div>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label" >购买保险</label>
						<div class="col-sm-10">
							<div class="btn-group" role="group" style="font-size: 16px;">
								<input type="radio" name="insurance" value="1" />是 &nbsp;&nbsp;&nbsp;&nbsp;
								<input type="radio" name="insurance" value="0" checked="checked" />否
							</div>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">携带儿童</label>
						<div class="col-sm-10">
							<div class="btn-group" role="group" style="font-size: 16px;">
								<input type="radio" name="takeChildren" value="1" />是 &nbsp;&nbsp;&nbsp;&nbsp;
								<input type="radio" name="takeChildren" value="0" checked="checked" />否
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<input type="submit" class="btn btn-primary btn-lg btn-block" value="提交订单" />
						</div>
					</div>
				</form>
			</div>
			<div class="col-md-2 column">
			</div>
		</div>
	</div>

	<div class="foot">
		<%@ include file="footer.jsp" %>
	</div>

	</body>
	<script src="js/jquery-3.1.1.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
</html>
