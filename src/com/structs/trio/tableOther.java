package com.structs.trio;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import database.MySQLConnecter;

public class tableOther 
{
	private ArrayList<String> list = null;

	public ArrayList<String> getList() {
		return this.list;
	}

	public String infortable()
	{
		ServletRequest request = ServletActionContext.getRequest();
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		MySQLConnecter mc = new MySQLConnecter();
		
		String sql1 = "select * from " + find.findname + "����ʦ" + ";";
		ArrayList<Map<String, String>> result1 = mc.select(sql1, Login_in.name+"����ʦ");
		session.setAttribute("teacherlistOther", result1);
		
		String sql2 = "select * from " + find.findname + "��ѧ��" + ";";
		ArrayList<Map<String, String>> result2 = mc.select(sql2, Login_in.name+"��ѧ��");
		session.setAttribute("studentlistOther", result2);
		
		return "SUCCESS";
	}
}
