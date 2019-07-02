<%@page language="java" contentType="text/html; utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>异步查询所有的帖子</title>
</head>
<script language="JavaScript" src="js/jquery-1.8.3.js"></script>
<script language="JavaScript">
    $(function () {//jquery加载事件
       $("#but").click(function () {
           //使用AJAX技术获取服务器数据
           $.ajax({
               type: "get",//发送请求的方式
               url: "getData2",//发送请求的服务器地址
               //data: "name=John&location=Boston",给服务器传参
               dataType:"json",//表示返回的是json格式
               success: function(data){//回调函数 data代表的就是服务器返回的数据
                   //alert( "Data Saved: " + data );
                   var table = "<table border=1 cellspacing='0'>";//怎么让数据在表格中居中显示
                   table=table+"<tr><td>帖子编号</td><td>标题</td><td>内容</td><td>作者</td><td>时间</td><td>回复</td></tr>";
                   for (var i=0;i<data.length;i++){
                       var s =data[i];
                       table=table+"<tr><td>" +s.id+ "</td><td>"+s.title+"</td><td>"+s.summary+"</td><td>"+s.author+"</td><td>"+s.createdate+"</td><td>"+s.invid+"</td></tr>";
                   }
                   table = table+"</table>";
                   //显示
                   $("#div1").html(table);
               }
           });
       });
    });
</script>
<body>
<input type="button" id="but" value="显示所有的帖子信息">
<div id="div1"></div>
</body>
</html>
