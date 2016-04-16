import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		CashContext cc = null;
		while (flag) {
			System.out.println("请选择：");
			System.out.println("1.正常收费");
			System.out.println("2.满300返100");
			System.out.println("3.打8折");
			System.out.print("你选择的收费模式：");
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
		System.out.print("价格");
		per = s.nextDouble();
		System.out.print("数量");
		num = s.nextDouble();
		double money = per*num;
		System.out.print("总价：");
		System.out.println(cc.getResult(money));
	}
}
