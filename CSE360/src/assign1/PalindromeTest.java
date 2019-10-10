package assign1;
//Name: Edward Wong
//ID: 1212270642
//Assignment #: 1


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest 
{

	@Test
	public void testIsPalindrome() 
	{
		//creates a new Palindrome obj and passing hello as a string
		Palindrome palindrome = new Palindrome("hello");
		//test to see if the isPalindrome method works or not
		//this test should come back as false
		assertTrue(palindrome.isPalindrome());
	}

	@Test
	public void testIsPalindrome1()
	{
		//creates a new Palindrome obj and passing radar as a string
		Palindrome palindrome = new Palindrome ("radar");
		//test to see if the isPalindrome method works or not
		//this test should come back as true
		assertTrue(palindrome.isPalindrome());
	}
	
	@Test
	public void testIsPalindrome2()
	{
		//creates a new Palindrome obj and passing ra dar as a string
		Palindrome palindrome = new Palindrome ("ra dar");
		//test to see if the isPalindrome method works or not
		//this test should come back as true as the method should ignore the whitespace
		assertTrue(palindrome.isPalindrome());
	}
	
	@Test
	public void testIsPalindrome3()
	{
		//creates a new Palindrome obj and passing redder as a string
		Palindrome palindrome = new Palindrome ("redder");
		//test to see if the isPalindrome method works or not
		//this test should come back as true
		assertTrue(palindrome.isPalindrome());
	}
	
	@Test
	public void testIsPalindrome4()
	{
		//creates a new Palindrome obj and passing radar as a string
		Palindrome palindrome = new Palindrome ("*^@#");
		//test to see if the isPalindrome method works or not
		//this test should come back as true as the string contains
		//no alphanumeric characters
		assertTrue(palindrome.isPalindrome());
	}
	
	@Test
	public void testIsPalindrome5()
	{
		//creates a new Palindrome obj and passing redder as a string
		Palindrome palindrome = new Palindrome ("race ca!.r");
		//test to see if the isPalindrome method works or not
		//this test should come back as true as the method should 
		//ignore whitespaces and punctuations 
		assertTrue(palindrome.isPalindrome());
	}
	

}
