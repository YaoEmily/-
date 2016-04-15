
public abstract class Manager {
	protected String name;
	protected Manager superior;
	public Manager getSuperior() {
		return superior;
	}
	public void setSuperior(Manager superior) {
		this.superior = superior;
	}
	public Manager(String name)
	{
		this.name = name;
	}
	public abstract void RequestApplication(Request request);
}
