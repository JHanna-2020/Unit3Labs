//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grade
{
	public static String getLetterGrade( int numGrade )
	{
		String letGrade="";
		if(numGrade>=90){
			letGrade="A";
		}else if(numGrade>=80 && numGrade<90){
			letGrade="B";
		}else if(numGrade>=75 && numGrade<80){
			letGrade = "C";
		}else if(numGrade>=70 && numGrade<75){
			letGrade = "D";
		}else{
			letGrade= "F";
	}
		return numGrade+" is an "+letGrade;
	}
}