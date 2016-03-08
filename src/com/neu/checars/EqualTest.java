package com.neu.checars;

public class EqualTest
{
	public static void main(String args[]){
		int i = 65;
		float f = 65.0f;
		char c = 'A';
		System.out.println("65 和 65.0f 的比较结果 " + (i == f));
		System.out.println("65 和 'A' 的比较结果 " + (i == c));
		System.out.println("65.0f 和 'A' 的比较结果 " + (f == c));

		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println("str1 == str2 ? " + (str1 == str2));
		System.out.println("str1 equals str2 ? " + str1.equals(str2));
		
		//下面的语句在编译时发生错误
		//System.out.println("hello" == new EqualTest());
		String s1 = "疯狂Java";
		String s2 = "疯狂";
		String s3 = "Java";
		String s4 = "疯狂" + "Java";
		String s5 = "疯"+"狂"+"Java";
		String s6 = s2 + s3;
		String s7 = new String("疯狂Java");
		System.out.println("\n\n" + (s1==s4));
		System.out.println(s1==s5);
		System.out.println(s1==s6);
		System.out.println(s1==s7);
	}
}