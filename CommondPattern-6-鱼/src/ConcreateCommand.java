

public class ConcreateCommand extends command {
	private fish f=null;
	public ConcreateCommand(fish f) {
		super();
		this.f=f;
	}

	@Override
	public void actionPerformed() {
		f.sing();
	}
}
