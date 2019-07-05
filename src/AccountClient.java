
public class AccountClient {

	public static void main(String[] args) throws InterruptedException {
		Account account = new Account(5000);
		TransactionThread t1 = new TransactionThread(account, TransactionType.CREDIT, "Roger",3000);
		TransactionThread t2 = new TransactionThread(account, TransactionType.CREDIT, "Smith",2500);
		TransactionThread t3 = new TransactionThread(account, TransactionType.DEBIT, "Amy",6000);
		t3.start();	
		Thread.sleep(10);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(account.getBalance());
	}

}
