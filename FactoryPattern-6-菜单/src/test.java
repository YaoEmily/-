
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		System.out.println("�����б�");
		System.out.println("��ѡ��һ���б������");
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
		m.display();//��ʾ�˵�
		System.out.println("��1�����б���");
		System.out.println("��2�����б���");
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
			System.out.println("��1�����б���");
			System.out.println("��2�����б���");
			m.show();
		}
	}
}
