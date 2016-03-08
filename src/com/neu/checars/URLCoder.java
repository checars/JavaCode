package com.neu.checars;

import java.net.*;
public class URLCoder
{
	public static void main(String args[]) throws Exception
	{
		String EnkeyWord = URLEncoder.encode("·è¿ñjava½²Òå¾«´â","GBK");
		System.out.println(EnkeyWord);
		String DekeyWord = URLDecoder.decode("%B7%E8%BF%F1java%BD%B2%D2%E5%BE%AB%B4%E2", "GBK");
		System.out.println(DekeyWord);
	}
}