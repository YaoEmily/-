



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test {

	private JFrame frame;
	private JButton btn;
	private JPanel panel;
	private JLabel label1,label2,label3;
	public test()
	{
		init();
	}
	private void init()
	{
		btn=new JButton("获取远程");
		panel=new JPanel();
		label1=new JLabel();
		label1.setIcon(new ImageIcon("drawable/美美哒.png"));
		label2=new JLabel();
		label3=new JLabel();
		frame=new JFrame();
		frame.add(panel);
		panel.add(btn);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		frame.setSize(1000, 1000);
		frame.setVisible(true);
	
		btn.addActionListener(new  ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Cache cache=new Cache();
				cache.getPicture(label2);
				cache.getText(label3);
			}
		});
	}
	public static void main(String[] args) {
		test t=new test();
	}
}
