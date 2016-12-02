<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	</head>
	<body>
		<form action="${pageContext.request.contextPath }/user/regist" method="post">
			用户名：<input type="text" name="username"/><br/>
			密码：<input type="password" name="password"><br/>
			电话：<input type="text" name="phone"/><br/>
			<input type="submit" value="注册"/>
		</form>
		${message }
	</body>
</html>
