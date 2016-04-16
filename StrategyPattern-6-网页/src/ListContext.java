

public class ListContext {

	private ListStrategy list=null;

	public void setList(ListStrategy list) {
		this.list = list;
	}
	
	public void show()
	{
		list.showList();
	}
}
