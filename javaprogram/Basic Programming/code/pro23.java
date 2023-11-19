
import java.util.Scanner;

class CalSquareRI
{
	void squareRoot()
	{
		int num, squareRoot;
                System.out.println(" ");
		System.out.println("Program to calculate Square Root of an integer");
                System.out.println(" ");

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = scan.nextInt();
		squareRoot = num * num;
		System.out.println("Square Root of " + num + " is : " + squareRoot);
	}

	        public static void main(String args[])
	        {
		         CalSquareRI c = new CalSquareRI();
		         c.squareRoot();
	        }
}