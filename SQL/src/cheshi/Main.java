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
			//��������
			Class.forName(driver);
			//��ȡ���ݿ�����
			Connection con = DriverManager.getConnection(url, user, password);
			//��ȡ���ݿ����ִ�ж���
			Statement state = con.createStatement();
			//׼��sql���
			String sql = "update student set sex='Ů' ,username='С��' where id = 1 ;";
			//ִ��sql���
			int result = state.executeUpdate(sql);
			System.out.println("����ֵ��"+result);
			//�ͷ���Դ
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