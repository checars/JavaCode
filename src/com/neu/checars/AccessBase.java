package com.neu.checars;

class Base
{
	public String name;
	public double score;
	public Base(String name, double score){
		System.out.println("�����е��вι�����");
		this.name = name;
		this.score = score;
	}
	public Base(){	//�˴����޲ι���������ʡ�ԣ�����ᱨ��
		System.out.println("�����е��޲ι��캯��");
	}
}

class Sub extends Base
{
	public String coures;
	public int age;

	public Sub(String name, double score, int age){
		super(name, score);	//ͨ��super�����ø���Ĺ�����
		System.out.println("��");
		this.age = age;
	}

	public Sub(String coures){
		//�����׷�ݵ�������޲ι�����
		System.out.println("��");
		this.coures = coures;
	}

	public Sub(String coures, int age){
		this(coures);	//ͨ��this����ͬһ�����е���һ�����ع�����
		System.out.println("��");
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