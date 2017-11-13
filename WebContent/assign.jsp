<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<link rel="stylesheet" href="assign.css" />
</head>
<body>
	<h1>请输入您的个人信息：</h1>
	<div id="center">
		 <form action="assign_s" method="get">
			<span class="kuan"><input name="name" type="text"
				placeholder=" 请输入姓名" size="16" required /></br> </br></span>
			<div class="kuan">
				<input name="sex" type="text" placeholder=" 请输入性别" size="16"
					required /></br> </br>
			</div>
			<div class="kuan">
				<input name="age" type="text" placeholder=" 请输入年龄" size="16"
					required /></br> </br>
			</div>
			<div class="kuan">
				<input name="phone" type="text" placeholder=" 请输入手机号码" size="16"
					required /></br> </br>
			</div>
			<div class="kuan">
				<input name="email" type="text" placeholder=" 请输入电子邮箱" size="16"
					required /></br> </br>
			</div>
			<div class="kuan">
				<input name="graduated_school" type="text" placeholder=" 请输入毕业院校" size="16"
					required /></br> </br>
			</div>
			<div class="kuan">
				<input name="company" type="text" placeholder=" 请输入工作单位" size="16"
					required /></br> </br>
			</div>
			<div class="kuan">
				<input name="CSDN_add" type="text" placeholder=" 请输入CSDN主页链接"
					size="16" required /></br> </br>
			</div>
			<div class="kuan">
				<input name="password" type="text" placeholder=" 请输入密码（16位以内）"
					size="16" required /></br> </br>
				</br>
			</div>

			<div class="an">
				<input type="submit" value="确认" />
			</div>
		</form>
	</div>
	</br>
	</br>
	<div class="bu">
		<a href=home><button type="button">返回到登录主页</button></a>
	</div>
</body>
</html>