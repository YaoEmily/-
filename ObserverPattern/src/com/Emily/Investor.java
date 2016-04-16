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
//		System.out.println("通知股民" 
//				+ name
//				+ " "
//				+stock.getSymbol()
//				+ "最新股价为："
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
		System.out.println("通知股民" 
				+ name
				+ " "
				+sto.getSymbol()
				+ "最新股价为："
				+ sto.getPrice());
	}
}
