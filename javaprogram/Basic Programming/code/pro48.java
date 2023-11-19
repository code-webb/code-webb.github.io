
import java.util.Scanner;

class BattingA
{
	void BattingAverage()
	{
		System.out.println(" ");
		System.out.println("Program to calculate Batting Average");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the total runs scored : ");
		int score = scan.nextInt();
		System.out.print("Enter the number of time dismissed : ");
		int dismiss = scan.nextInt();

		if(dismiss > 0)
		{
			double BattingAverage = score / dismiss;
			System.out.println("Batting Average is : " + BattingAverage);
		}
		else
		{
			System.out.println("Batting Average N/A (Player has not been dismissed) ");
		}
	}
	public static void main(String args[])
	{
		BattingA obj = new BattingA();
		obj.BattingAverage();
	}
}