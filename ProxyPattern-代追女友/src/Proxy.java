
public class Proxy implements GiveGifts {
	Persuit gg;
	public Proxy(SchoolGirl mm)
	{
		this.gg = new Persuit(mm);
	}
	@Override
	public void GiveDolls() {
		gg.GiveDolls();
	}

	@Override
	public void GiveFlowers() {
		gg.GiveFlowers();
	}

	@Override
	public void GiveChocolate() {
		gg.GiveChocolate();
	}

}
