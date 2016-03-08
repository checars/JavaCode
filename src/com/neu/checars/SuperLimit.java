package com.neu.checars;

class SuperBaseClass
{
	int a = 5;
}

class SuperSubClass extends SuperBaseClass
{
	int a = 7;
	public void accessOwner(){
		System.out.println(a);
	}
	public void accessBase(){
		System.out.println(super.a);
	}
}

class SuperLimit
{
	public static void main(String args[])
	{
		SuperSubClass s = new SuperSubClass();
		s.accessOwner();
		s.accessBase();
	}
	
}

