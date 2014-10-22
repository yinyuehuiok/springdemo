<%@page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>springmvcdemo</title>
</head>
<body>
  <h3>欢迎来到springmvcdemo学习基地</h3>
  <form name="f" method="POST" action="/j_spring_security_check">
    <table>
      <tr>
        <td>用户名：</td>
        <td><input type="text" name="j_username" /></td>
      </tr>
      <tr>
       <td>密码：</td>
        <td><input type="password" name="j_password" /></td>
      </tr>
      <tr>
       <td>记住我：</td>
        <td><input type="checkbox" name="_spring_security_remember_me" /></td>
      </tr>
      <tr>
      <td><input name="submit" type="submit" /></td>
      <td><input name="reset" type="reset" /></td>
      </tr>
    </table>
  </form>
</body>
</html>
