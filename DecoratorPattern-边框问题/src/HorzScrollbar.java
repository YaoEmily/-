import java.awt.Component;

public class HorzScrollbar extends Scrollbar {
	public HorzScrollbar(Component component,String name)
	{
		super();
		this.name = name;
		this.component = component;
		draw();
	}
	public void draw()
	{
		System.out.println("���ڻ�Horz����������"+name);
	}
}
