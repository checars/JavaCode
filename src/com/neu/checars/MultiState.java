package com.neu.checars;

class BaseClass
{
	public int book = 6;
	public String s = "�����ַ���";
	public void base(){
		System.out.println("�������ͨ����");
	}
	public void test(){
		System.out.println("���౻���ǵķ���");
	}
}

class SubClass extends BaseClass
{
	public String book = "JAVA EEӦ��ʵ��";
	public String s = "�����ַ���";
	public void sub(){
		System.out.println("�������ͨ����");
	}
	public void test(){
		System.out.println("���า�Ǹ���ķ���");
	}
}

public class MultiState
{
	public static void main(String args[]){
		BaseClass bb = new BaseClass();
		bb.base();
		bb.test();

		SubClass ss = new SubClass();
		ss.sub();
		ss.test();
		//�˴������˶���Ķ�̬��
		BaseClass bs = new SubClass();
		bs.base();	//��ʱ�ñȸ���Ķ������base����
		bs.test();	//��ʱ�ñ�����Ķ������test����
		//bs.sub();	//���������벻��ͨ������Ϊbs�ı���������BaseClass�����˴�����ʱ���õ�ȴ������ķ���

		System.out.println(bb.book);
		System.out.println(ss.book);
		System.out.println(bs.book);//ʵ���������߱���̬�ԣ���ˣ��˴�������Ǹ����ʵ������
		SubClass bbs = (SubClass)bs;
		System.out.println(bbs.s);	//ǿ������ת����ɵ�������ʵ������
	}
}