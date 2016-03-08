package com.neu.checars;

public class DaemonThread extends Thread
{
	public void run()
	{
		for (int i = 0; i < 1000 ; i++ )
		{
			System.out.println(getName() + " " + i);
		}
	}

	public static void main(String args[])
	{
		DaemonThread d = new DaemonThread();
		d.setDaemon(true);
		d.start();
		for (int i = 0; i < 50 ; i ++ )
		{
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		//程序运行到此处，前台线程（main线程）结束，后台线程也随之结束，所以不会输出999
	}
}