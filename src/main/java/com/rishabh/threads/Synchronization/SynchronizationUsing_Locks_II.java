package com.rishabh.threads.Synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizationUsing_Locks_II {
	
	private int count = 0;
    private Lock lock = new ReentrantLock();
    
	public synchronized void changeCountUsing_keyword()
	{

		lock.lock();	
		try 
		{
			count++;
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		finally 
		{
			lock.unlock();
		}
	}
	
	
	public static void main(String[] args) {

	}
}
