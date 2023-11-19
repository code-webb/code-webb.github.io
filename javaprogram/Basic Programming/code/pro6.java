
class Swap
{
	void swap()
	{
		int num1 = 10;
		int num2 = 20;
		int temp;

                System.out.println(" ");
		System.out.println("Program to SWAP TWO NUMBERS");
                System.out.println(" ");
        
		System.out.println("Before Swapping first number is : " + num1);
		System.out.println("Before Swapping Second number is : " + num2);

                System.out.println(" ");
		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("After Swapping first number is : " + num1);
		System.out.println("After Swapping Second number is : " + num2);
	}
	public static void main(String args[]){
		Swap s = new Swap();
		s.swap();
	}
}