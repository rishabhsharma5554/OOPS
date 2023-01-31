package Java8.LambdaExpressions.WithCollections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExampleWithLambda {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(25);
		al.add(7);
		al.add(98);
		al.add(36);
		al.add(0);
		al.add(12);
		System.out.println("Before Sorting "+al);
		Collections.sort(al);
		System.out.println("Default Natural Sorting "+al);
		
//		Collections.sort(al,(i1,i2)-> (i1>i2)?-1 : (i1<i2)?1 :0);
		Collections.sort(al,(a,b) -> b-a);
		
		System.out.println("Customized Natural Sorting "+al);
	}
}
