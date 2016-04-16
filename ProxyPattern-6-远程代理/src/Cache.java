

import javax.swing.JLabel;

public class Cache implements IPage {

	private Remote remote;
	
	public Cache() {
		remote=new Remote();
	}

	@Override
	public void getPicture(JLabel label){
		remote.getPicture(label);
	}

	@Override
	public void getText(JLabel label) {
		remote.getText(label);
	}
	
	

}
