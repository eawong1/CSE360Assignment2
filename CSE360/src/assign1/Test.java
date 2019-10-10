package assign1;

public class Test 
{
	public static void main(String [] args)
	{
		Palindrome pal = new Palindrome("@radar");
		if(pal.isPalindrome())
		{
			System.out.println("Is Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
//		char ch = '^';
//		if(Character.isLetterOrDigit(ch))
//		{
//			System.out.println("it is letter or digit");
//		}
//		else if(!Character.isLetterOrDigit(ch))
//		{
//			System.out.println("not letter or digit");
//		}
//		System.out.println("Done");
	}
}
