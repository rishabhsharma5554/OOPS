package LambdaExpressions.WithCollections;

import java.util.TreeMap;

public class ComparatorWithMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> tMap = new TreeMap<>((a,b)-> b-a);
		tMap.put(100, "Rishabh");
		tMap.put(55,"Mohit");
		tMap.put(150, "Madhuri");
		tMap.put(12, "Lucky");
		tMap.put(96,"Satya");
		tMap.put(155, "Nanaji");
		System.out.println(tMap);
//		for( Integer s : tMap.keySet())
//			System.out.println(tMap.get(s));
		
	}
}
