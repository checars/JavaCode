package com.neu.checars;

public class JoinThread extends Thread
{
	
	public void run()
	{
		for (int i = 0; i < 50 ; i ++)
		{
			System.out.println(getName() + " " + i);
		}
	}

	public static void main(String args[]) throws InterruptedException	//需要对join进行异常捕获或者抛出异常
	{
		JoinThread j = new JoinThread();
		j.setName("new Thread");
		j.start();

		for (int i = 0; i < 100 ; i ++ )
		{
			System.out.println(Thread.currentThread().getName() + " " + i);
			if (i == 20)
			{
				JoinThread join = new JoinThread();
				join.setName("join Thread");
				join.start();
				join.join();	//main线程调用了join线程的join方法，main线程必须等待join线程执行结束后才会向下执行
			}
		}
	}
}