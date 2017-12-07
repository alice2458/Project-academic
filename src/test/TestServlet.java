package test;

import java.io.IOException;
import java.util.*;

import database.*;
import test.Teacher;
import test.Student;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import database.MySQLConnecter;

public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        List<Teacher> list = new ArrayList<Teacher>();
        
        //这里把“类别名称”和“销量”作为两个属性封装在一个Product类里，每个Product类的对象都可以看作是一个类别（X轴坐标值）与销量（Y轴坐标值）的集合
        String sql1 = "select * from information where Name=\"" + getName() + "\"";
        MySQLConnecter mc = new MySQLConnecter();
		ArrayList<Map<String, String>> result1 = mc.select(sql1, "information");
        list.add(new Teacher(result1.get(0), result1.get(1),result1.get(2),result1.get(3));
        list.add(new Product("短袖", 20));
        list.add(new Product("大衣", 30));
        
        ObjectMapper mapper = new ObjectMapper();    //提供java-json相互转换功能的类
        
        String json = mapper.writeValueAsString(list);    //将list中的对象转换为Json格式的数组
        
//System.out.println(json);
        
        //将json数据返回给客户端
        response.setContentType("text/html; charset=utf-8");
        response.getWriter().write(json);    
    }
}