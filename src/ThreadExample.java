
public class ThreadExample {

	public static void main(String[] args) {
		Numbers t1 = new Numbers(1,400);
		t1.setPriority(10);
		Numbers t2 = new Numbers(800,1400);
		t1.setDaemon(true);
		t2.setDaemon(true);
		t1.start();
		t2.start();
//		Thread t3 = new Thread(()-> {
//			for(int ch='A';ch<='Z';ch++) {
//				System.out.println(ch);
//			}
//		});
		Thread t3 = new Thread(new Runnable(){
            public void run() {
			for(int ch='A';ch<='Z';ch++) {
				System.out.println(ch);
			}
		}});

		t3.start();
		doTask();
	}

	private static void doTask() {
		Thread t = Thread.currentThread();
		System.out.println("Name : " + t.getName());
		System.out.println("Priority :" + t.getPriority());
		System.out.println("Group :" + t.getThreadGroup().getName());
		System.out.println("Daemon :" + t.isDaemon());
	}

}
