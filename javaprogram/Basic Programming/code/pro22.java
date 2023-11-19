
import java.util.Arrays;

class CountOddEArr
{
	void countElements()
	{
		int[] arr = {40,12,67,80,70,13,19};
		int i, odd = 0, even = 0;

		for(i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
        
		System.out.println(" ");
		System.out.println("program to count the number of even and odd elements in a given array");
                System.out.println(" ");

		System.out.println("Elements of array : " + Arrays.toString(arr));
		System.out.println("Total Odd Elements in array : " + odd + "\nTotal Even Elements in array : " + even);
	}

	        public static void main(String args[])
	        {
		      CountOddEArr c = new CountOddEArr();
		      c.countElements();
	        }
}