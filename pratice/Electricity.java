package pratice;
import java.util.Scanner;

public class Electricity {
	public static void main(String[] args) {
		int unit=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your unit:");
		unit=sc.nextInt();
		
		if(unit>=100) {
			System.out.println("5rs per unit: "+(unit*5)+"rs");
		}
		else if(unit>=200) {
			System.out.println("10rs per unit:"+(unit*10)+"rs");
		}
		else {
			System.out.println("7rs per unit:"+(unit*7)+"rs");
		}
		
		
		
	}

}
