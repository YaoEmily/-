
public class PegAdapter implements ISquarePeg, IRoundPeg {
	private RoundPeg roundPeg;
	private SquarePeg squarePeg;
	public PegAdapter(RoundPeg roundPeg)
	{
		this.roundPeg = roundPeg;
	}
	public PegAdapter(SquarePeg squarePeg)
	{
		this.squarePeg = squarePeg;
	}
	@Override
	public void insertIntoHole(String msg) {
		squarePeg.insert(msg);
	}

	@Override
	public void insert(String msg) {
		roundPeg.insertIntoHole(msg);
	}

}
