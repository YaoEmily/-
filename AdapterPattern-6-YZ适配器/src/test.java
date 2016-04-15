

public class test {

	public static void main(String[] args) {

		libZ z=new libZ();
		libY y=new libY();
		System.out.println("三角形面积为："+y.executeY(3, 3, 3));
		YAdapter adapter =new YAdapter(z);
		System.out.println("三角形面积为："+adapter.executeY(3, 3, 3));
	}
}
