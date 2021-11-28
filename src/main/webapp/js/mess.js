function personAcc() {
    $.ajax({
        type:"get",
        url:"personAccount.jsp",
        success:function (content) {
            $(".ourmess").html(content)
        }
    })
}


//注册验证昵称
function validateUsername() {
    $.ajax({
        type:"post",
        url:"/user?method=validateUsername",
        date:{"username":$("#username").val()},
        dateType:"json",
        success:function (o) {
            if (o.glag == "false"){
                $("#nameMsg").html("<font style='color: green'>"+o.msg+"</font>")
            }else {
                $("#nameMsg").html("<font style='color: green'>"+o.msg+"</font>")
            }
        }
    })
}

//注册验证手机号
function validateUsername() {
    $.ajax({
        type:"post",
        url:"/user?method=validatePhone",
        date:{"telephone":$("#telephone").val()},
        dateType:"json",
        success:function (o) {
            if (o.glag == "false"){
                $("#phoneMsg").html("<font style='color: green'>"+o.msg+"</font>")
            }else {
                $("#phoneMsg").html("<font style='color: green'>"+o.msg+"</font>")
            }
        }
    })
}