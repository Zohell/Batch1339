package pratice;
import java.util.Scanner;
public class Ticket {
	public static void main(String[] args) {
	int age;
		System.out.println("Enter Your age: ");
		Scanner sc= new Scanner(System.in);
	age=sc.nextInt();
	if(age<=18) {
		System.out.println("Half Ticket");
	}
	else if(age>=60) {
		System.out.println("Senior citizen discount....");
	}
	else {
		System.out.println("Normal price....");
	}
	
	}
	}


