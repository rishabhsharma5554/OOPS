package Java8.LambdaExpressions.WithCollections;

import java.util.TreeSet;

public class ComparatorWithSet {
	public static void main(String[] args) {
		TreeSet<Integer> tSet = new TreeSet<>((i1,i2) -> i2-i1);
		tSet.add(10);
		tSet.add(0);
		tSet.add(95);
		tSet.add(55);
		tSet.add(36);
		tSet.add(12);
		tSet.add(2);
		System.out.println(tSet);
	}
}
