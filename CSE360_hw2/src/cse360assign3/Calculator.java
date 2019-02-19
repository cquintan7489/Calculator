/**
 * NAME: Christian Quintana
 * Class ID: 527
 * Student ID: 1210967807
 * Assignment: Assignment 2
 * 
 * Description: The following file contains an unfinished calculator
 * program. The program contains methods to display total value, add,
 * subtract, multiply, divide, and show history. The add, subtract, multiply, and divide
 * methods are now functional and perform their respective operations. 
 * The getHistory method is unfinished and blank.
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
 * getHistory method is unfinished and blank
 *
 */

public class Calculator {

	private int total;	// class variable
	
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
	
	public int getTotal () {
		return total;
	}
	
	/**
	 * add method adds parameter value to total value.
	 * 
	 * @param value
	 */
	
	public void add (int value) {
		total += value;
	}
	
	/**
	 * subtract method subtracts parameter value from the total value.
	 * 
	 * @param value
	 */
	
	public void subtract (int value) {
		total -= value;
	}
	
	/**
	 * multiply method multiplies parameter value to the total value.
	 * 
	 * @param value
	 */
	
	public void multiply (int value) {
		total *= value;
	}
	
	/**
	 * divide method divides parameter value by the total value.
	 * If the parameter value is zero, the total value becomes zero.
	 * 
	 * @param value
	 */
	
	public void divide (int value) {
		if(value == 0)	// total becomes 0 when divisor parameter is 0
		{
			total = 0;
		}
		else	// if not, divide total by parameter value
		{
			total /= value;
		}
	}
	
	/**
	 * getHistory method is currently blank
	 * 
	 * @param empty string
	 */
	
	public String getHistory () {
		return "";
	}
}