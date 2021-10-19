//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class StringFirstLetterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner( System.in );
		out.print("Enter word one :: ");
		String word1 = keyboard.nextLine();
		out.print("Enter word Two :: ");
		String word2 = keyboard.nextLine();


		if(StringFirstLetterCheck.checkFirstLetter(word1, word2)==true){
			System.out.println(word1+" has the same first letter as "+ word2);
		}else{
			System.out.println(word1+" does not have the same first letter as "+word2);
		}

	}
}