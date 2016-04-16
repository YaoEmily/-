
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Client {

	private Frame frame;
	private Panel nn;
	Button btn1;
	Button btn2;
	Button btn3;
	Canvas canvas;
	Context c;
	public Client()// 构造方法
	{
		init();
	}
	private void init()
	{
		c=new Context();
		frame= new Frame("着色状态");
		nn= new Panel();
		btn1 = new Button("push");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				c.push();
				canvas.setBackground(c.getState().getColor());
			}
		});
		btn2 = new Button("pull");
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				c.pull();
				canvas.setBackground(c.getState().getColor());
			}
		});
		btn3=new Button("exit");
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		canvas = new Canvas();
		canvas.setBackground(Color.red);
		canvas.setSize(300, 200);
		nn.add(canvas);
		nn.add(btn1);
		nn.add(btn2);
		nn.add(btn3);
		frame.add(nn);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client t=new Client();
	}

}
