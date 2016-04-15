import java.awt.Component;

public abstract class Decorator extends Component {
	protected Component component;
	protected String name;
	public String getName()
	{
		return name;
	}
	public abstract void draw();
}
