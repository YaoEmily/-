
public class CommonManager extends Manager {
	public CommonManager(String name) {
		super(name);
	}
	@Override
	public void RequestApplication(Request request) {
		if(request.getRequestType()=="���" && request.getNumber()<=2)
			System.out.println(name+":"+request.getRequestContent()
				+"����"+request.getNumber()+"����׼");
		else{
			if(superior!=null)
				superior.RequestApplication(request);
		}
	}
}
