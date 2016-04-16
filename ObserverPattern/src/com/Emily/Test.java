package com.Emily;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建股民
		Investor s1 = new Investor("石头");
		Investor s2 = new Investor("小明");
		//创建个股，并附加上投资的股民
		AppleInc apple=new AppleInc("AppleInc", 100.00);
		apple.Attach(s1);
		apple.Attach(s2);
		//变更股价，股民得到通知
		apple.setPrice(100.50);
		apple.setPrice(99.90);
		apple.setPrice(110.88);
	}
}