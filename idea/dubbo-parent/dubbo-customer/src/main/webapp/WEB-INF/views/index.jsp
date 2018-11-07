<%--
  Created by IntelliJ IDEA.
  User: st
  Date: 2018/10/30
  Time: 0:03
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html
PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>dubbo</title>
</head>
<%--<script type="text/javascript"  src="/static/js/jquery-3.3.1.min.js"></script>&lt;%&ndash;就是不知道引入本地的就是不行&ndash;%&gt;--%>
<body>
<a href="http://127.0.0.1:8080/index/invokeService.htm">st</a>
<%--<input id="button" type="button" value="调用Service">--%>
</body>
</html>
<script>
    $("#button").click(function(){
        var data ={username:'st',password:'123456'};
        $.ajax({
            url:"http://localhost:8080/index/invokeService.json",
            type:'get',
            dataType:"json",
            contentType:"application/json;charset=UTF-8",
            data:"{'username':'st','password':'123456'}",
            success: function(result){
                if (result=="st"){
                   alert("调用dubbo成功");
                }
                else {
                    alert("调用dubbo成功");
                }
            }
        })
    });
</script>