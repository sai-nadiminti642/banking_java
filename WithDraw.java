package p1;

public class WithDraw implements Transaction {
	public void process(int amt) {
		if(amt<b.bal) {
			System.out.println("Amount Withdrawn "+amt);
			b.bal= b.bal-amt;
			System.out.println(" Balance Amount : " +b.getBalance());// getBalance method from Balance class
		}else {
			System.out.println("Insufficient Funds");
		}
	}
}
