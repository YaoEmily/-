

import java.util.ArrayList;
import java.util.Scanner;

public class CharMenu extends Menu {

	public CharMenu(ArrayList<String> itemList) {
		super(itemList);
		current=3;
	}

	@Override
	public void add() {
		Scanner s=new Scanner(System.in);
		System.out.println("����Ҫ��ӵ��б�ֵ");
		current++;
		itemList.add((char)(current-1+'A')+"."+s.nextLine());
	}

	@Override
	public void display() {
		for(int i=0;i<itemList.size();i++)
			System.out.println(itemList.get(i));
	}

	@Override
	public void remove() {
		Scanner s=new Scanner(System.in);
		System.out.println("����Ҫɾ�����б���");
		String start=s.nextLine();
		for(int i=0;i<itemList.size();i++)
		{
			if(itemList.get(i).startsWith(start))
			itemList.remove(i);
		}
	}

	@Override
	public void show() {
		System.out.println("�ַ��б�");
	}

}
