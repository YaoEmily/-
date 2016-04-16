import java.awt.Color;

public class RedState extends State {

	@Override
	public void handlePush(Context c) {
		c.setState(new BlueState());
	}

	@Override
	public void handlePull(Context c) {
		c.setState(new BlackState());
	}
	public Color getColor()
	{
		return Color.red;
	}
}
