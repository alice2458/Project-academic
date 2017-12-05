package com.structs.trio;

import java.util.ArrayList;
import java.util.Map;

import database.MySQLConnecter;

public class addTea 
{
	private String teacher;
	private String teacherStartTime;
	private String teacherOverTime;
	private String project;
	private ArrayList<String> list = null;

	public ArrayList<String> getList() {
		return this.list;
	}
	
	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	public String getTeacherSt() {
		return teacherStartTime;
	}

	public void setTeacherSt(String teacherStartTime) {
		this.teacherStartTime = teacherStartTime;
	}
	
	public String getTeacherOt() {
		return teacherOverTime;
	}

	public void setTeacherOt(String teacherOverTime) {
		this.teacherOverTime = teacherOverTime;
	}
	
	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
	
	public String AddTeacher() 
	{
		String sql = "insert into " + Login_in.name + "的老师" + " values(" + 
				"\"" + getTeacher()  + "\"" + "," + "\"" + getTeacherSt() + "\"" + ","
				+ "\"" + getTeacherOt() + "\"" + "," + "\"" + getProject()  + "\"" + ");";
		MySQLConnecter newc = new MySQLConnecter();
		int status = newc.update(sql);
		if (status == 0)
			return "FALSE";
		
		String sql2 = "select * from information where Name=\"" + getTeacher() + "\"" + ";";
		ArrayList<Map<String, String>> result2 = newc.select(sql2, "information");
		
		if (result2.size() != 0) {
			String sql4 = "insert into " + getTeacher() + "的学生" + " values(" + 
					"\"" + Login_in.name  + "\"" + "," + "\"" + getTeacherSt() + "\"" + ","
					+ "\"" + getTeacherOt() + "\"" + "," + "\"" + getProject()  + "\"" + ");";
			int num = newc.update(sql4);
			if (num == 0)
				return"FALSE";
		}
		return "SUCCESS";
	}
}
