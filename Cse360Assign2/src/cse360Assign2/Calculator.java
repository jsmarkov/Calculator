/**
 * @author Justin Markovitz
 * Class ID: 469
 * Assignment #2
 * Description: This file describes a calculator object that will be committed using git.
 * The Calculator can do basic operations, return its total, and return the history via a string
 */

package cse360Assign2;

public class Calculator {
	/**
	 * The Calculator class describes an object has an integer total, can perform basic arithmetic on that total, return the total,
	 * and return all the operations done to a specific total in the form of a string
	 */
	private int total;
	private String history;
		
		public Calculator () {
			/**
			 * Constructor for a new Calculator object sets the total to zero and sets history to "0"
			 */
			total = 0;  // not needed - included for clarity
			history = "0";
		}
		
		public int getTotal () {
			/**
			 * getTotal returns the total
			 */
			return total;
		}
		
		public void add (int value) {
			/**
			 * add takes an integer and adds it to the total
			 * it also concatenates history with the addition symbol and the value
			 */
			total = total + value;
			history = history + " + " + value; 
		}
		
		public void subtract (int value) {
			/**
			 * subtract takes an integer and subtracts it from the total
			 * it also concatenates history with the subtraction symbol and the value
			 */
			total = total - value;
			history = history + " - " + value;
		}
		
		public void multiply (int value) {
			/**
			 * multiply takes an integer and multiplies it with the total
			 * it also concatenates history with the multiplication symbol and the value
			 */
			total = total * value;
			history = history + " * " + value;
		}
		
		public void divide (int value) {
			/**
			 * divide takes an integer and divides to total.  If the value is zero, the total is set to zero.
			 * it also concatenates history with the division symbol and the value
			 */
			if(value == 0) {
				total = 0;
			}
			else {
				total = total / value;
			}
			history = history + " / " + value;
			
		}
		
		public String getHistory () {
			/**
			 * getHistory returns, in order, each operation on the total in the form of a string with spaces between
			 * each value and operation
			 */
			return history;
		}
}
