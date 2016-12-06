<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<html>
<body>
<h2>Hello World!</h2>
<form action="<%=path %>/user/login.do" method="post">
用户名 ： <input type="text" name="id"> <br>
密码 : <input type="text" name="password">
<input type="submit" value="提交">
</form>


</body>
</html>