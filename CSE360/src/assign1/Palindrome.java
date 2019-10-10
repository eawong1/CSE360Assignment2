package assign1;
//Name: Edward Wong
//ID: 1212270642
//Assignment #: 1

/*
 * This class takes in a String as a parameter and checks to see if it is
 * a palindrome, a word that reads the same forwards and backwards. This 
 * program does that by taking the front character and comparing with the back
 * character to see if they match, if they do then it continues inward, so the
 * 2nd character is compared to the 2nd to last character now. This continues until 
 * the program reaches the center of the string and if the characters at the front
 * have all matched the characters in the back, then it is a palindrome. This 
 * program also ignores all whitespaces and punctuations, and if the string does not 
 * contain any alphanumeric values, it is considered a palindrome. 
 */


public class Palindrome 
{
	private String toString; //will eventually hold the testString
	
	//testString is the String that is going to be tested to see if it is a palindrome
	public Palindrome(String testString) 
	{
		//the toString variable now stores the testString 
		toString = testString; 
	}
	
	//checks to see if the String is a palindrome
	public boolean isPalindrome()
	{
		//variable will be true if it is a palindrome
		//and will be false if it is not 
		boolean isPalidrome = true; 
		
		//makes the String all lowercase so casing doesn't matter
		toString = toString.toLowerCase();
		
		//these two lines get rid of white spaces and punctuations/nonalphanumeric chars
		toString = toString.replaceAll(" ", "");
		toString = toString.replaceAll("\\p{Punct}", "");
		
		//used to keep track of whether the loop is done checking or not 
		boolean doneCheck = false; 
		
		//gets the length of the String to have as one of the stopping conditions 
		int charCount = toString.length(); 
		
		//keeps track of the index of the character starting from 0
		int charIndexStart = 0; 
		
		//keeps track of the index of the character starting from the end
		int charIndexEnd = charCount - 1;
		
		//keeps track of how many characters from the front match the chars from the back
		int match = 0; 
		
		//if the String is empty it is a palindrome
		if(toString.isEmpty())
		{
			doneCheck = true;
		}
		
		//keeps looping through the string to check if it is a palindrome until
		//the program knows for sure that the String isn't a palindrome or once 
		// the program knows the String is for sure a palindrome
		while(isPalidrome && !doneCheck)
		{
			//if the char at the front of the String doesn't match the char at the back of 
			//the String then it is not a palindrome
			if(toString.charAt(charIndexStart) != toString.charAt(charIndexEnd))
			{
				isPalidrome = false; 
			}
			else
			{
				//increments everytime a char from the front matches one from the back
				match++; 
			}
			
		
			//if the amount of characters that match is equal to half the string length 
			//then it is a palindrome and the program is done checking
			if(match == charCount / 2) 
			{
				doneCheck = true; //program is done checking to see if it is a palidrome 
			}
			charIndexStart++; //increments the front index
			charIndexEnd--; //decrements the back index
		}
		
		
		//returns true if it is a palindrome and false if it is not 
		return isPalidrome; 
	}
}
