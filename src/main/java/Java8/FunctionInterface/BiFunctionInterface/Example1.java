package Java8.FunctionInterface.BiFunctionInterface;

import java.util.function.BiFunction;

public class Example1 {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> f = (a,b) -> a*b;
		System.out.println(f.apply(10, 20));
		System.out.println(f.apply(25,30));
	}

}
