<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学术关系管理</title>
<link rel="stylesheet" href="Home.css" />
</head>
<body {background-image: url(Academic Relationship Tree\WebContent\BG.jpg);}>
	</br>
	<div id="center")>
		<form action="log" method="get">
		<div class="txt1">
			<h1>欢迎使用学术关系管理系统！</h1>
		</div>
		<div class="txt2">
			<h1>用户名：</h1>
		</div>
		<div class="kuan1">
			<input name="name" type="text" placeholder=" 请输入姓名"
			size="16" required /></br> </br>
		</div>
		<div class="txt3">
			<h1>密码：</h1>
		</div>
		<div class="kuan2">
			<input name="password" type="text" placeholder=" 请输入密码"
			size="16" required /></br> </br>
		</div>
		<div class="an">
			<input type="submit" value="登录" />
			<a href=assign><button type="button">注册</button></a>
		</div>
		</form>
	</div>
	</br>
</body>
</html>