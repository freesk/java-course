package set_15_project_01;

public class Task {
	
	String descr = "";
	Task next = null;

	public Task(String d, Task t) {
		descr = d;
		setNextTask(t);
	}
	
	public Task(String d) {
		this(d, null);
	}
	
	public void setNextTask(Task t) {
		next = t;
	}
	
	public void printTasks() { 
		System.out.print(this.descr + " ");
		if(next != null) 
			next.printTasks();	
	}
	
	public void printTasksRev() { 
		if(next != null) 
			next.printTasksRev();
		System.out.print(this.descr + " ");	
	}
	
	public static void printTasksRev(Task h) {
		h.printTasksRev();
	}
	
	public static void printTasks(Task h) {
		h.printTasks();
	}
	

}
