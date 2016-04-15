
public class FibonacciTask implements Task {
	public int n1=0;
	public int n2=1;
	public int num;
	public FibonacciTask(){}
	@Override
	public void performTask() {
		num = n1+n2;
		System.out.println("Next Fibonacci num is "+num);
		n1=n2;
		n2=num;
	}
	public String toString()
	{
		return "Fibonacci Sequence Task";
	}
}
