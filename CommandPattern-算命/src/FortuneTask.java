
public class FortuneTask implements Task {
	public int nextFortune = 0;
	public String[] fortunes = {"You will get 100.",
			"You will own your dream.",
			"Trust yourself."};
	public FortuneTask(){}
	@Override
	public void performTask() {
		System.out.println("Your fortune is "+ fortunes[nextFortune]);
		nextFortune = (nextFortune + 1) % fortunes.length;
	}
	public String toString()
	{
		return "Fortune Telling Task";
	}
}
