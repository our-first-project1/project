//首页
function first(){
    var pageNow = 1;
    $.ajax({
        type:"get",
        url:"/orders?method=viewAll&pageNow="+pageNow,
        success:function (content) {
            $(".showAjax").html(content);
        }
    })
}
//末页
function last(myPages) {
    $.ajax({
        type:"get",
        url:"/orders?method=viewAll&pageNow="+myPages,
        success:function (content) {
            $(".showAjax").html(content);
        }
    })
}
//页码跳转
function pageTurn(page) {
    $.ajax({
        type:"get",
        url:"/orders?method=viewAll&pageNow="+page,
        success:function (content) {
            $(".showAjax").html(content);
        }
    })
}