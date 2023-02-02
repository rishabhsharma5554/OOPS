package Java8.FunctionInterface.SupplierInterface;

import java.util.function.Supplier;

public class GenerateOTPExample3 {

	public static void main(String[] args) {
		Supplier<String> s = () -> {
			
			String otp = "";
			for(int i=0;i<6;i++)
				otp += (int)(Math.random()*10); 
			
			return otp;
		};
		
		
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
