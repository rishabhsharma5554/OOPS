package Java8.MethodReferenceOperator;

public class InstanceMethodReference {

	public void m1()
	{
		for(int i=0; i<10; i++)
			System.out.println("Child Thread");
	}
	public static void main(String[] args) {
		InstanceMethodReference obj = new InstanceMethodReference();
		Runnable r = obj::m1;
		Thread t = new Thread(r);
		t.start();
		
		
		for(int i=0;i<10;i++)
			System.out.println("Main Thread.");
	}

}
