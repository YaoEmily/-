
public class Persuit implements GiveGifts {
	SchoolGirl mm;
	public Persuit(SchoolGirl mm)
	{
		this.mm = mm;
	}
	@Override
	public void GiveDolls() {
		System.out.println(mm.getName()+" �͸���������");
	}

	@Override
	public void GiveFlowers() {
		System.out.println(mm.getName()+" �͸����ʻ�");
	}

	@Override
	public void GiveChocolate() {
		System.out.println(mm.getName()+" �͸����ɿ���");
	}

}
