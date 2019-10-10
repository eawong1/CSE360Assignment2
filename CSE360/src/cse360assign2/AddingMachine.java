package cse360assign2;

import java.util.ArrayList;

/**
 * 
 * @author Edward Wong
 * Student ID: 1212270642
 * Class ID: 70641
 * Assignment #: 2
 * 
 * Link to/instructions for repository: 
 * https://github.com/eawong1/CSE360Assignment2/tree/master/CSE360/src/cse360assign2
 * Ignore the Test.java class. It was used to test my code.
 * 
 * 
 * This program is able to take in integer values and either add or subtract them. 
 * This program also keeps track of all the operations done using the toString() method
 * and can be cleared when wanting to do new operations. 
 */


public class AddingMachine 
{

	private int total; //keeps track of the total number
	//used to keep track of the values being passed for the toString method
	private ArrayList<String> values; 
	
	/**
	 * This constructor initializes the instance variable "total" and the ArrayList 
	 * "values" and adds the initial total, 0, to the ArrayList
	 * to 0. 
	 */
	
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
		values = new ArrayList<String>(); 
		values.add(""+total);  //""+total to make total a string
	}
	
	/**
	 * This method returns the total value after calculations are complete. 
	 * @return
	 */
	public int getTotal () 
	{
		return total;
	}
	
	
	/**
	 * This method takes in an integer parameter called "value" and adds to the total.
	 * It also adds the value passed in to the ArrayList
	 * @param value
	 */
	public void add (int value) 
	{
		String operations = " + " + value;
		values.add(operations); //adds parameter into the ArrayList
		total = total + value; //adds the value to the total
	}
	
	
	/**
	 * This method takes in an integer parameter called "value" and subtracts it 
	 * from the total. It also adds the value passed in to the ArrayList
	 * @param value
	 */
	public void subtract (int value) 
	{
		String operations = " - " + value;
		values.add(operations); //adds parameter into the ArrayList
		total = total - value; //subtracts the value to the total
	}
	
	/**
	 * This method keeps track of all the operations that have been done
	 */
	public String toString () 
	{
		String operations = ""; //the String that is going to be returned
		
		//concatenates every value in the "values" ArrayList to the String "operations"
		for(int index = 0; index < values.size(); index++)
		{
			operations = operations + values.get(index);
		}
		
		return operations; //returns all the operations as a String
	}
	
	/**
	 * Resets the total and the "values" ArrayList
	 */
	public void clear() 
	{
		total = 0; //resets "total"
		values.clear(); //resets "values"
		values.add(""+total);//re-adds zero to the ArrayList
	}
}
