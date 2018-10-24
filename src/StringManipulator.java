import java.util.Scanner;

/*
 * Tyler Wassel
 * Period 5
 * String Manipulator
 */
public class StringManipulator
{

	public static void main(String[] args)
	{
		Scanner user = new Scanner (System.in);
		System.out.println("Please enter a string: ");
		String str = user.nextLine();
		int length = str.length();
		char start = str.charAt(0);
		char end = str.charAt(length-1);
		System.out.print("The length of your string is " + length + "The first letter of your string is " + start + "The last letter of your string is " +end);

	}

}
