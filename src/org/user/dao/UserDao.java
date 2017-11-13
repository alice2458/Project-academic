package org.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.user.entity.User;
import org.user.util.sqlconnection;

public class UserDao {

	//根据用户名查找用户
    public User findUserByName(String userName){
        //编写sql语句
        String sql="select * from personal where name=?";
        //获得连接
        Connection conn= sqlconnection.getConnection();
        //有返回的结果
        ResultSet rs= null;
        //实例化一个User对象
        User user = new User();
        try {
            //用来发送sql语句的
            PreparedStatement ps = conn.prepareStatement(sql);
            //设置要传入的参数，这里是userN
            ps.setString(1, userName);
            //执行sql语句
            rs=ps.executeQuery();
            //如果能找到结果
            if(rs.next()){
                //则把找到的结果一一set进User对象中
                user.setName(rs.getString(1));
                user.setSex(rs.getString(2));
                user.setAge(rs.getInt(3));
                user.setPhone(rs.getString(4));
                user.setEmail(rs.getString(5));
                user.setGraduated_school(rs.getString(6));
                user.setCompany(rs.getString(7));
                user.setCSDN_add(rs.getString(8));
                user.setPassword(rs.getString(9));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {//关闭连接
            sqlconnection.closeConn(conn, null, rs);
        }
        //最后要把这个user返回出去
        return user;
        
    }
    
    //添加用户
    //在这里把整个用户对象传进来
    public int addUser(User user){
        //编写sql语句
        String sql = "insert into personal values(?,?,?)";
        Connection conn= sqlconnection.getConnection();
        //有返回的结果
        ResultSet rs= null;
        int i=0;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            //这些参数是要保存到数据的
            ps.setString(1, user.getName());
            ps.setString(2, user.getSex());
            ps.setInt(3, user.getAge());
            ps.setString(4, user.getPhone());
            ps.setString(5, user.getEmail());
            ps.setString(6, user.getGraduated_school());
            ps.setString(7, user.getCompany());
            ps.setString(8, user.getCSDN_add());
            ps.setString(9, user.getPassword());
            //执行sql语句
            i=ps.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
        	sqlconnection.closeConn(conn, null, rs);
        }
    return i;
    }
    public static void main(String[] args) {
        UserDao dao = new UserDao();
        User i = dao.findUserByName("zhang");
        System.out.println(i.getPassword());
        
    }
	
}
