package Java8.LambdaExpressions.WithInnerClass;

public class OuterClass {
	private int x = 10;
	class InnerClass
	{
		public void innerMethod()
		{
			System.out.println(x);
		}
	}
}

 class Main
{
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.innerMethod();
	}
}




