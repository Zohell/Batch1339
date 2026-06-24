package pratice;
import java.util.Scanner;

public class Student {
public static void main(String[] args) {
	int mrks=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("---------Result Portal----------");
	System.out.println("Enter your marks: ");
	mrks=sc.nextInt();
	if(mrks>=40) {
		System.out.println("Pass!");
	
	if(mrks>=90){
	System.out.println("Grade A");
	}
	else if(mrks>=75) {
		System.out.println("Grade B");
	}else {
		System.out.println("Grade C");
	}
	}
else {
System.out.println("Fail!!..");
}

		
}
}
