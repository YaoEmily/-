package com.Emily;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������
		Investor s1 = new Investor("ʯͷ");
		Investor s2 = new Investor("С��");
		//�������ɣ���������Ͷ�ʵĹ���
		AppleInc apple=new AppleInc("AppleInc", 100.00);
		apple.Attach(s1);
		apple.Attach(s2);
		//����ɼۣ�����õ�֪ͨ
		apple.setPrice(100.50);
		apple.setPrice(99.90);
		apple.setPrice(110.88);
	}
}