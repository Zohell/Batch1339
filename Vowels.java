package loop;
import java.util.Scanner;


public class Vowels {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a character: ");
char in=sc.next().charAt(0);


if(in =='a'|| in=='e' || in=='i'|| in=='o'|| in=='u')
{
	System.out.println("Its a Vovel..!");
}else {
	System.out.println("it is a constant...!");
}
sc.close();


}
}
    