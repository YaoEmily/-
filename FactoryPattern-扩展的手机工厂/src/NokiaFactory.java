
public class NokiaFactory implements MobileFactory {

	@Override
	public Mobile produceMobile() {
		System.out.print("ŵ�����ֻ�����������");
		return new Nokia();
	}

}
