
public class MotorolaFactory implements MobileFactory {
	
	@Override
	public Mobile produceMobile() {
		System.out.print("Ħ�������ֻ�����������");
		return new Motorola();
	}

}
