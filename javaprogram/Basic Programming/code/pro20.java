
class SumOfPrimeN
{
	public static void main(String args[])
	{
		System.out.println("program to sum of the first 100 prime numbers");
		int i, j, sum = 0;
		for(i = 2; i <=100; i++)
		{
			boolean isPrime = true;
			for(j = 2; j <= Math.sqrt(i); j++)
			{
				if(i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				sum += i;
				System.out.println("Prime number is : " + i) ;
			}
		}
		System.out.println("Sum of Prime numbers is : " + sum);
	}
}