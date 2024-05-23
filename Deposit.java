package p1;

public class Deposit implements Transaction {
	public void process(int amt) {
		System.out.println("Amount Deposited : " +amt);
		b.bal=amt+b.bal;
		System.out.println("Available Amount : " +b.getBalance());
		System.out.println("Transaction Successfull");
	}

}
