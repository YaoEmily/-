
public class Majordomo extends Manager {
	public Majordomo(String name)
	{
		super(name);
	}
	@Override
	public void RequestApplication(Request request) {
		if(request.getRequestType()=="请假" && request.getNumber()<=5)
			System.out.println(name+":"+request.getRequestContent()
				+"数量"+request.getNumber()+"被批准");
		else{
			if(superior!=null)
				superior.RequestApplication(request);
		}
	}

}
