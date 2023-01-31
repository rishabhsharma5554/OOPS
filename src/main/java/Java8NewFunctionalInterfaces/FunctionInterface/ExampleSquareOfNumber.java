package Java8NewFunctionalInterfaces.FunctionInterface;

import java.util.function.Function;

public class ExampleSquareOfNumber {

	public static void main(String[] args) 
	{
		Function<Integer,Integer> f  = n -> n*n;
		System.out.println(f.apply(25));
	}

}
