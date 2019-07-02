<%@page language="java" contentType="text/html; utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>帖子列表</h2>
帖子标题:<input type="text" name="title">
<input type="submit" name="ss" value="提交">
<table border="1" cellspacing="0" width="60%">
    <tr align="center">
        <td>帖子编号</td>
        <td>标题</td>
        <td>内容摘要</td>
        <td>作者</td>
        <td>发布时间</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="g">
        <tr align="center">
            <td>${g.id}</td>
            <td>${g.title}</td>
            <td>${g.summary}</td>
            <td>${g.author}</td>
            <td>${g.createdate}</td>
            <td>
                <a href="">查看回复</a>
                <a href="deleteInvitation?id=${g.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
