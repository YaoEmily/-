

public class test {

	public static void main(String[] args) {

		libZ z=new libZ();
		libY y=new libY();
		System.out.println("���������Ϊ��"+y.executeY(3, 3, 3));
		YAdapter adapter =new YAdapter(z);
		System.out.println("���������Ϊ��"+adapter.executeY(3, 3, 3));
	}
}
