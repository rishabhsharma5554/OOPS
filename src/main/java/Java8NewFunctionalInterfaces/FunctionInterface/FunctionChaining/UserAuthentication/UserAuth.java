package Java8NewFunctionalInterfaces.FunctionInterface.FunctionChaining.UserAuthentication;

import java.util.Scanner;
import java.util.function.Function;

public class UserAuth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String user = sc.next();
		System.out.println("Enter Password");
		String pwd = sc.next();
		
		//Consider first 5 characters
		Function<String, String> f1 = s -> s.substring(0,5);
		
		//Convert to lowercase
		Function<String,String> f2 = s-> s.toLowerCase();
		
		if(f1.andThen(f2).apply(user).equals("risha") && pwd.equals("java"))
			System.out.println("Valid User.");
		else
			System.out.println("Invalid User!!!");
		
		
		/*
		 * user - rishabh
		 * pwd - java
		 * valid
		 * 
		 * user - RishabhTechnnologes
		 * pwd - java
		 * valid
		 * 
		 * user - Mohit
		 * pwd - java
		 * 
		 * */
		sc.close();
	}

}
