
import java.util.Scanner;

class CountPandIDigits
{
	void Count()
	{
		System.out.println(" ");
		System.out.println("Program to Count Sum of Positive Integer's Digits");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = scan.nextInt();

		if(num > 0)
		{
			int sum = 0;
			int temp = num;
			while(temp != 0)
			{
				int digit = temp % 10;
				sum += digit;
				temp /= 10;
			}		
			System.out.println("Sum of Digits : " + sum);
		}
		else
		{
			System.out.println("It is a Negative Number");
		}
	}
	public static void main(String args[])
	{
		CountPandIDigits obj = new CountPandIDigits();
		obj.Count();
	}
}