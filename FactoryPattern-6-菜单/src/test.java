
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		System.out.println("生成列表");
		System.out.println("请选择一个列表的种类");
		Scanner s=new Scanner(System.in);
		int type=s.nextInt();
		Menu m;
		MenuFactory mf=null;
		switch (type) {
		case 1:
			mf=new CharMenuFactory(3);
			break;
		case 2:
			mf=new NumberMenuFactory(3);
			break;
		case 3:
			mf=new StringMenuFactory(3);
			break;
		}
		m=mf.createMenu();
		m.display();//显示菜单
		System.out.println("按1增加列表项");
		System.out.println("按2减少列表项");
		m.show();
		while(true)
		{
			int flag=s.nextInt();
			switch(flag)
			{
			case 1:
				m.add();
				break;
			case 2:
				m.remove();
				break;
			}
			m.display();
			System.out.println("按1增加列表项");
			System.out.println("按2减少列表项");
			m.show();
		}
	}
}
