
public class MotorolaFactory implements MobileFactory {
	
	@Override
	public Mobile produceMobile() {
		System.out.print("摩托罗拉手机工厂制造了");
		return new Motorola();
	}

}
