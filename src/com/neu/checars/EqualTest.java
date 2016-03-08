package com.neu.checars;

public class EqualTest
{
	public static void main(String args[]){
		int i = 65;
		float f = 65.0f;
		char c = 'A';
		System.out.println("65 �� 65.0f �ıȽϽ�� " + (i == f));
		System.out.println("65 �� 'A' �ıȽϽ�� " + (i == c));
		System.out.println("65.0f �� 'A' �ıȽϽ�� " + (f == c));

		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println("str1 == str2 ? " + (str1 == str2));
		System.out.println("str1 equals str2 ? " + str1.equals(str2));
		
		//���������ڱ���ʱ��������
		//System.out.println("hello" == new EqualTest());
		String s1 = "���Java";
		String s2 = "���";
		String s3 = "Java";
		String s4 = "���" + "Java";
		String s5 = "��"+"��"+"Java";
		String s6 = s2 + s3;
		String s7 = new String("���Java");
		System.out.println("\n\n" + (s1==s4));
		System.out.println(s1==s5);
		System.out.println(s1==s6);
		System.out.println(s1==s7);
	}
}