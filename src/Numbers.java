
public class Numbers extends Thread {
	private int start;
	private int end;
	public Numbers(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	public Numbers() {
		super();
	}
	@Override
	public void run() {
		printNos();
	}
	public void printNos() {
		Thread t = Thread.currentThread();
		for(int i = start;i<=end; i++) {
			System.out.println(t.getName() + ":" + i);
		}
	}
}
