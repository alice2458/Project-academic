package com.struts.trio;

import database.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpSession;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import org.apache.struts2.ServletActionContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

public class HelloAction{
	public String ID;
	//private ServletRequest request;
	private ArrayList<String> list = null;
	
    //password = request.getParameter("password");
	public ArrayList<String> getList() {
		return this.list;
	}

	public String getID() {
		return this.ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}
	
	/*public String getpassword() {
		return this.password;
	}

	public void setpassword(String password) {
		this.password = password;
	}*/
	
	public String towelcome(){
		return "SUCCESS";
	}
	 
	public String tosign(){
		ServletRequest Srequest = ServletActionContext.getRequest();
		HttpServletRequest Sreq = (HttpServletRequest) Srequest;
		HttpSession session = Sreq.getSession();
		String password = Srequest.getParameter("password");
		int i;
		System.out.println(ID + " " + password);
		String sql1 = "select * from usersID";
		connect newc = new connect();
		ArrayList<Map<String, String>> result1 = newc.select(sql1, "usersID");
		if (result1.size() == 0) {
			return "FALSE";
		}
		System.out.println(result1.size());
		for (i = 0 ; i < result1.size(); i ++) {
			System.out.println(i);
			System.out.println(this.ID.equals(result1.get(i).get("ID")));
			System.out.println(password.equals(result1.get(i).get("password")));
			if (this.ID.equals(result1.get(i).get("ID")) && password.equals(result1.get(i).get("password"))) {
				//System.out.println("Success");
				return "SUCCESS";
			}
		}
		
		
		//session.setAttribute("result", result2);

		return "FALSE";
	}
	
	public String tomain() {
		return "SUCCESS";
	}
	
	public String tomoniter() {
		ServletRequest Srequest = ServletActionContext.getRequest();
		HttpServletRequest Sreq = (HttpServletRequest) Srequest;
		HttpSession session = Sreq.getSession();
		String password = Srequest.getParameter("password");
		int i;
		//System.out.println(ID + " " + password);
		String sql1 = "select * from moniter";
		connect newc = new connect();
		ArrayList<Map<String, String>> result1 = newc.select(sql1, "moniter");
		if (result1.size() == 0) {
			return "FALSE";
		}
		System.out.println(result1.size());
		for (i = 0 ; i < result1.size(); i ++) {
			System.out.println(i);
			System.out.println(this.ID.equals(result1.get(i).get("ID")));
			System.out.println(password.equals(result1.get(i).get("password")));
			if (this.ID.equals(result1.get(i).get("ID")) && password.equals(result1.get(i).get("password"))) {
				System.out.println("Success");
				return "SUCCESS";
			}
		}
		
		
		//session.setAttribute("result", result2);

		return "FALSE";
	}
	
	public String tomonitermain() {
		return "SUCCESS";
	}
	
	public String tocancel() {
		System.out.println(ID);
		String sql = "delete from moniter where ID=" + "'" + this.ID + "'";
		System.out.println(this.ID);
		connect newc = new connect();
		int result = newc.delete(sql);
		System.out.println(result);
		if (result == 0) {
			return "FALSE";
		} else {
			return "SUCCESS";
		}
	}
	
	public String tousers() {
		return "SUCCESS";
	}
	
	public String towrite() {
		ServletRequest Srequest = ServletActionContext.getRequest();
		HttpServletRequest Sreq = (HttpServletRequest) Srequest;
		HttpSession session = Sreq.getSession();
		String password = Srequest.getParameter("password");
		int i;
		//System.out.println(ID + " " + password);
		String sql1 = "select * from nousers";
		connect newc = new connect();
		ArrayList<Map<String, String>> result1 = newc.select(sql1, "nousers");
		if (result1.size() == 0) {
			return "FALSE";
		}
		System.out.println("pp" + result1.size());
		for (i = 0 ; i < result1.size(); i ++) {
			System.out.println(i);
			System.out.println(this.ID.equals(result1.get(i).get("ID")));
			System.out.println(password.equals(result1.get(i).get("password")));
			if (this.ID.equals(result1.get(i).get("ID")) && password.equals(result1.get(i).get("password"))) {
				System.out.println("Success");
				return "SUCCESS";
			}
		}
		
		
		//session.setAttribute("result", result2);

		return "FALSE";
	}
	
	public String tocreate() {
		ServletRequest Srequest = ServletActionContext.getRequest();
		HttpServletRequest Sreq = (HttpServletRequest) Srequest;
		HttpSession session = Sreq.getSession();
		String father = Srequest.getParameter("father");
		String son = Srequest.getParameter("son");
		String time = Srequest.getParameter("time");
		int year , month , day;
		year = Integer.parseInt(time.substring(0,4));
		month = Integer.parseInt(time.substring(5,7));
		day = Integer.parseInt(time.substring(8,10));
		String sql1 = "insert into users values(;
		connect newc = new connect();
		ArrayList<Map<String, String>> result1 = newc.select(sql1, "nousers");
		if (result1.size() == 0) {
			return "FALSE";
		}
		
		return "SUCCESS";
	}
	
	public String tochange() {
		return "SUCCESS";
	}

	public String tosearch(){
		return "SUCCESS";
	}
	public String toadd() {
		return "SUCCESS";
	}
	
	public String todelete() {
		return "SUCCESS";
	}
	
	public String toupdate() {
		return "SUCCESS";
	}
	
	public String tome() {
		return "SUCCESS";
	}
	
	public String toother() {
		return "SUCCESS";
	}
	
	public String toname() {
		return "SUCCESS";
	}
	
	public String totime() {
		return "SUCCESS";
	}
	
	public String torelation() {
		return "SUCCESS";
	}
	
	public String tomerge() {
		return "SUCCESS";
	}
	
	public String toresult() {
		return "SUCCESS";
	}
	
	public String tohome() {
		return "SUCCESS";
	}
}
