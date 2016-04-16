
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
		//���ɵ�����
		Iterator iterator = new Iterator(collection);
		//���ò���
		iterator.setStep(2);
		//�õ�����ѭ���ۼ�
		for(Item item = iterator.First();!iterator.IsDone();item = iterator.Next())
		{
			System.out.println(item.getName());
		}
	}
}
