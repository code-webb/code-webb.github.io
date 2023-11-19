
import java.util.Scanner;

class PowerOfN
{
	void CalcPower()
	{
		System.out.println(" ");
		System.out.println("Program to calculate Power of a Number");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scan.nextInt();
		System.out.print("Enter Power of a number : ");
		int power = scan.nextInt();
		int i, result = 1;

		for(i = 0; i < power; i++)
		{
			result *= num;
		}
		System.out.println("Result is : " + result);
	}
	public static void main(String args[])
	{
		PowerOfN obj = new PowerOfN();
		obj.CalcPower();
	}
}