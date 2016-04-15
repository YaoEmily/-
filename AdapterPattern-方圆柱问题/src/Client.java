
public class Client {
	public static void main(String[] args)
	{
		RoundPeg roundPeg = new RoundPeg();
		SquarePeg squarePeg = new SquarePeg();
		
		squarePeg.insert("Inserting square peg...");
		ISquarePeg roundToSquare = new PegAdapter(roundPeg);
		roundToSquare.insert("Inserting round peg...");
		
		roundPeg.insertIntoHole("Inserting round peg...");
		IRoundPeg squareToRound = new PegAdapter(squarePeg);
		squareToRound.insertIntoHole("Inserting square peg...");
	}
}
