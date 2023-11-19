
import java.util.Scanner;

class NumberOrder
{
	void CheckOrder()
	{
		System.out.println(" ");
		System.out.println("Program to Check Order of Three Numbers");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int first = scan.nextInt();
		System.out.print("Enter Second Number : ");
		int second = scan.nextInt();
		System.out.print("Enter Third Number : ");
		int third = scan.nextInt();

		if(first > second && second > third)
		{
			System.out.println("Numbers are in Decreasing Order");
		}
		else if(first < second && second < third)
		{
			System.out.println("Numbers are in Increasing Order");
		}
		else
		{
			System.out.println("Numbers are Not in Increasing and Nor in Decreasing Order");
		}
	}
	public static void main(String args[])
	{
		NumberOrder obj = new NumberOrder();
		obj.CheckOrder();
	}
}