import java.util.Scanner;

public class plusONE {
	public static void main(String args[]) {
		int x=0;
		int sum=0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer:");
		x = scan.nextInt();	
				
		sum=x+1;
		System.out.println("The integer after "+x+" is "+sum);
	}
}