package pratice;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		int bal=0;
		int with=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Balance:");
		bal=sc.nextInt();
		System.out.println("Enter the withdrawal amount:");
		with=sc.nextInt();
		if(bal==0) {
			System.out.println("cannot withdraw amount:  Insufficient amount!");
		}if(with%100==0) {
			System.out.println("amount deducted!: available balance:"+(bal-with));
			
		}else {
		System.out.println("Please enter correct denomination!");
		}
		
	}

}
