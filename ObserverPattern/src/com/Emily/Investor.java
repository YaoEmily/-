package com.Emily;

import java.util.Observable;
import java.util.Observer;

public class Investor implements Observer {
	private String name;
	//private String observerState;
	private Stock stock;
	public Investor(String name)
	{
		this.name = name;
	}
//	@Override
//	public void Update(Stock stock, Object arg)
//	{
//		System.out.println("֪ͨ����" 
//				+ name
//				+ " "
//				+stock.getSymbol()
//				+ "���¹ɼ�Ϊ��"
//				+ stock.getPrice());
//	}
	public Stock getStock()
	{
		return stock;
	}
	public void setStock(Stock stock)
	{
		this.stock = stock;
	}
	@Override
	public void update(Observable o, Object arg) {
		Stock sto = (Stock)o;
		System.out.println("֪ͨ����" 
				+ name
				+ " "
				+sto.getSymbol()
				+ "���¹ɼ�Ϊ��"
				+ sto.getPrice());
	}
}
