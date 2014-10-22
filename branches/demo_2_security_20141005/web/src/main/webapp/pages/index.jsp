<%@page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>springmvcdemo</title>
</head>
<body>
	<div>欢迎来到springmvcdemo学习</div>
    <form action="/add.do" method="post">  
		<div>
			用户名： 
			<input type="text" name="username" />
		</div>
		<div>
			性别： <select name="sexy">
				<option value="1">男</option>
				<option value="2">女</option>
			<select>
		</div>
		<div>
			学习内容：<select name="content">
				<option value="1">aop原理</option>
				<option value="2">定时器使用</option>
				<option value="3">常用的注解</option>
			</select>
		</div>
		<input type="submit" value="报名" />
	 </form>  

	<div>
		<table >
		    <th>姓名</th>
		    <th>性别</th>
		    <th>学习内容</th>
			<c:forEach items="${messageLists}" var="messageModel">
			<tr>
				<td>${messageModel.username}</td>
				<td>${messageModel.sexy}</td>
				<td>${messageModel.content}</td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
