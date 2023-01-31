package com.rishabh.threads.Synchronization;

public class SynchronizationUsing_SynchronizedKeyword_I {
	
	
	private int count = 0;
	
	public synchronized void changeCountUsing_keyword()
	{
		count++;
	}
	
	public void changeCountUsing_Block()
	{
		synchronized (this) {
			count++;
		}
	}
	
	public static void main(String[] args) {

	}
}
