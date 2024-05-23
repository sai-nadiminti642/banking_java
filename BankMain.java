package p2;
import java.util.*;
import p1.*;
public class BankMain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int count =0;
		abc : // its a label for a while loop // u can assign a label in java
		while(true) {
			System.out.println("Enter a pin num :");
			int pin = sc.nextInt();
		if(pin<=9999 && pin>999) {
			CheckPin cp = new CheckPin();
			boolean a= cp.pinVerify(pin);
			if(a) {
				System.out.println(">Transaction ");
			System.out.println("\t1.WithDraw"+"\n\t2.Deposit");
			System.out.println("Choose the Transaction ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println(" Enter the Amount ");
				int A= sc.nextInt();
				if(A>0 && A%100==0) {
					WithDraw wd= new WithDraw(); // obj of withdraw class
					wd.process(A);
					System.out.println("U hav an Amount");
				}else {
					System.out.println("Invalid Amount ");
				}
				break abc;
			case 2:
				System.out.println("Enter a Deposit Amount");
				int d=sc.nextInt();
				if(d>0 && d%100==0) {
					Deposit D= new Deposit(); // obj of deposit class
					D.process(d);
				}else {
					System.out.println("Not Enough to Deposit");
				}
				break abc;
			default : 
				System.out.println("Invalid option");
				break abc; // this line breaks the label means loop 
			}
			}
			else {
				System.out.println(" Pin Doesn't Exist");
				count++;
			}}
		else {
			System.out.println("Invalid Pin \n Enter ur pin Again");
			count++;
		}	
		if(count==3) {
			System.out.println(" Sorry ! your Transaction has been Blocked ");
		    break;
		}// TODO Auto-generated method stub
		}
	}

}
