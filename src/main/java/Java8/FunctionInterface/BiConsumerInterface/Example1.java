package Java8.FunctionInterface.BiConsumerInterface;

import java.util.function.BiConsumer;

public class Example1 {

	public static void main(String[] args) {
		BiConsumer<String, String> c =  (t,u) -> System.out.println(t+u);
		c.accept("Rishabh ", "Sharma");
	}

}
