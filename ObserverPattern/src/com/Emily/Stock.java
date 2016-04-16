package com.Emily;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
//被观察对象——个股
abstract class Stock extends Observable{
	protected String symbol;
	protected double price;
	private ArrayList<Investor> investors = new ArrayList<>();
	protected Stock(String symbol,double price)
	{
		this.symbol = symbol;
		this.price = price;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
		Notify();
	}
	public String getSymbol()
	{
		return symbol;
	}
	public void setSymbol(String symbol)
	{
		this.symbol = symbol;
	}
	public void Attach(Investor investor)
	{
		investors.add(investor);
	}
	public void Detach(Investor investor)
	{
		investors.remove(investor);
	}
	public void Notify()
	{
		for(int i = 0; i < investors.size(); i++)
		{
			Object o;
			//investors.get(i).Update(this,o);
		}
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		super.notifyObservers();
	}
}