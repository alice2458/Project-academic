package com.structs.trio;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import database.MySQLConnecter;

public class Operations 
{
	public String Add()
	{
		return "SUCCESS";
	}
	
	public String Delete()
	{
		return "SUCCESS";
	}
	
	public String Create() {
		ServletRequest Srequest = ServletActionContext.getRequest();
		HttpServletRequest Sreq = (HttpServletRequest) Srequest;
		HttpSession session = Sreq.getSession();
		String teacher = Srequest.getParameter("teacher");
		String student = Srequest.getParameter("student");
		String start_time = Srequest.getParameter("start_time");
		String over_time = Srequest.getParameter("over_time");
		//int s_year , s_month , s_day;
		//s_year = Integer.parseInt(time.substring(0,4));
		//month = Integer.parseInt(time.substring(5,7));
		//day = Integer.parseInt(time.substring(8,10));
		String sql1 = "insert into users values(";
		MySQLConnecter newc = new MySQLConnecter();
		ArrayList<Map<String, String>> result1 = newc.select(sql1, "nousers");
		if (result1.size() == 0) {
			return "FALSE";
		}
		
		return "SUCCESS";
	}
}
