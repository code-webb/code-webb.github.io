
import java.util.Scanner;

class ReplaceCharacter
{
	void Replace()
	{
		System.out.println(" ");
		System.out.println("Program to Replace 'd' characters with 'f' characters");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String text = scan.nextLine();
		String replace = text.replaceAll("d","f");
		System.out.println(" ");
		System.out.println("Original String is : " + text);
		System.out.println("Replaced String is : " + replace);
	}
	public static void main(String args[])
	{
		ReplaceCharacter obj = new ReplaceCharacter();
		obj.Replace();
	}
}