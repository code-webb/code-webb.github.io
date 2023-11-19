
import java.util.Scanner;

class SumOfNNum
{
	void CalcSum()
	{
		System.out.println(" ");
		System.out.println("Program to Print Sum of N Numbers");
		int i, n, sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of N : ");
		n = scan.nextInt();
		int num[] = new int[n];

		for(i = 0; i < n; i++)
		{
			System.out.print("Enter a number : ");
			num[i] = scan.nextInt();
			sum += num[i];
		}
		System.out.println(" ");
		System.out.println("Sum of N Numbers is : " + sum);
	}

	public static void main(String args[])
	{
		SumOfNNum obj = new SumOfNNum();
		obj.CalcSum();
	}
}