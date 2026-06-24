package pratice;
import java.util.Scanner;

public class Shopping {
public static void main(String[] args) {
	
	int amt=0;
	boolean member;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your amount:");
	amt=sc.nextInt();
	System.out.println("Are you a memeber?:");
	member=sc.nextBoolean();
	 if(amt>1000) {
		 if(member=true) {
			 System.out.println("discount 20%");
		 }else {
			 System.out.println("discount 10%");
		 }
	 }else {
		 System.out.println("No Discount");
	 }
	 
	
}
}
