

public class PushInvoke {
	
	private command c=null;
	
	public PushInvoke(command c)
	{
		this.c=c;
	}
	public void serve()
	{
		System.out.println("��ť������л�");
		c.actionPerformed();
		System.out.println("/////////////");
	}
}
