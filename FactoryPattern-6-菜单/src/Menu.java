

import java.util.ArrayList;
import java.util.List;

public abstract class Menu {
	
	protected ArrayList<String> itemList=new ArrayList<String>();
	protected int current;
	public Menu(ArrayList<String> itemList)
	{
		this.itemList=itemList;
	}
	public abstract void display();//显示菜单
	public abstract void add();
	public abstract void remove();
	public abstract void show();//显示当前类别
}
