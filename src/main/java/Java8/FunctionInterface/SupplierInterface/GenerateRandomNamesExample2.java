package Java8.FunctionInterface.SupplierInterface;

import java.util.function.Supplier;

public class GenerateRandomNamesExample2 {
	public static void main(String[] args) {
		Supplier<String> s = () -> {
			String []s1 = {"Sunny","Bunnny","Chinny","Vinny"};
			// 0<x<1
			int x = (int) (Math.random()*4);
			return s1[x];
		};
		
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		
	}
}
