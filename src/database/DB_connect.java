package database;
import java.sql.*;
public class DB_connect {
	public static Connection connect() {
		Connection connect = null;//ָ��
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");//������������
			connect = DriverManager.getConnection(//�ڱ�������
					//"jdbc:mysql://vtimpihxxesr.mysql.sae.sina.com.cn:10499/student354", "student354","LIXIANGamy773316");
					"jdbc:mysql://localhost:3306/tree", "root","12345678");//��
		}
		catch (ClassNotFoundException e) {
			System.out.println("Error!");//δ���ӵ����ݿ�
		}
		catch (Exception e) {
			System.out.println("Error!");//δ���ӵ����ݿ�
		}
		return connect;
	}
}