package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
	public static void main(String[] args) throws Exception {
		// 修改資料
		String sql = "update Department set name=? where id=?";
		Class.forName("org.sqlite.JDBC");
		
		try(Connection conn = DriverManager.getConnection("jdbc:sqlite:db/mydb.db");
			PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setString(1, "Account");
			pstmt.setInt(2, 1); 
			int rowcount = pstmt.executeUpdate(); // 執行更新並得到異動筆數
			System.out.println("修改影響的異動筆數: " + rowcount);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
