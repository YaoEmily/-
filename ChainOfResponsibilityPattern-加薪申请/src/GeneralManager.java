
public class GeneralManager extends Manager {
	public GeneralManager(String name) {
		super(name);
	}
	@Override
	public void RequestApplication(Request request) {
		if(request.getRequestType()=="���")
			System.out.println(name+":"+request.getRequestContent()
				+"����"+request.getNumber()+"����׼");
		else if(request.getRequestType()=="��н"&&request.getNumber()<=500)
			System.out.println(name+":"+request.getRequestContent()
			+"����"+request.getNumber()+"����׼");
		else if(request.getRequestType()=="��н"&&request.getNumber()>500)
			System.out.println(name+":"+request.getRequestContent()
			+"����"+request.getNumber()+"��˵��");
	}
}
