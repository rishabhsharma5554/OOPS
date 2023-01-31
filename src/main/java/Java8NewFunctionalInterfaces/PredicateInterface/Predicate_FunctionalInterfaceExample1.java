package Java8NewFunctionalInterfaces.PredicateInterface;

import java.util.function.Predicate;

public class Predicate_FunctionalInterfaceExample1 {

	public static void main(String[] args) {
		int arr[] = {0,2,3,4,10,12,16,20,35,60,65,87,99};
		Predicate<Integer> p1 = i -> i>10;
		Predicate<Integer> p2 = n-> n%2==0;
		System.out.println("Number which is greater than 10.");
		m1(p1, arr);
		System.out.println("Number which are even.");
		m1(p2,arr);
		System.out.println("Number which are not greater than 10.");
		m1(p1.negate(),arr);
		System.out.println("Number which are greater than 10 and even");
		m1(p1.and(p2),arr);
		System.out.println("Number which are greater than 10 or even");
		m1(p1.or(p2), arr);
	}
	
	public static void m1(Predicate<Integer> p, int arr[])
	{
		for(int x : arr)
			if(p.test(x))
				System.out.println(x);
	}
}
