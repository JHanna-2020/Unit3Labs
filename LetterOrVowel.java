//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class LetterOrVowel
{
	public static boolean check( String s )
	{
		String vowels ="AEIOUaeiou";
		if(vowels.indexOf(s)!=-1){
			return true;
		}
			return false;
	}
}