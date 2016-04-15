
public class TestTaskMinder {
	public static void main(String[] args)
	{
		TaskMinder tm = new TaskMinder(500,100);
		
		FortuneTask fortuneTask = new FortuneTask();
		tm.addTask(fortuneTask, 3000);
		
		FibonacciTask fibonacciTask = new FibonacciTask();
		tm.addTask(fibonacciTask, 700);
	}
}
