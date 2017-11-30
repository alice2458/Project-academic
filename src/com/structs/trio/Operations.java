package com.structs.trio;

import java.util.ArrayList;
import java.util.Map;

import database.MySQLConnecter;

public class Operations 
{	
	private String teacher;
	private String student;
	private String teacher_start_time;
	private String teacher_over_time;
	private String student_start_time;
	private String student_over_time;
	
	public String get_teacher() {
		return teacher;
	}

	public void set_teacher(String t) {
		teacher = t;
	}
	
	public String get_student() {
		return student;
	}

	public void set_student(String s) {
		student = s;
	}
	
	public String get_teacher_st() {
		return teacher_start_time;
	}

	public void set_teacher_st(String tst) {
		teacher_start_time = tst;
	}
	
	public String get_teacher_ot() {
		return teacher_over_time;
	}

	public void set_teacher_ot(String tot) {
		teacher_over_time = tot;
	}
	
	public String get_student_st() {
		return student_start_time;
	}

	public void set_student_st(String sst) {
		student_start_time = sst;
	}
	
	public String get_student_ot() {
		return student_over_time;
	}

	public void set_student_ot(String sot) {
		student_over_time = sot;
	}
	
	public String DeleteEdge()
	{
		return "SUCCESS";
	}

	public String AddEdge() 
	{
		String sql = "insert into  values(";
		MySQLConnecter newc = new MySQLConnecter();
		ArrayList<Map<String, String>> result1 = newc.select(sql1, "nousers");
		if (result1.size() == 0) {
			return "FALSE";
		}
		
		return "SUCCESS";
	}
	
	public String ChangeEdge()
	{
		return "SUCCESS";
	}
}
