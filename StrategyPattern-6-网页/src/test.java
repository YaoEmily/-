

import java.util.Scanner;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListContext context=new ListContext();
		boolean flag=true;
		while (flag) {
			Scanner s = new Scanner(System.in);
			System.out.println("按1为显示左对齐，2显示居中对齐，3显示双栏列表，4退出");
			int a = s.nextInt();
			switch (a) {
			case 1:
				context.setList(new LeftList());
				context.show();
				break;
			case 2:
				context.setList(new ZhongList());
				context.show();
				break;
			case 3:
				context.setList(new DoubleList());
				context.show();
				break;
			case 4:
				flag=false;
				break;
			}
		System.out.println("/////////////////");
		}
	}

}
