package fileProgram;

import java.math.BigInteger;

/**
 * This class is meant to do all the calculations for different parts of this file program
 * @author Ylva
 *
 */
public class Numbers {
	/**
	 * The smallest number that this instance of this class has come across
	 */
	private int smallestNumber;
	/**
	 * The largest number that this instance of this class has come across
	 */
	private int largestNumber;
	/**
	 * An array with all the numbers sorted from low to high, with no number occurring twice
	 */
	private int[] sortedint;
	/**
	 * The total amount of numbers that this class has come across
	 */
	private int amountOfNumbers;
	/**
	 * the sum of all the numbers that this class has come across
	 */
	private BigInteger total;
	
	/**
	 * This method will process the given int
	 * @param unprocessed
	 */
	public void processInt(int unprocessed){
		if (unprocessed<smallestNumber){
			smallestNumber = unprocessed;
		}
		if (unprocessed>largestNumber){
			largestNumber = unprocessed;
		}
		amountOfNumbers++;
		total.add(BigInteger.valueOf(unprocessed));
	}
	
	/**
	 * This will add the given input to the array if that number is not already in the array
	 * @param toAdd the number to add to the array
	 */
	private void addIntToArray(int toAdd){
		
	}
}
