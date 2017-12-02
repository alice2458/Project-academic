package com.structs.trio;

import java.util.ArrayList;
import java.util.Map;

import database.MySQLConnecter;

public class addTea 
{
	private String teacher;
	private String teacher_start_time;
	private String teacher_over_time;
	private String project;
	
	public String get_teacher() {
		return this.teacher;
	}

	public void set_teacher(String teacher) {
		this.teacher = teacher;
	}
	
	public String get_teacher_st() {
		return this.teacher_start_time;
	}

	public void set_teacher_st(String teacher_start_time) {
		this.teacher_start_time = teacher_start_time;
	}
	
	public String get_teacher_ot() {
		return this.teacher_over_time;
	}

	public void set_teacher_ot(String teacher_over_time) {
		this.teacher_over_time = teacher_over_time;
	}
	
	public String get_project() {
		return this.project;
	}

	public void set_project(String project) {
		this.project = project;
	}
	
	public String AddTeacher() 
	{
		String sql = "insert into " + Login_in.name + "的老师 " + "values(" + 
				"\"" + get_teacher()  + "\"" + "," + get_teacher_st() + ","
				+ get_teacher_ot() + "," + "\"" + get_project()  + "\"" + ");";
		MySQLConnecter newc = new MySQLConnecter();
		int status = newc.update(sql);
		if (status == 0)
			return "FALSE";
		
		String sql2 = "select * from information where Name=\"" + get_teacher() + "\"";
		System.out.println(sql2);
		ArrayList<Map<String, String>> result2 = newc.select(sql2, "information");
		
		if (result2.size() != 0) {
			String sql4 = "insert into " + get_teacher() + "的学生" + "values(" + 
					"\"" + Login_in.name  + "\"" + "," + get_teacher_st() + ","
					+ get_teacher_ot() + "\"" + get_project()  + "\"" + ");";
			System.out.println(sql4);
			int num = newc.update(sql4);
			if (num == 0)
				return"FALSE";
		}
		return "SUCCESS";
	}
}
