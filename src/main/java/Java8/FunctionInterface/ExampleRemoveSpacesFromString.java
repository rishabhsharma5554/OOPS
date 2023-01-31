package Java8.FunctionInterface;

import java.util.function.Function;

public class ExampleRemoveSpacesFromString {

	public static void main(String[] args) {
		Function<String,String> f = s -> s.replaceAll(" ", "");
		String s = "I love my India.";
		System.out.println(f.apply(s));
	}
}
