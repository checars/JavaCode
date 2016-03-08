package com.neu.checars;

public class SubCalss 
{
	public static void main(String[] args) 
	{
		SSBaseClass p = new SSSubClass();
		p.base();
		p.test();
	}
}

class SSBaseClass
{
	public int book = 6;
	public void base(){
		System.out.println("父类的普通方法");
	}
	
	public void test(){
		System.out.println("父类的被覆盖的方法");
	}
}

class SSSubClass extends SSBaseClass
{
	public String book = "轻量级JAVA";
	public void sub(){
		System.out.println("子类的普通方法");
	}

	public void test(){
		System.out.println("子类覆盖父类的方法");
	}
}

