
public class Majordomo extends Manager {
	public Majordomo(String name)
	{
		super(name);
	}
	@Override
	public void RequestApplication(Request request) {
		if(request.getRequestType()=="���" && request.getNumber()<=5)
			System.out.println(name+":"+request.getRequestContent()
				+"����"+request.getNumber()+"����׼");
		else{
			if(superior!=null)
				superior.RequestApplication(request);
		}
	}

}
