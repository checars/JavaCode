package com.neu.checars;

public class  IntegerValTest
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int octalValue = 013;
		int hexValue1 = 0x13;
		int hexValue2 = 0xaF;
		int binVal1 = 0b11010100;
		int binVal2 = 0B01001;
		int binVal3 = 0B10000000000000000000000000000011;
		System.out.println("八进制：" + octalValue);
		System.out.println("十六进制：" + hexValue1 + "    " + hexValue2);
		System.out.println("二进制：" + binVal1 + "    " + binVal2 + "    " + binVal3);
	}
}
