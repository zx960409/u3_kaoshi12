<%@page language="java" contentType="text/html; utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>帖子列表</h2>
<table align="center">
    <tr>
帖子标题:<input type="text" name="title">
<input type="submit" name="ss" value="搜索">
    </tr>
</table>
<table border="1" cellspacing="0" width="60%" >
    <tr align="center">
        <td>帖子编号</td>
        <td>标题</td>
        <td>内容摘要</td>
        <td>作者</td>
        <td>发布时间</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${pageInfo.list}" var="g">
        <tr align="center">
            <td>${g.id}</td>
            <td>${g.title}</td>
            <td>${g.summary}</td>
            <td>${g.author}</td>
            <td>${g.createdate}</td>
            <td>
                <a href="showReplyDetail?id=${g.id}">查看回复</a>
                <a href="${pageContext.request.contextPath}/deleteInvitation?id=${g.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
<table width="100%" align="center">
    <tr>
        <td>第${pageInfo.pageNum}/${pageInfo.pages}页</td>
        <td><a href="/showInvitation2?page=1">首页</a>&nbsp;
            <a href="showInvitation2?page=${pageInfo.prePage==0?1:pageInfo.prePage}">上一页</a>&nbsp;
            <a href="showInvitation2?page=${pageInfo.nextPage==0?pageInfo.pages:pageInfo.nextPage}">下一页</a>&nbsp;
            <a href="showInvitation2?page=${pageInfo.pages}">末页</a></td>
    </tr>
</table>
</body>
</html>
