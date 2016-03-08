package com.neu.checars;

class BaseClass
{
	public int book = 6;
	public String s = "父类字符串";
	public void base(){
		System.out.println("父类的普通方法");
	}
	public void test(){
		System.out.println("父类被覆盖的方法");
	}
}

class SubClass extends BaseClass
{
	public String book = "JAVA EE应用实践";
	public String s = "子类字符串";
	public void sub(){
		System.out.println("子类的普通方法");
	}
	public void test(){
		System.out.println("子类覆盖父类的方法");
	}
}

public class MultiState
{
	public static void main(String args[]){
		BaseClass bb = new BaseClass();
		bb.base();
		bb.test();

		SubClass ss = new SubClass();
		ss.sub();
		ss.test();
		//此处体现了对象的多态性
		BaseClass bs = new SubClass();
		bs.base();	//此时好比父类的对象调用base方法
		bs.test();	//此时好比子类的对象调用test方法
		//bs.sub();	//此条语句编译不能通过，因为bs的编译类型是BaseClass，而此处编译时调用的却是子类的方法

		System.out.println(bb.book);
		System.out.println(ss.book);
		System.out.println(bs.book);//实例变量不具备多态性，因此，此处输出的是父类的实例变量
		SubClass bbs = (SubClass)bs;
		System.out.println(bbs.s);	//强制类型转换后可调用子类实例变量
	}
}