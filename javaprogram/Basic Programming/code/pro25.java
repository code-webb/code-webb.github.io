
class SumWithoutA
{
	void SumWithoutArithmetic()
	{
		int num1 = 20, num2 = 20 ;
                System.out.println(" ");
                System.out.println("program to add two numbers without using any arithmetic operators");
                System.out.println("First number is : " + num1);
                System.out.println("Second number is : " + num2);

		while(num1 != 0)
		{
			int carry = (num1 & num2);
			num2 = num2 ^ num1;
			num1 = carry << 1;
		}
        
		System.out.println("Sum of two numbers is : " + num2);
	}
	        public static void main(String args[])
	        {
		      SumWithoutA obj = new SumWithoutA();
		      obj.SumWithoutArithmetic();
	        }
}