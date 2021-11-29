<%--
  Created by IntelliJ IDEA.
  User: 85066
  Date: 2021/11/29
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>在线预定</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/material-scrolltop.css">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-2 column">
        </div>
        <div class="col-md-8 column">
            <h3 style="text-align: center;">
                <strong>在线预定</strong>
            </h3>
            <form class="form-horizontal" role="form">
                <div class="form-group">
                    <label class="col-sm-2 control-label">出行日期</label>
                    <div class="col-sm-10">
                        <input type="date" class="form-control" id="depart_date" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">出发时间</label>
                    <div class="col-sm-10">
                        <input type="time" class="form-control" id="depart_time" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">始发站</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="depart_station" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">终点站</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="dest_station" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">乘车人姓名</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="name" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">身份证号</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="person_id" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">电话</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="telephone" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">车票类型</label>
                    <div class="col-sm-10">
                        <div class="btn-group" role="group" aria-label="...">
                            <button type="button" class="btn btn-default">全票</button>
                            <button type="button" class="btn btn-default">半票</button>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">购买保险</label>
                    <div class="col-sm-10">
                        <div class="btn-group" role="group" aria-label="...">
                            <button type="button" class="btn btn-default">是</button>
                            <button type="button" class="btn btn-default">否</button>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">携带儿童</label>
                    <div class="col-sm-10">
                        <div class="btn-group" role="group" aria-label="...">
                            <button type="button" class="btn btn-default">是</button>
                            <button type="button" class="btn btn-default">否</button>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-primary btn-lg btn-block">提交订单</button>
                    </div>
                </div>
            </form>
        </div>
        <div class="col-md-2 column">
        </div>
    </div>
</div>
</body>
<script src="js/jquery-3.1.1.js" type="text/javascript" charset="utf-8"></script>
<script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
</html>
