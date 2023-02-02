package Java8.FunctionInterface.SupplierInterface;

import java.util.function.Supplier;

public class GenerateRandom8CharPassword {

	public static void main(String[] args) {

		Supplier<String> sup = () -> {
			Supplier<Integer> d = () -> (int)(Math.random()*10);
			String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$abcdefgijklmnopqrstuvwxyz";
			Supplier<Character> c  = () -> symbols.charAt(((int)(Math.random()*54)));
			String pwd="";
			for(int i=1;i<=8;i++)
			{
				if(i%2==0)
					pwd+= d.get();
				else
					pwd+= c.get();
			}
			return pwd;
		};
//		String pwd = "";
//		//generate random no 1-9
//		Supplier<Integer> d = () -> (int)(Math.random()*10);
//		String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
////		Supplier<Character> c  = () ->{
////			int x = ((int)Math.random()*29);
////			return symbols.charAt(x);
////		};
//		
//		Supplier<Character> c  = () -> symbols.charAt(((int)Math.random()*29));
//		
//		for(int i=1;i<=8;i++)
//		{
//			if(i%2==0)
//				pwd+= d.get();
//			else
//				pwd+= c.get();
//		}
		
		System.out.println(sup.get());
		System.out.println(sup.get());
		System.out.println(sup.get());
		System.out.println(sup.get());
		
		System.out.println(sup.get());
		System.out.println(sup.get());
		System.out.println(sup.get());
		System.out.println(sup.get());
	}

}
