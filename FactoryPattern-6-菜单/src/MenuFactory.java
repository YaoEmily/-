
public abstract class MenuFactory {
	protected int n;
	public abstract Menu createMenu(); 
	public MenuFactory(int n)
	{
		this.n=n;
	}
}
