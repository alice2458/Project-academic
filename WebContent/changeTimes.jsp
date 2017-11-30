<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改与学生关系存在的时间</title>
<link rel="stylesheet" href="assign.css" />
</head>
<body>
	<h1>请输入相关信息:</h1>
	<div id="center">
		<form action="changes" method="get">
		 <span class="kuan"><input name="student" type="text"
				placeholder=" 请输入学生的姓名" size="16" required /></br> </br></span>
			<div class="kuan">
				<input name="student_start_time" type="text" placeholder=" 请按照XXXX-XX-XX格式输入师生关系的开始时间" size="16"
					required /></br> </br>
			</div>
			<div class="kuan">
				<input name="student_over_time" type="text" placeholder=" 请按照XXXX-XX-XX格式输入师生关系的结束时间" size="16"
					required /></br> </br>
			</div>
			<div class="an">
				<input type="submit" value="确认" />
			</div>
		</form>
	</div>
	</br>
	</br>
	<div class="bu">
		<a href=showinfo><button type="button">返回到个人主页</button></a>
	</div>
</body>
</html>