
public class TaskEntry {
	public Task task;
	public long repeatInterval;
	public long timeLastDone;
	public TaskEntry(Task task,long repeatInterval)
	{
		this.task = task;
		this.repeatInterval = repeatInterval;
		timeLastDone = System.currentTimeMillis();
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	public long getRepeatInterval() {
		return repeatInterval;
	}
	public void setRepeatInterval(long repeatInterval) {
		this.repeatInterval = repeatInterval;
	}
	public long getTimeLastDone() {
		return timeLastDone;
	}
	public void setTimeLastDone(long timeLastDone) {
		this.timeLastDone = timeLastDone;
	}
	public String toString()
	{
		return task + " to be done every " + repeatInterval + " ms; Last lone " + timeLastDone;
	}
}
