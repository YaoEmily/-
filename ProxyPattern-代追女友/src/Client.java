
public class Client {
	public static void main(String[] args)
	{
		SchoolGirl jiaojiao = new SchoolGirl();
		jiaojiao.setName("���");
		
		Proxy daili = new Proxy(jiaojiao);
		daili.GiveDolls();
		daili.GiveFlowers();
		daili.GiveChocolate();
	}
}
