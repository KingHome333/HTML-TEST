package cheshi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Main {

	public static void main(String[] args){
		String user = "root";
		String password = "root";
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test?characterEncoding=utf-8";
		
		
		try {
			//加载驱动
			Class.forName(driver);
			//获取数据库链接
			Connection con = DriverManager.getConnection(url, user, password);
			//获取数据库语句执行对象
			Statement state = con.createStatement();
			//准备sql语句
			String sql = "update student set sex='女' ,username='小红' where id = 1 ;";
			//执行sql语句
			int result = state.executeUpdate(sql);
			System.out.println("返回值："+result);
			//释放资源
			state.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}