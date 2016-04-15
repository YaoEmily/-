
public class YAdapter extends libY{

	private libZ z=null;
	
	public YAdapter(libZ z) {
		this.z = z;
	}
	@Override
	public double executeY(double a,double b,double c) {
		System.out.println("Ω´Y≥Ã–Ú  ≈‰µΩZø‚");
		double cos=(a*a+b*b-c*c)/(2*a*b);
		double sin=Math.sqrt(1-cos*cos);
		double h=a*sin;
		return z.executeZ(h, b);
	}
}