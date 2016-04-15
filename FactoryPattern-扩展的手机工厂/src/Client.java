
public class Client {
	public static void main(String[] args)
	{
		Mobile m;
		MobileFactory mf;
		
		mf = new MotorolaFactory();
		m = mf.produceMobile();
		m.call();
		
		mf = new NokiaFactory();
		m = mf.produceMobile();
		m.call();
	}
}
