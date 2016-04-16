
public class Iterator extends AbstractIterator {
	private Collection collection;
	private int current = 0;
	private int step = 1;
	
	public Iterator(Collection collection)
	{
		this.collection = collection;
	}
	@Override
	public Item First() {
		current = 0;
		return (Item)collection.items.get(current);
	}

	@Override
	public Item Next() {
		current+=step;
		if(!IsDone())
			return (Item)collection.items.get(current);
		else return null;
	}

	@Override
	public boolean IsDone() {
		return current>=collection.getCount() ? true : false;
	}

	@Override
	public Item CurrentItem() {
		return (Item)collection.items.get(current);
	}
	public int getStep() {
		return step;
	}
	public void setStep(int step) {
		this.step = step;
	}

}
