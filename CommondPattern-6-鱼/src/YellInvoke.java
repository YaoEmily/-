

public class YellInvoke {

	private command c=null;
	
	public YellInvoke(command c)
	{
		this.c=c;
	}
	public void serve()
	{
		System.out.println("¥ÛΩ–¥•∑¢”„Ω–ªΩ");
		c.actionPerformed();
		System.out.println("/////////////");
	}
}
