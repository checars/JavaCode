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

	public static void main(String args[]) throws InterruptedException	//��Ҫ��join�����쳣��������׳��쳣
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
				join.join();	//main�̵߳�����join�̵߳�join������main�̱߳���ȴ�join�߳�ִ�н�����Ż�����ִ��
			}
		}
	}
}