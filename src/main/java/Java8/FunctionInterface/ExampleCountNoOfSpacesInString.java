package Java8.FunctionInterface;
import java.util.function.*;
public class ExampleCountNoOfSpacesInString {
	public static void main(String[] args) {
		Function<String,Integer> f = s -> s.length() - s.replaceAll(" ","").length();
		String s = "I love my India.";
		System.out.println(f.apply(s));
	}
}
