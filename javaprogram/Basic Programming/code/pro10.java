import java.util.Scanner;

class SumOfD
{
	void CalSum()
	{
		int num, sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Program to find sum of digits of a integer");
		System.out.print("Enter a number : ");
		num = s.nextInt();
		int temp = num;
		while(temp != 0)
		{
			int digit = temp % 10;
			sum += digit;
			temp /= 10;
		}		
		System.out.println("Sum of Digits : " + sum);
	}
	public static void main(String args[]){
		SumOfD obj = new SumOfD();
		obj.CalSum();
	}
}