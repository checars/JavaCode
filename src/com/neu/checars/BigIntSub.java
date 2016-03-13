package com.neu.checars;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntSub {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			BigInteger big1 = scan.nextBigInteger();
			BigInteger big2 = scan.nextBigInteger();
			BigInteger big3 = big1.subtract(big2);
			System.out.println(big3);
		}
		scan.close();
	}
}
