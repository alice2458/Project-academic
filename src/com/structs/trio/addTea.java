package com.structs.trio;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import database.MySQLConnecter;

public class addTea 
{
	private String teacher;
	private String teacherStartTime;
	private String teacherOverTime;
	private String project;
	
	public String AddTeacher() 
	{
		ServletRequest request = ServletActionContext.getRequest();
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		teacher = request.getParameter("teacher");
		teacherStartTime = request.getParameter("teacherStartTime");
		teacherOverTime = request.getParameter("teacherOverTime");
		project = request.getParameter("project");
		String sql = "insert into " + Login_in.name + "的老师" + " values(" + 
				"\"" + teacher  + "\"" + "," + "\"" + teacherStartTime + "\"" + ","
				+ "\"" + teacherOverTime + "\"" + "," + "\"" + project  + "\"" + ");";
		MySQLConnecter newc = new MySQLConnecter();
		int status = newc.update(sql);
		if (status == 0)
			return "FALSE";
		
		String sql2 = "select * from information where Name=\"" + teacher + "\"" + ";";
		ArrayList<Map<String, String>> result2 = newc.select(sql2, "information");
		
		if (result2.size() != 0) {
			String sql4 = "insert into " + teacher + "的学生" + " values(" + 
					"\"" + Login_in.name  + "\"" + "," + "\"" + teacherStartTime + "\"" + ","
					+ "\"" + teacherOverTime + "\"" + "," + "\"" + project  + "\"" + ");";
			int num = newc.update(sql4);
			if (num == 0)
				return"FALSE";
		}
		return "SUCCESS";
	}
}
