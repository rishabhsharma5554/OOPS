package Java8.FunctionInterface.Function.FunctionChaining;

import java.util.function.Function;

public class FuncitionChaining {
	public static void main(String[] args) {
		Function<String, String> f1 = s -> s.toUpperCase();
		Function<String,String> f2 = s -> s.substring(0,9);
		String s = "aishwariyaabhi";
		System.out.println(f1.apply(s));
		System.out.println(f2.apply(s));
		System.out.println(f1.andThen(f2).apply(s));
		System.out.println(f1.compose(f2).apply(s));
	}
}
