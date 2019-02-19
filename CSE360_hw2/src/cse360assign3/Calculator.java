/**
 * NAME: Christian Quintana
 * Class ID: 527
 * Student ID: 1210967807
 * Assignment: Assignment 2
 * 
 * Description: The following file contains the finished calculator 
 * program. The program contains methods to display total value, add,
 * subtract, multiply, divide, and show history. The add, subtract, multiply, and divide
 * methods are now functional and perform their respective operations. 
 * The getHistory displays all of the previously entered values and operations 
 * as a string and continues to add to the history string.
 */


package cse360assign3;

/**
 * 
 * @author cquin
 *
 * The class Calculator performs basic arithmetic operations such as
 * add, subtract, multiply, and divide. 
 * There is also a getHistory method that returns previously entered expressions.
 * The constructor initializes the total count to zero.
 * getTotal method returns the current value of the total variable.
 * Add, subtract, multiply, divide methods perform their respective operations.
 * getHistory method returns a string that contains all of the previously entered
 * operations that were entered it the calculator program.
 *
 */

public class Calculator 
{

	private int total;	// class variable total
	private String history = "0 ";	// String class variable history
	
	/**
	 * Class constructor instantiates class with total value of 0.
	 * @param none
	 * 
	 */
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * getTotal method returns value of total variable.
	 * 
	 * 
	 * @return total.
	 */
	
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * add method adds parameter value to total value.
	 * Concatenates add operator and value to history string.
	 * 
	 * @param value
	 */
	
	public void add (int value) 
	{
		total += value;
		
		history += "+ " + value + " "; // concatenate operation and value to history string
	}
	
	/**
	 * subtract method subtracts parameter value from the total value.
	 * Concatenates subtract operator and value to history string.
	 * 
	 * @param value
	 */
	
	public void subtract (int value) 
	{
		total -= value;
		
		history += "- " + value + " "; // concatenate operation and value to history string
	}
	
	/**
	 * multiply method multiplies parameter value to the total value.
	 * Concatenates multiplier operator and value to history string.
	 * 
	 * @param value
	 */
	
	public void multiply (int value) 
	{
		total *= value;
		
		history += "* " + value + " ";	// concatenate operation and value to history string
	}
	
	/**
	 * divide method divides parameter value by the total value.
	 * If the parameter value is zero, the total value becomes zero.
	 * Concatenates division operator and value to history string.
	 * 
	 * @param value
	 */
	
	public void divide (int value) 
	{
		if(value == 0)	// total becomes 0 when divisor parameter is 0
		{
			total = 0;
		}
		else	// if not, divide total by parameter value
		{
			total /= value;
		}
		
		history += "/ " + value + " "; // concatenate operation and value to history string
	}
	
	/**
	 * getHistory returns a history string.
	 * The history string is a class variable that is added to in each
	 * respective method whenever it is called.
	 * Each method has access to the history string and concatenates its 
	 * operator and value to the history string.
	 * 
	 * @return history
	 */
	
	public String getHistory () 
	{
		
		return history;
	}
}