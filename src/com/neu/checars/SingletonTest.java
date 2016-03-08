package com.neu.checars;

class Singleton
{
	//instance用来缓存曾经创建的实例对象。由于需要被get方法访问，所以需要static修饰符
	private static Singleton instance;
	//使用private修饰，为了隐藏该构造器，不致以被其他类访问，从而创建多个对象
	private Singleton(){}
	//（与外部的接口）调用该方法创建实例对象，因此用public修饰，但调用该方法时还没有对象，只能通过类调用，将该方法声明为类方法，因此用static修饰
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