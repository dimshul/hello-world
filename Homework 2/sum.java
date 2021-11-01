import java.util.Scanner; 

public class sum {
	public static void main(String args[]) {
		int x=0;
		int y=0;
		int sum=0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first integer:");
		x = scan.nextInt();	
		System.out.println("Enter the second integer:");
		y = scan.nextInt();
		
		sum=x+y;
		System.out.println("The sum of the two integers is "+ sum);
	}
}