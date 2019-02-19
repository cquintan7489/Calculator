/**
 * NAME: Christian Quintana
 * Class ID: 527
 * Student ID: 1210967807
 * Assignment: Assignment 2
 * 
 * Description: The following file contains an unfinished calculator
 * program. The program contains methods to display total value, add,
 * subtract, multiply, divide, and show history. These methods are blank
 * for now and will be added later.
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
 * getTotal method returns 0.
 * Add, subtract, multiply, divide, and getHistory methods are blank and unfinished.
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
	 * getTotal method returns value of 0.
	 * 
	 * 
	 * @return 0.
	 */
	
	public int getTotal () {
		return total;
	}
	
	/**
	 * add method is currently blank
	 * 
	 * @param value
	 */
	
	public void add (int value) {
		total += value;
	}
	
	/**
	 * subtract method is currently blank
	 * 
	 * @param value
	 */
	
	public void subtract (int value) {
		total -= value;
	}
	
	/**
	 * multiply method is currently blank
	 * 
	 * @param value
	 */
	
	public void multiply (int value) {
		total *= value;
	}
	
	/**
	 * divide method is currently blank
	 * 
	 * @param value
	 */
	
	public void divide (int value) {
		if(value == 0)
		{
			total = 0;
		}
		else
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