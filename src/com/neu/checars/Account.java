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
			System.out.println(Thread.currentThread().getName() + "ȡǮ�ɹ����³���Ʊ��" + drawAmont);
			try 
			{
				Thread.sleep(1);
			}catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			balance -= drawAmont;
			System.out.println("���Ϊ��" + balance);
			}
		else
			{
			System.out.println(Thread.currentThread().getName() + "ȡǮʧ�ܣ�����");
			}
		
	}
	//������дhashCode��equals�ķ���
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