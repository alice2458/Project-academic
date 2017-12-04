<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人资料</title>
<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
</head>
<body style="background: url(images/background.png)">
<body>
	<h1>个人基本信息</h1>
	<table width="80%" border="1" align="center">
		<tr bgcolor="#949494">
			<th>姓名</th>
			<th>性别</th>
			<th>年龄</th>
			<th>电话号码</th>
			<th>电子邮箱</th>
			<th>毕业院校</th>
			<th>工作单位</th>
			<th>CSDN主页</th>
		</tr>
		<%
			ArrayList<Map<String, String>> list2 = (ArrayList<Map<String, String>>) session.getAttribute("inforlist");
			if (list2.size() > 0) {
				out.print("<tr align=\"center\"><td>" + list2.get(0).get("name") + "</td>\n");
				out.print("<td>" + list2.get(0).get("sex") + "</td>\n");
				out.print("<td>" + list2.get(0).get("age") + "</td>\n");
				out.print("<td>" + list2.get(0).get("phone") + "</td>\n");
				out.print("<td>" + list2.get(0).get("email") + "</td>\n");
				out.print("<td>" + list2.get(0).get("graduated_school") + "</td>\n");
				out.print("<td>" + list2.get(0).get("company") + "</td>\n");
				out.print("<td>" + list2.get(0).get("CSDN_add") + "</td></tr>\n");

			} else {
				out.print("<tr><td>" + "false" + "</td></tr>\n");
			}
		%>
	</table>
	</table>
    <div class="register w3layouts agileits">
      <div class="send-button w3layouts agileits">
      	<input type="submit" value="注册">
      </div>
    </div>
</body>
</body>
</html>