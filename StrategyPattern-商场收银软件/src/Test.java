import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		CashContext cc = null;
		while (flag) {
			System.out.println("��ѡ��");
			System.out.println("1.�����շ�");
			System.out.println("2.��300��100");
			System.out.println("3.��8��");
			System.out.print("��ѡ����շ�ģʽ��");
			int i = s.nextInt();
			flag = false;
			switch (i) {
			case 1:
				cc = new CashContext(new CashNormal());
				break;
			case 2:
				cc = new CashContext(new CashReturn("300", "100"));
				break;
			case 3:
				cc = new CashContext(new CashRebate("0.8"));
				break;
			default:
				flag = true;
			}
		}
		double per = 0,num = 0;
		System.out.print("�۸�");
		per = s.nextDouble();
		System.out.print("����");
		num = s.nextDouble();
		double money = per*num;
		System.out.print("�ܼۣ�");
		System.out.println(cc.getResult(money));
	}
}
