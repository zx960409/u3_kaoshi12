<%@page language="java" contentType="text/html; utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>回复信息列表</h2>
<table border="1" cellspacing="0" width="60%" >
    <tr align="center">
        <td>帖子编号</td>
        <td>回复内容</td>
        <td>内容昵称</td>b
        <td>发布时间</td>
    </tr>
    <c:forEach items="${pageInfo.list}" var="r">
        <tr align="center">
            <td>${r.invid}</td>
            <td>${r.content}</td>
            <td>${r.author}</td>
            <td>${r.createdate}</td>
        </tr>
    </c:forEach>
</table>
<table width="100%" align="center">
    <tr>
        <td>第${pageInfo.pageNum}/${pageInfo.pages}页</td>
        <td><a href="/showReplyDetail?page=1">首页</a>&nbsp;
            <a href="showReplyDetail?page=${pageInfo.prePage==0?1:pageInfo.prePage}">上一页</a>&nbsp;
            <a href="showReplyDetail?page=${pageInfo.nextPage==pageInfo.pages?pageInfo.pages:pageInfo.nextPage}">下一页</a>&nbsp;
            <a href="showReplyDetail?page=${pageInfo.pages}">末页</a></td>
    </tr>
</table>
</body>
</html>
