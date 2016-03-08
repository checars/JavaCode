package com.neu.checars;

class Singleton
{
	//instance������������������ʵ������������Ҫ��get�������ʣ�������Ҫstatic���η�
	private static Singleton instance;
	//ʹ��private���Σ�Ϊ�����ظù������������Ա���������ʣ��Ӷ������������
	private Singleton(){}
	//�����ⲿ�Ľӿڣ����ø÷�������ʵ�����������public���Σ������ø÷���ʱ��û�ж���ֻ��ͨ������ã����÷�������Ϊ�෽���������static����
	public static Singleton getInstance(){
		if(instance == null){instance = new Singleton();}
		return instance;
	}
}

public class SingletonTest
{
	public static void main(String args[]){
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 ==s2);
	}
}