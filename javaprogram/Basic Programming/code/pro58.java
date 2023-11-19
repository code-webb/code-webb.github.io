
class NaturalNumber
{
	void PrintNaturalNumbers()
	{
		System.out.println(" ");
		System.out.println("PROGRAM TO PRINT FIRST FIVE NATURAL NUMBERS");
		System.out.print("First Five Natural Numbers are : ");
		
		int i;

		for(i = 1; i <= 5; i++)
		{
			System.out.println(   " ");
			System.out.print(i + " ");
		}
	}
	public static void main(String args[])
	{
		NaturalNumber obj = new NaturalNumber();
		obj.PrintNaturalNumbers();
	}
}