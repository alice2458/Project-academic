package com.structs.trio;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.GeneralPath;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import database.DB_connect;

class relate {
	String name,startt,endt,project;
}
public class MyPainter extends JFrame{
	List<relate> stulist=new ArrayList<relate>();
	List<relate> tealist=new ArrayList<relate>();
	private JPanel contentPane;
	public MyPainter()
	{
		super("��Բ");
		setBounds(100,100,700,700);
		setVisible(true);
	}
	public void togetlist(String str)
	{
		Connection connect = DB_connect.connect();
		Statement stmt;
		String sql = "select * from " + str;
		try {
			stmt = (Statement)connect.createStatement();
			ResultSet res = stmt.executeQuery(sql);
			while(res.next()) {    
			    relate a=new relate();
			    a.name=res.getString("teacher");
			    a.startt=res.getString("teacherStartTime");
			    a.endt=res.getString("teacherOverTime");
			    a.project=res.getString("project");
			    tealist.add(a);
			   
			}
			res.close(); 
		    stmt.close();  
		    connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void stugetlist(String str)
	{
		Connection connect = DB_connect.connect();
		Statement stmt;
		String sql = "select * from " + str;
		try {
			stmt = (Statement)connect.createStatement();
			ResultSet res = stmt.executeQuery(sql);
			while(res.next()) {    
			    relate a=new relate();
			    a.name=res.getString("student");
			    a.startt=res.getString("studentStartTime");
			    a.endt=res.getString("studentOverTime");
			    a.project=res.getString("project");
			    stulist.add(a);
			   
			}
			 res.close(); 
		    stmt.close();  
		    connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void paint(Graphics g)
	{
		togetlist(Login_in.name + "����ʦ");
		stugetlist(Login_in.name + "��ѧ��");
		int i,j;
		int tnum=tealist.size();
		for(i=0;i<tealist.size();i++)
		{
			System.out.print(i);
			relate b=tealist.get(i);
			System.out.println(b.name);
			g.setColor(Color.BLACK);
			g.drawOval(60+150*(i%3),60+(i/3)*150,50,50);
			g.drawString(b.name, 60+150*(i%3)+10,60+(i/3)*150+25);
			drawAL(60+150*((tnum-1)%3)+20,60+((tnum-1)/3+1)*150+25,60+150*(i%3)+10,60+(i/3)*150+25,g);
			g.drawString(b.endt,(60+150*((tnum-1)%3)+20+60+150*((tnum-1)%3)+20+60+150*(i%3)+10)/3,(60+((tnum-1)/3+1)*150+25+60+((tnum-1)/3+1)*150+25+60+(i/3)*150+25)/3);
			g.drawString(b.startt,(60+150*((tnum-1)%3)+20+60+150*(i%3)+10)/2,(60+((tnum-1)/3+1)*150+25+60+(i/3)*150+25)/2);
			g.drawString(b.project,(60+150*((tnum-1)%3)+20+60+150*(i%3)+10+60+150*(i%3)+10)/3,(60+((tnum-1)/3+1)*150+25+60+(i/3)*150+25+60+(i/3)*150+25)/3);
		}
		for(j=0;j<stulist.size();j++)
		{
			System.out.print(j);
			relate b=stulist.get(j);
			System.out.println(b.name);
			g.setColor(Color.BLACK);
			g.drawOval(60+150*((i/3*3+j)%3),60+((j+i/3*3)/3+2)*150,50,50);
			g.drawString(b.name, 60+150*((j+i/3*3)%3)+10,60+((j+i/3*3)/3+2)*150+25);
			drawAL(60+150*((j+i/3*3)%3)+10,60+((j+i/3*3)/3+2)*150+25,60+150*((tnum-1)%3)+20,60+((tnum-1)/3+1)*150+25,g);
			g.drawString(b.project,(60+150*((tnum-1)%3)+20+60+150*((tnum-1)%3)+20+60+150*((j+i/3*3)%3)+10)/3,(60+((tnum-1)/3+1)*150+25+60+((tnum-1)/3+1)*150+25+60+((j+i/3*3)/3+2)*150+25)/3);
			g.drawString(b.startt,(60+150*((tnum-1)%3)+20+60+150*((j+i/3*3)%3)+10)/2,(60+((tnum-1)/3+1)*150+25+60+((j+i/3*3)/3+2)*150+25)/2);
			g.drawString(b.endt,(60+150*((tnum-1)%3)+20+60+150*((j+i/3*3)%3)+10+60+150*((j+i/3*3)%3)+10)/3,(60+((tnum-1)/3+1)*150+25+60+((j+i/3*3)/3+2)*150+25+60+((j+i/3*3)/3+2)*150+25)/3);
		}
		g.drawOval(60+150*((i-1)%3)+10,60+((i-1)/3+1)*150,50,50);
		g.drawString(Login_in.name, 60+150*((i-1)%3)+20,60+((i-1)/3+1)*150+25);
		
	}
	
	public static void drawAL(int sx, int sy, int ex, int ey, Graphics g)  
    {  
  
        double H = 10; // ��ͷ�߶�  
        double L = 4; // �ױߵ�һ��  
        int x3 = 0;  
        int y3 = 0;  
        int x4 = 0;  
        int y4 = 0;  
        double awrad = Math.atan(L / H); // ��ͷ�Ƕ�  
        double arraow_len = Math.sqrt(L * L + H * H); // ��ͷ�ĳ���  
        double[] arrXY_1 = rotateVec(ex - sx, ey - sy, awrad, true, arraow_len);  
        double[] arrXY_2 = rotateVec(ex - sx, ey - sy, -awrad, true, arraow_len);  
        double x_3 = ex - arrXY_1[0]; // (x3,y3)�ǵ�һ�˵�  
        double y_3 = ey - arrXY_1[1];  
        double x_4 = ex - arrXY_2[0]; // (x4,y4)�ǵڶ��˵�  
        double y_4 = ey - arrXY_2[1];  
  
        Double X3 = new Double(x_3);  
        x3 = X3.intValue();  
        Double Y3 = new Double(y_3);  
        y3 = Y3.intValue();  
        Double X4 = new Double(x_4);  
        x4 = X4.intValue();  
        Double Y4 = new Double(y_4);  
        y4 = Y4.intValue();  
        // ����  
        g.drawLine(sx, sy, ex, ey);  
        g.drawLine(ex, ey, x3, y3);  
        g.drawLine(ex, ey, x4, y4);
    }  
	 public  static double [] rotateVec( int  px,  int  py,  double  ang,  boolean  isChLen,
	            double  newLen)   {

	        double  mathstr[]  =   new   double [ 2 ];
	        // ʸ����ת��������������ֱ���x������y��������ת�ǡ��Ƿ�ı䳤�ȡ��³���   
	         double  vx  =  px  *  Math.cos(ang)  -  py  *  Math.sin(ang);
	        double  vy  =  px  *  Math.sin(ang)  +  py  *  Math.cos(ang);
	        if  (isChLen)   {
	            double  d  =  Math.sqrt(vx  *  vx  +  vy  *  vy);
	           vx  =  vx  /  d  *  newLen;
	           vy  =  vy  /  d  *  newLen;
	           mathstr[ 0 ]  =  vx;
	           mathstr[ 1 ]  =  vy;
	       }
	        return  mathstr;
	   } 
} 