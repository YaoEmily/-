
import java.util.ArrayList;
import java.util.List;



public class NumberMenuFactory extends MenuFactory {

	private ArrayList<String> item=new ArrayList<String>();
	
	public NumberMenuFactory(int n) {
		super(n);
	}

	@Override
	public Menu createMenu() {
		for(int i=0;i<n;i++)
		{
			item.add((i+1)+".ÁÐ±íÏî");
		}
		return new	NumberMenu(item);
	}

}
