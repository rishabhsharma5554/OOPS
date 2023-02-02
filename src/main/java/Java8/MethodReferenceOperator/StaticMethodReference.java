package Java8.MethodReferenceOperator;

@FunctionalInterface
interface Interf
{
	public void m1();
}


@FunctionalInterface
interface Interf2
{
	public abstract void m2();
}

public class StaticMethodReference {

	public static void m2()
	{
		System.out.println("I love my India.");
		System.out.println("I love Indore");
		System.out.println("I love Dewas");
	}
	
	public static String m3()
	{
		System.out.println("Hello");
		return "Hello";
	}
	
	public static void main(String[] args) 
	{
		Interf i = StaticMethodReference::m2;
		i.m1();
		
		Interf2 i2 = StaticMethodReference::m3;
		StaticMethodReference.m3();
		i2.m2();
		
	}
}
