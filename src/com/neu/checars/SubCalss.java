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
		System.out.println("�������ͨ����");
	}
	
	public void test(){
		System.out.println("����ı����ǵķ���");
	}
}

class SSSubClass extends SSBaseClass
{
	public String book = "������JAVA";
	public void sub(){
		System.out.println("�������ͨ����");
	}

	public void test(){
		System.out.println("���า�Ǹ���ķ���");
	}
}

