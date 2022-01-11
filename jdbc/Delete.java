package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {
	public static void main(String[] args) throws Exception {
		// 刪除資料
		String sql = "delete from Department where id=?";
		Class.forName("org.sqlite.JDBC");
		
		try(Connection conn = DriverManager.getConnection("jdbc:sqlite:db/mydb.db");
			PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setInt(1, 2); 
			int rowcount = pstmt.executeUpdate(); // 執行更新並得到異動筆數
			System.out.println("刪除影響的異動筆數: " + rowcount);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
