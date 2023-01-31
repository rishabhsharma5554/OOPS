package Threads;
/*
1. Extending the Thread class: 
		To create a thread by extending the Thread class, 
		you need to create a new class that extends the 
		Thread class and override the run() method. The run() 
		method contains the code that will be executed when 
		the thread is started.
		
		To start the thread, you need to create an instance 
		of the MyThread class and call the start() method.
		
2. Implementing the Runnable interface: 
		To create a thread by implementing the Runnable interface, 
		you need to create a new class that implements the Runnable 
		interface and override the run() method. The run() method 
		contains the code that will be executed when the thread is started.
		
		To start the thread, you need to create an instance 
		of the MyRunnable class, create a Thread object and pass the 
		MyRunnable object as a parameter to the Thread constructor, 
		and call the start() method.
		
Note: 	It's worth noting that, even if the two approaches have 
		different syntax, the main goal is to execute the run() method 
		concurrently, so the choice of one or the other will depend on your use case.
*/
public class MyFirstThread_Using_RunnableInterface implements Runnable
{
	static int x=0;
	
	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println(x++);
	}

	public static void main(String[] args) 
	{
		MyFirstThread_Using_RunnableInterface runnable = new MyFirstThread_Using_RunnableInterface();
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
