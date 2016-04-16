
public class IteratorApp {
	public static void main(String[] args)
	{
		Collection collection = new Collection();
		collection.setItem(new Item("Item 0"));
		collection.setItem(new Item("Item 1"));
		collection.setItem(new Item("Item 2"));
		collection.setItem(new Item("Item 3"));
		collection.setItem(new Item("Item 4"));
		collection.setItem(new Item("Item 5"));
		//生成迭代器
		Iterator iterator = new Iterator(collection);
		//设置步长
		iterator.setStep(2);
		//用迭代器循环聚集
		for(Item item = iterator.First();!iterator.IsDone();item = iterator.Next())
		{
			System.out.println(item.getName());
		}
	}
}
