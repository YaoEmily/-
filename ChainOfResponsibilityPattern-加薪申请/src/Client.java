
public class Client {
	public static void main(String[] args)
	{
		CommonManager jinli = new CommonManager("½ðÀû");
		Majordomo kunkun = new Majordomo("À¤À¤");
		GeneralManager yaoyao = new GeneralManager("Ò£Ò£");
		
		jinli.setSuperior(kunkun);
		kunkun.setSuperior(yaoyao);
		
		Request request1 = new Request();
		request1.setRequestType("Çë¼Ù");
		request1.setRequestContent("²ËÄñÇë¼Ù");
		request1.setNumber(1);
		jinli.RequestApplication(request1);
		
		Request request2 = new Request();
		request2.setRequestType("Çë¼Ù");
		request2.setRequestContent("²ËÄñÇë¼Ù");
		request2.setNumber(3);
		jinli.RequestApplication(request2);
		
		Request request3 = new Request();
		request3.setRequestType("Çë¼Ù");
		request3.setRequestContent("²ËÄñÇë¼Ù");
		request3.setNumber(365);
		jinli.RequestApplication(request3);
		
		Request request4 = new Request();
		request4.setRequestType("¼ÓÐ½");
		request4.setRequestContent("²ËÄñ¼ÓÐ½");
		request4.setNumber(10);
		jinli.RequestApplication(request4);
		
		Request request5 = new Request();
		request5.setRequestType("¼ÓÐ½");
		request5.setRequestContent("²ËÄñ¼ÓÐ½");
		request5.setNumber(10000);
		jinli.RequestApplication(request5);
	}
}
