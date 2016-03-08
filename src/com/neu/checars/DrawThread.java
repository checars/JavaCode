package com.neu.checars;

public class DrawThread extends Thread
{
	private Account account;
	private double drawAmont;
	public DrawThread(String name, Account account, double drawAmont)
	{
		super(name);
		this.account = account;
		this.drawAmont = drawAmont;
	}

	public void run()
	{
		account.draw(drawAmont);
	}
	
}