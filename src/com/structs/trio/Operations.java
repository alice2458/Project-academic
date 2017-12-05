package com.structs.trio;

import java.util.ArrayList;
import java.util.Map;

import database.MySQLConnecter;

public class Operations 
{	
	private String owner;
	private String teacher;
	private String student;
	private String teacher_start_time;
	private String teacher_over_time;
	private String student_start_time;
	private String student_over_time;
	private String project;
	private ArrayList<String> list = null;

	public ArrayList<String> getList() {
		return this.list;
	}
	
	public String get_project() {
		return this.project;
	}

	public void set_project(String project) {
		this.project = project;
	}
	
	public String get_owner() {
		return this.owner;
	}

	public void set_owner(String owner) {
		this.owner = owner;
	}
	
	public String get_teacher() {
		return this.teacher;
	}

	public void set_teacher(String teacher) {
		this.teacher = teacher;
	}
	
	public String get_student() {
		return this.student;
	}

	public void set_student(String student) {
		this.student = student;
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
	
	public String get_student_st() {
		return this.student_start_time;
	}

	public void set_student_st(String student_start_time) {
		this.student_start_time = student_start_time;
	}
	
	public String get_student_ot() {
		return this.student_over_time;
	}

	public void set_student_ot(String student_over_time) {
		this.student_over_time = student_over_time;
	}
	
	public String AddStudent() 
	{
		String sql = "insert into " + get_owner() + "的学生" + "values(" + 
				"\"" + get_student()  + "\"" + "," + get_student_st() + ","
				+ get_student_ot() + "," + "\"" + get_project()  + "\"" + ");";
		MySQLConnecter newc = new MySQLConnecter();
		int status = newc.update(sql);
		if (status == 0)
			return "FALSE";
		
		String sql1 = "select * from information where Name=\"" + get_student() + "\"";
		ArrayList<Map<String, String>> result1 = newc.select(sql1, "information");
		if (result1.size() != 0) {
			String sql3 = "insert into " + get_student() + "的老师" + "values(" + 
					"\"" + get_owner()  + "\"" + "," + get_student_st() + ","
					+ get_student_ot() + "\"" + get_project()  + "\"" + ");";
			int number = newc.update(sql3);
			if (number == 0)
				return "FALSE";
		}
		return "SUCCESS";
	}
	
	public String DeleteStudent()
	{
		String sql = "delete from " + get_owner() + "的学生 where student = '" + get_student() + "'";
		MySQLConnecter newc = new MySQLConnecter();
		int status = newc.update(sql);
		if (status == 0)
			return "FALSE";
		
		String sql1 = "select * from information where Name=\"" + get_student() + "\"";
		ArrayList<Map<String, String>> result1 = newc.select(sql1, "information");
		
		if (result1.size() != 0) {
			String sql3 = "delete from " + get_student() + "的老师 where teacher = '" + get_owner() + "'";
			int num = newc.update(sql3);
			if (num == 0)
				return "FALSE";
		}
		return "SUCCESS";
	}
	
	public String DeleteTeacher()
	{
		String sql = "delete from " + get_owner() + "的老师 where teacher = '" + get_teacher() + "'";
		MySQLConnecter newc = new MySQLConnecter();
		int status = newc.update(sql);
		if (status == 0)
			return "FALSE";
		
		String sql2 = "select * from information where Name=\"" + get_teacher() + "\"";
		ArrayList<Map<String, String>> result2 = newc.select(sql2, "information");
		
		if (result2.size() != 0) {
			String sql4 = "delete from " + get_teacher() + "的学生 where student = '" + get_owner() + "'";
			int num = newc.update(sql4);
			if (num == 0)
				return"FALSE";
		}
		return "SUCCESS";
	}
	
	public String SearchInformation()
	{
		return "SUCCESS";
	}
	
	public String infor()
	{
		return "SUCCESS";
	}
	
	public String ChangeTimet()
	{
		return "SUCCESS";
	}
	
	public String ChangeTimes()
	{
		return "SUCCESS";
	}
}