package com.neu.checars;

public class OverSuper extends Super
{
	public void fly(){
		System.out.println("I am Running!!!");
	}

	public void useSuper(){
		super.fly();	//ʹ��super�ؼ��ֵ��ø����б����ǵ�ʵ������fly
	}

	public static void main(String args[]){
		OverSuper o = new OverSuper();
		o.fly();
		o.useSuper();	//��������ܷ��ʸ��౻���ǵķ�����Ҫͨ�������ʵ��������super�ؼ��ֵ���
	}
}

