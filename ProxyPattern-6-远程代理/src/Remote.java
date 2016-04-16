

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Remote implements IPage {

	@Override
	public void getPicture(JLabel label) {
		label.setIcon(new ImageIcon("drawable/举爪爪.jpg"));
		
		label.updateUI();
	}

	@Override
	public void getText(JLabel label) {
		label.setText("远程获得的文字");
	}
}
