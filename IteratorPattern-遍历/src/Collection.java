import java.util.ArrayList;

public class Collection extends AbstractCollection {
	public ArrayList<Item> items = new ArrayList<Item>();
	@Override
	public Iterator CreateIterator() {
		return new Iterator(this);
	}
	public int getCount()
	{
		return items.size();
	}
	public Item getItem(int index)
	{
		return (Item)items.get(index);
	}
	public void setItem(Item i)
	{
		items.add(i);
	}
}
