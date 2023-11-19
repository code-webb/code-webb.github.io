
import java.util.Scanner;

class CompoundI
{
	void Calculate()
	{
		System.out.println(" ");
		System.out.println("Program to calculate Compound Interest");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Principal Amount : ");
		double principal = scan.nextDouble();
		System.out.print("Enter Annual Interest : ");
		double interest = scan.nextDouble();
		System.out.print("Enter Time Period : ");
		double time = scan.nextDouble();
		System.out.print("Enter Compound Frequency : ");
		int frequency = scan.nextInt();
		double calc = principal * Math.pow(1 + interest / frequency, frequency * time);
		double com_interest = calc - principal;
		System.out.println(" ");
		System.out.print("Compound Interst is : " + com_interest);
		System.out.println(" ");
	}
	public static void main(String args[])
	{
		CompoundI obj = new CompoundI();
		obj.Calculate();
	}
}