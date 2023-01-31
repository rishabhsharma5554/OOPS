package com.rishabh.threads;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(getName() + ": " + i);

			// Causes the current thread to give up its current time slice, allowing other
			// threads to execute
			
			yield();
			try 
			{
				// Causes the current thread to suspend its execution for the specified number
				// of milliseconds
				sleep(500);
			} 
			catch (InterruptedException e) 
			{
				System.out.println(getName() + " has been interrupted.");
				break;
			}
		}
	}
}

public class ThreadExample {
	public static void main(String[] args) 
	{
		MyThread t1 = new MyThread();
		t1.setName("Thread 1");
		t1.start();

		MyThread t2 = new MyThread();
		t2.setName("Thread 2");
		t2.start();

		// Wait for t1 to complete its execution
		try 
		{
			t1.join();
		} 
		catch (InterruptedException e) 
		{
			System.out.println("Thread 1 was interrupted.");
		}

		// Interrupt t2
		t2.interrupt();

		// Check if t1 is alive
		if (t1.isAlive()) 
			System.out.println("Thread 1 is still alive.");
		else 
			System.out.println("Thread 1 has completed execution.");
		

		// Check if t2 is alive
		if (t2.isAlive()) 
			System.out.println("Thread 2 is still alive.");
		else 
			System.out.println("Thread 2 has completed execution.");
	}
}
