//(c) A+ Computer Science
// www.apluscompsci.com
//Name -
import java.util.Scanner;
public class GradeRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner( System.in );
		System.out.print("Enter your number grade:: ");
		int numGrade = keyboard.nextInt();

		System.out.println( Grade.getLetterGrade( numGrade) );

		//add test cases
	}
}