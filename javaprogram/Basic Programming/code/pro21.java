
import java.util.Arrays;

class SwapArrayE
{
	void SwapArray()
	{
		System.out.println(" ");
		System.out.println("Program to swap first and last elements of an array and create a new array");
                System.out.println(" ");

		int[] arr = {35,60,10,20,30};
		int[] newarr = new int[arr.length];
		int temp, i;
		System.out.println("Original Array : " + Arrays.toString(arr));

		if(arr.length < 2)
		{
			System.out.println("Swapping is not possible");
		}
		else
		{
			newarr[0] = arr[arr.length - 1];

			for(i = 1; i <= arr.length - 1; i++)
			{
				newarr[i] = arr[i];
			}
			newarr[arr.length - 1] =  arr[0];
			System.out.println("Swapped Array : " + Arrays.toString(newarr));
		}
	}
	        public static void main(String args[])
                {
		    SwapArrayE s = new SwapArrayE();
		    s.SwapArray();
	        }
}