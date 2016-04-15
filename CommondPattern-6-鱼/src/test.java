

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class test {

	private JButton btn1,btn2;
	private fish f=new fish();
	private JFrame frame= new JFrame("状态");
	private JPanel panel=new JPanel();
	public test()// 构造方法
	{
		init();
	}
	public void init()
	{
		
		btn1=new JButton("按背面的按钮");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				command c=new ConcreateCommand(f);
				PushInvoke invoke = new PushInvoke(c);
				invoke.serve();
			}
		});
		
		
		btn2=new JButton("you gotta be kidding!");
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				command c=new ConcreateCommand(f);
				YellInvoke invoke = new YellInvoke(c);
				invoke.serve();
			}
		});
		panel.add(btn1);
		panel.add(btn2);
		frame.add(panel);
		frame.setSize(300, 100);
		frame.setVisible(true);
	}
	public static void main(String args[]) {
		test t=new test();
	}
}
