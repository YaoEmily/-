
public class Client {
	public static void main(String[] args)
	{
		CommonManager jinli = new CommonManager("����");
		Majordomo kunkun = new Majordomo("����");
		GeneralManager yaoyao = new GeneralManager("ңң");
		
		jinli.setSuperior(kunkun);
		kunkun.setSuperior(yaoyao);
		
		Request request1 = new Request();
		request1.setRequestType("���");
		request1.setRequestContent("�������");
		request1.setNumber(1);
		jinli.RequestApplication(request1);
		
		Request request2 = new Request();
		request2.setRequestType("���");
		request2.setRequestContent("�������");
		request2.setNumber(3);
		jinli.RequestApplication(request2);
		
		Request request3 = new Request();
		request3.setRequestType("���");
		request3.setRequestContent("�������");
		request3.setNumber(365);
		jinli.RequestApplication(request3);
		
		Request request4 = new Request();
		request4.setRequestType("��н");
		request4.setRequestContent("�����н");
		request4.setNumber(10);
		jinli.RequestApplication(request4);
		
		Request request5 = new Request();
		request5.setRequestType("��н");
		request5.setRequestContent("�����н");
		request5.setNumber(10000);
		jinli.RequestApplication(request5);
	}
}
