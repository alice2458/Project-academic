package com.structs.trio;

import database.*;

public class Assign_in {
	private String name;
	private String sex;
	private int age;
	private String phone;
	private String email;
	private String graduated_school;
	private String company;
	private String CSDN_add;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getGraduated_school()
	{
		return graduated_school;
	}
	public void setGraduated_school(String graduated_school)
	{
		this.graduated_school = graduated_school;
	}
	public String getCompany()
	{
		return company;
	}
	public void setCompany(String company)
	{
		this.company = company;
	}
	public String getCSDN_add()
	{
		return CSDN_add;
	}
	public void setCSDN_add(String CSDN_add)
	{
		this.CSDN_add = CSDN_add;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String add_information() 
	{
		String sql_info1 = "insert into information values(" + "\"" + getName()  + "\"" + "," + "\"" + getSex() + "\"" + "," + getAge() + ","
				+ "\"" + getPhone() + "\"" + "," + "\"" + getEmail()  + "\"" + "," + "\"" + getGraduated_school() + "\"" + "," + "\"" + getCompany()  + "\"" + "," + "\"" + getCSDN_add() +
				"\"" + "," + "\"" + getPassword() + "\"" + ")";
		MySQLConnecter mc = new MySQLConnecter();
		int status = mc.update(sql_info1);
		String sql_addTeacher = "create table " + getName() + "的老师" + "(teacher varchar(20), teacherStartTime varchar(20),"
				+ "teacherOverTime varchar(20), " + "project varchar(20));";
		String sql_addStudent = "create table " + getName() + "的学生" + "(student varchar(20), studentStartTime varchar(20),"
				+ "studentOverTime varchar(20), " + "project varchar(20));";
		mc.update(sql_addTeacher);
		mc.update(sql_addStudent);
		if (status == 0)
			return "FALSE";
		return "SUCCESS";
	}
}
