

import java.util.ArrayList;
import java.util.List;

public class StringMenuFactory extends MenuFactory {

	private ArrayList<String> item=new ArrayList<String>();
	private ArrayList<String> seq=new ArrayList<String>();

	public StringMenuFactory(int n) {
		super(n);
		seq.add("first");
		seq.add("second");
		seq.add("third");
		seq.add("forth");
		seq.add("fifth");
	}

	@Override
	public Menu createMenu() {
		for(int i=0;i<n;i++)
		{
			item.add(seq.get(i)+".ÁÐ±íÏî");
		}
		return new StringMenu(item);
	}

}
