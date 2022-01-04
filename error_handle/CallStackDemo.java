package error_handle;

public class CallStackDemo {

	public static void main(String[] args) {
		System.out.println("執行 main()");
		a();
	}
	
	public static void a() {
		System.out.println("執行 a()");
		b();
	}
	
	public static void b() {
		System.out.println("執行 b()");
		c();
	}

	public static void c() {
		System.out.println("執行 c()");
		System.out.println(10/0); // 產生一個錯誤
		
	}

}
