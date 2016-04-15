
public class libY {
	public double executeY(double a,double b,double c)
	{
		System.out.println("Y程序运行在Y库");
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}
