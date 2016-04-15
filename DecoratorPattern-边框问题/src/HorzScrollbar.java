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
		System.out.println("正在画Horz滚动条，是"+name);
	}
}
