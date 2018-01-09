package set_15_project_01;

import set_15_project_01.Task;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task t2 = new Task("Wash the dishes!");
		Task t1 = new Task("Walk the dog!", t2);
		t2.setNextTask(new Task("Clean the room!"));
		Task head = new Task("Get rest!",t1);
		head.printTasks();
		System.out.println();
		head.printTasksRev();
		System.out.println();
		System.out.println();
		Task.printTasks(head);
		System.out.println();
		Task.printTasksRev(head);
		System.out.println();
	}

}
