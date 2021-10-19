//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class StringFirstLetterCheck
{
	public static boolean checkFirstLetter( String word1, String word2 ) {
		String firstLetter1 = word1.substring(0, 1);
		String firstLetter2 = word2.substring(0, 1);
		if (firstLetter1.equals(firstLetter2)) {
			return true;
		}
		return false;

	}

}