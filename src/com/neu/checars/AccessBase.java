package com.neu.checars;

class Base
{
	public String name;
	public double score;
	public Base(String name, double score){
		System.out.println("父类中的有参构造器");
		this.name = name;
		this.score = score;
	}
	public Base(){	//此处的无参构造器不能省略，否则会报错
		System.out.println("父类中的无参构造函数");
	}
}

class Sub extends Base
{
	public String coures;
	public int age;

	public Sub(String name, double score, int age){
		super(name, score);	//通过super来调用父类的构造器
		System.out.println("③");
		this.age = age;
	}

	public Sub(String coures){
		//这里会追溯到父类的无参构造器
		System.out.println("①");
		this.coures = coures;
	}

	public Sub(String coures, int age){
		this(coures);	//通过this调用同一个类中的另一个重载构造器
		System.out.println("②");
		this.age = age;
	}

}

public class AccessBase
{
	public static void main(String args[]){
		Sub s1 = new Sub("QS_Che",100,23);
		Sub s2 = new Sub("Java",28);
		System.out.println(s1.name + "  " + s1.score + "  " + s1.age);
		System.out.println(s2.coures + "  " + s2.age);
	}
}