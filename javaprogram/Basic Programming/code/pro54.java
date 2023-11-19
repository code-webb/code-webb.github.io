import java.util.Scanner;

class TestPositiveNegative
{
	void CheckNumber()
	{
		System.out.println(" ");
		System.out.println("Program to test a Number is Positive or Negative");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scan.nextInt();

		if(num > 0)
		{
			System.out.println("It is a Positive Number");
		}
		else if(num < 0)
		{
			System.out.println("It is a Negative Number");
		}
		else
		{
			System.out.println("Number is zero");
		}
	}
	public static void main(String args[])
	{
		TestPositiveNegative t = new TestPositiveNegative();
		t.CheckNumber();
	}
}