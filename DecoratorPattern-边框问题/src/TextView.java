import java.awt.Component;

public class TextView extends Component {
	private String name;
	public TextView(String name)
	{
		this.name = name;
		draw();
	}
	public void draw()
	{
		System.out.println("���ڻ��ı�����"+name);
	}
	public String getName()
	{
		return name;
	}
}
