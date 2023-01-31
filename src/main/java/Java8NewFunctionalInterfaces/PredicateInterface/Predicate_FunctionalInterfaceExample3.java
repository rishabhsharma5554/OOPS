package Java8NewFunctionalInterfaces.PredicateInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_FunctionalInterfaceExample3 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Rishabh","",null,"Karan","Kamal","","","Varun");
		Predicate<String> p = s -> s!=null && s.length()!=0;
		
		System.out.println(names);
		List<String> filteredNames = new ArrayList<>();
		for(String name: names)
			if(p.test(name))
				filteredNames.add(name);
		System.out.println(filteredNames);
		
		
	}
	
	
}
