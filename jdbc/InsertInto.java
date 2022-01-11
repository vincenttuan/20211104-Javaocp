package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertInto {
	public static void main(String[] args) throws Exception {
		// 新增資料
		String sql = "insert into Department (name) values(?)";
		Class.forName("org.sqlite.JDBC");
		
		try(Connection conn = DriverManager.getConnection("jdbc:sqlite:db/mydb.db");
			PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			//pstmt.setString(1, "IT"); // 第一個問號放 "IT"
			pstmt.setString(1, "Sales"); // 第一個問號放 "Sales"
			int rowcount = pstmt.executeUpdate(); // 執行更新並得到異動筆數
			System.out.println("新增影響的異動筆數: " + rowcount);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
