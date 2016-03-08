package com.neu.checars;

import java.net.*;
public class InetAddressTest
{
	public static void main(String args[])
	{
		try 
		{
			//��������������ȡInetAddressʵ����InetAddressû���ṩ���췽����ֻ���ṩ��������̬��������ȡInetAddressʵ��
			//����һ
			InetAddress ipByName = InetAddress.getByName("www.baidu.com");
			//������
			InetAddress ipByAddress = InetAddress.getByAddress(new byte[] {(byte)119, (byte)75, (byte)217, (byte)70});
			System.out.println(ipByName);
			System.out.println(ipByAddress + "\n");
			//�ж������Ƿ�ɴ�
			System.out.println(ipByName.isReachable(2000));
			System.out.println(ipByName.getHostAddress() + "\n");
			//��������
			InetAddress localHost = InetAddress.getByAddress(new byte[]{(byte)127,0,0,1});
			System.out.println(localHost.isReachable(2000));
			System.out.println(localHost.getCanonicalHostName());
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
}