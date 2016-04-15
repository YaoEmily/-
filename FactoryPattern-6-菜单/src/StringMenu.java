
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMenu extends Menu {

	private List<String> seq = new ArrayList<String>();

	public StringMenu(ArrayList<String> itemList) {
		super(itemList);
		seq.add("first");
		seq.add("second");
		seq.add("third");
		seq.add("forth");
		seq.add("fifth");
		current = 3;
	}

	@Override
	public void add() {
		Scanner s = new Scanner(System.in);
		System.out.println("输入要添加的列表值");
		current++;
		itemList.add(seq.get(current - 1) + "." + s.nextLine());
	}

	@Override
	public void display() {
		for (int i = 0; i < itemList.size(); i++)
			System.out.println(itemList.get(i));
	}

	@Override
	public void remove() {
		Scanner s = new Scanner(System.in);
		System.out.println("输入要删除的列表项");
		String start = s.nextLine();
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).startsWith(start))
				itemList.remove(i);
		}
	}

	@Override
	public void show() {
		System.out.println("字符串列表");
	}

}
