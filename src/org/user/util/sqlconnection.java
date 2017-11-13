package org.user.util;

import java.sql.*;

public class sqlconnection {

	
    private static String driver="com.mysql.jdbc.Driver";
    private static String url="jdbc:mysql://localhost:3306/regist";
    private static String user="root";
    private static String passwd="1511NvWa";
    public static Connection getConnection() {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, user, passwd);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void closeConn(Connection conn,Statement stm , ResultSet rs ) {

        if(stm!=null){
            try {
                stm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(rs!=null){
            try{
                rs.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {

        System.out.println(getConnection());
    }
}
