class Table{
	synchronized void printTable(int n) {
		for(int i = 1; i <= 10; i++)
			System.out.println(n + " * " + i + " = " + i*n);
	}
}

class MyThread_1 extends Thread{
	Table table = new Table();
	int number;
	MyThread_1(Table table, int number){
		this.table = table;
		this.number = number;
	}
	public void run() {
		table.printTable(number);		
	}
}

class MyThread_2 extends Thread{

	Table table = new Table();
	int number;
	MyThread_2(Table table, int number){
		this.table = table;
		this.number = number;
	}
	public void run() {
		table.printTable(number);			
	}
}
public class MyThreadSynchronization
{

	public static void main(String[] args)
	 {
		Table table = new Table();
		MyThread_1 thread_1 = new MyThread_1(table, 5);
		MyThread_2 thread_2 = new MyThread_2(table, 10);
		thread_1.start();
		thread_2.start();
	}
}
