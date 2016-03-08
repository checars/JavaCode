package com.neu.checars;

class Common
{
	public Common(){
		System.out.println("Common的无参数构造器");
	}
}

class Animal extends Common
{
	public Animal(String name){
		System.out.println("Animal带一个参数的构造器，name为" + name);
	}
	
	public Animal(String name, int age){
		this(name);
		System.out.println("Animal带两个参数的构造器，其age为" + age);
	}
}

public class Wolf extends Animal
{
	public Wolf(){
		super("灰太狼", 3);
		System.out.println("Wolf里的无参构造函数");
	}
	public static void main(String args[]){
		new Wolf();
	}
}