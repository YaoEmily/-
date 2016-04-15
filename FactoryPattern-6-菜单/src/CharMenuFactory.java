

import java.util.ArrayList;

public class CharMenuFactory extends MenuFactory {

	private ArrayList<String> item=new ArrayList<String>();
	
	
	public CharMenuFactory(int n) {
		super(n);
	}
	@Override
	public Menu createMenu(){
		for(int i=0;i<n;i++)
		{
			int tmp='A'+i;
			item.add((char)tmp+".ÁÐ±íÏî");
		}
		return new CharMenu(item);
	}
	
	
}
