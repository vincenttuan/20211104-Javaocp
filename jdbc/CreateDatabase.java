package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateDatabase {
	public static void main(String[] args) throws Exception {
		// 建立資料庫: 
		// 1. 註冊 sqlite 驅動程式
		Class.forName("org.sqlite.JDBC");
		// 2. 建立連線物件 (開啟與資料庫的連線)
		Connection conn = DriverManager.getConnection("jdbc:sqlite:db/mydb.db");
		// 3. 查看是否連線已經關閉 ?
		System.out.println("連線是否已關閉:" + conn.isClosed());
		
		// 關閉連線
		conn.close();
		System.out.println("連線是否已關閉:" + conn.isClosed());
		
	}
}
