package InterfaceNewFeatures;

interface Left
{
	default void m1()
	{
		System.out.println("Left Iterface default Method");
	}
}

interface Right
{
	default void m1()
	{
		System.out.println("Right Interface default Method");
	}
}


public class DefaultMethod implements Left,Right{
	
	
	public static void main(String[] args)
	{
	  //Compiler Time error
	}
}
