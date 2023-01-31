package Java8NewFunctionalInterfaces.PredicateInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_FunctionalInterfaceExample2 {
	
	
	//Program to display names starting with 'K' by using Predicate
	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Rishabh","Mohit","Madhuri","Satyanarayan","Lakshman","Kajal","Katrina","Kareenaa","Kabir Singh");
		Predicate<String> p = name -> name.startsWith("K");
		for(String s: names)
			if(p.test(s))
				System.out.println(s);
	}
}
