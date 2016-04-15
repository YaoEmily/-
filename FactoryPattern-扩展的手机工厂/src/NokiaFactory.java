
public class NokiaFactory implements MobileFactory {

	@Override
	public Mobile produceMobile() {
		System.out.print("诺基亚手机工厂制造了");
		return new Nokia();
	}

}
