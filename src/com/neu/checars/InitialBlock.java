package com.neu.checars;

class Root
{
	static{System.out.println("Root�ľ�̬��ʼ����");}
	{System.out.println("Root����ͨ��ʼ����");}

	public Root()
	{
		System.out.println("Root���޲ι�����");
	}
}

class Mid extends Root
{
	static{System.out.println("Mid�ľ�̬��ʼ����");}
	{System.out.println("Mid����ͨ��ʼ����");}

	public Mid()
	{
		System.out.println("Mid���޲ι�����");
	}
	public Mid(String msg)
	{
		this();
		System.out.println("Mid���вι�������msg��ֵΪ��" + msg);
	}
}

class Leaf extends Mid
{
	static{System.out.println("Leaf�ľ�̬��ʼ����");}
	{System.out.println("Leaf����ͨ��ʼ����");}

	public Leaf()
	{
		super("English");
		System.out.println("ִ��Leaf�Ĺ�����");
	}
}

public class InitialBlock
{
	public static void main(String args[]){
		new Leaf();
		new Leaf();
	}
}