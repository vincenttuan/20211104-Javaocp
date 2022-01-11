package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadOne {

	public static void main(String[] args) throws Exception {
		// 建立資料表-Department
		String sql = "select id, name from Department where id=?";
		System.out.println(sql);
		// 註冊 sqlite 驅動程式
		Class.forName("org.sqlite.JDBC");
		
		try(Connection conn = DriverManager.getConnection("jdbc:sqlite:db/mydb.db");
			PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setInt(1, 1);
			ResultSet rs = pstmt.executeQuery();
			
			System.out.println("+--------+------------+");
			System.out.println("|   id   |    name    |");
			System.out.println("+--------+------------+");
			// 若只查詢一筆, 可將 while 變為 if
			if (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				System.out.printf("| %6d | %-10s |\n", id, name);
				System.out.println("+--------+------------+");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
