package com.neu.checars;

public class OverSuper extends Super
{
	public void fly(){
		System.out.println("I am Running!!!");
	}

	public void useSuper(){
		super.fly();	//使用super关键字调用父类中被覆盖的实例方法fly
	}

	public static void main(String args[]){
		OverSuper o = new OverSuper();
		o.fly();
		o.useSuper();	//子类对象不能访问父类被覆盖的方法，要通过子类的实例方法用super关键字调用
	}
}

