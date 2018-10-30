<%--
  Created by IntelliJ IDEA.
  User: st
  Date: 2018/10/30
  Time: 0:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>dubbo</title>
</head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<%--<script type="text/javascript"  src="../../static/js/jquery-3.3.1.min.js"></script>就是不知道引入本地的就是不行--%>
<body>
<input id="button" type="button" value="调用Service">
</body>
</html>
<script>
    $("#button").click(function(){
        window.location.href = window.location.protocol + "//" + window.location.host + "/index/invokeService.htm";
        /*var data ={username:'st',password:'123456'};
        $.ajax({
            url:"http://localhost:8080/index/invokeService.json",
            type:'POST',
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
        })*/
    });
</script>