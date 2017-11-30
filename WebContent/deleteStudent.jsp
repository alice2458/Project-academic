<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>删除学生</title>
<link rel="stylesheet" href="assign.css" />
</head>
<body>
	<h1>请输入要删除的学生的姓名：</h1>
	<div id="center">
		 <form action="deletes" method="get">
			<span class="kuan"><input name="student" type="text"
				placeholder=" 请输入学生的姓名" size="16" required /></br> </br></span>

			<div class="an">
				<input type="submit" value="确认" />
			</div>
		</form>
	</div>
	</br>
	</br>
	<div class="bu">
		<a href=showinfo><button type="button">返回到登录主页</button></a>
	</div>
</body>
</html>