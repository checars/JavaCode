package com.neu.checars;

public class Account
{
	private String accountNo ;
	private double balance;
	public Account(){}
	public Account(String accountNo, double balance)
	{
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public synchronized void draw(double drawAmont)
	{
		if (balance >= drawAmont)
			{
			System.out.println(Thread.currentThread().getName() + "取钱成功！吐出钞票：" + drawAmont);
			try 
			{
				Thread.sleep(1);
			}catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			balance -= drawAmont;
			System.out.println("余额为：" + balance);
			}
		else
			{
			System.out.println(Thread.currentThread().getName() + "取钱失败！余额不足");
			}
		
	}
	//定义重写hashCode和equals的方法
	public int hashCode()
	{
		return accountNo.hashCode();
	}
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj != null && obj.getClass() == Account.class)
		{
			Account target = (Account)obj;
			return target.getAccountNo().equals(accountNo);
		}
		return false;
	}

	public void setAccountNo(String accountNo)
	{
		this.accountNo = accountNo;
	}
	public String getAccountNo()
	{
		return this.accountNo;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public double getBalance()
	{
		return this.balance;
	}
}