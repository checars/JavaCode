package com.neu.checars;

class Common
{
	public Common(){
		System.out.println("Common���޲���������");
	}
}

class Animal extends Common
{
	public Animal(String name){
		System.out.println("Animal��һ�������Ĺ�������nameΪ" + name);
	}
	
	public Animal(String name, int age){
		this(name);
		System.out.println("Animal�����������Ĺ���������ageΪ" + age);
	}
}

public class Wolf extends Animal
{
	public Wolf(){
		super("��̫��", 3);
		System.out.println("Wolf����޲ι��캯��");
	}
	public static void main(String args[]){
		new Wolf();
	}
}