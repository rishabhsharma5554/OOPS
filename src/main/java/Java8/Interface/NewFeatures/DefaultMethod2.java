package Java8.Interface.NewFeatures;

interface LeftNew
{
	default void m1()
	{
		System.out.println("Left Iterface default Method");
	}
}

interface RightNew
{
	default void m1()
	{
		System.out.println("Right Interface default Method");
	}
}


public class DefaultMethod2 implements LeftNew,RightNew{
	
	@Override
	public void m1() {
		System.out.println("MyImplementation");
		LeftNew.super.m1();
	}
	
	public static void main(String[] args)
	{
		DefaultMethod2 obj = new DefaultMethod2();
		obj.m1();
	}
}
