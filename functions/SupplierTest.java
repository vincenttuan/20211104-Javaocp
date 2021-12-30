package functions;

import java.time.LocalDateTime;
import java.util.function.Supplier;

/*
	@FunctionalInterface
	public interface Supplier<T> {
    	T get();
	}
*/
public class SupplierTest {

	public static void main(String[] args) {
		// 現在時刻
		Supplier<LocalDateTime> time = () -> LocalDateTime.now();
		LocalDateTime now = time.get();
		System.out.println(now);

	}

}
