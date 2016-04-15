import java.awt.Component;

public class FancyBorder extends Border {
	public FancyBorder(Component component,String name)
	{
		super();
		this.name = name;
		this.component = component;
		draw();
	}
	@Override
	public void draw() {
		System.out.println(component.getName()+"ÕýÔÚ»­Fancy±ß¿ò£¬ÊÇ"+name);
	}
}
