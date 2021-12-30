package functions;

import java.util.function.Consumer;

/*
	@FunctionalInterface
	public interface Consumer<T> {
    	void accept(T t);
	}
*/
public class ConsumerTest {

	public static void main(String[] args) {
		//1.
		Consumer<String> hello = (x) -> System.out.println("Hello " + x); 
		hello.accept("John");
		//2.
		sayHello("Mary", hello);
	}
	
	public static void sayHello(String name, Consumer<String> hello) {
		hello.accept(name);
	}
	

}
