package com.neu.checars;

import java.net.*;
public class InetAddressTest
{
	public static void main(String args[])
	{
		try 
		{
			//根据主机名来获取InetAddress实例，InetAddress没有提供构造方法，只是提供了两个静态方法来获取InetAddress实例
			//方法一
			InetAddress ipByName = InetAddress.getByName("www.baidu.com");
			//方法二
			InetAddress ipByAddress = InetAddress.getByAddress(new byte[] {(byte)119, (byte)75, (byte)217, (byte)70});
			System.out.println(ipByName);
			System.out.println(ipByAddress + "\n");
			//判断主机是否可达
			System.out.println(ipByName.isReachable(2000));
			System.out.println(ipByName.getHostAddress() + "\n");
			//本机操作
			InetAddress localHost = InetAddress.getByAddress(new byte[]{(byte)127,0,0,1});
			System.out.println(localHost.isReachable(2000));
			System.out.println(localHost.getCanonicalHostName());
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
}