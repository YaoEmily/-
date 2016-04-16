import java.awt.Color;

public class BlackState extends State {

	@Override
	public void handlePush(Context c) {
		c.setState(new RedState());
	}

	@Override
	public void handlePull(Context c) {
		c.setState(new GreenState());
	}
	public Color getColor()
	{
		return Color.black;
	}
}
