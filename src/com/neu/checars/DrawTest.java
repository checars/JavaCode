package com.neu.checars;

public class DrawTest
{
	public static void main(String args[])
	{
		Account act = new Account("88888888", 1000);
		new DrawThread("��", act, 800).start();
		new DrawThread("��", act, 800).start();
	}
}
