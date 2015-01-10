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
	private static int smallestNumber;
	/**
	 * The largest number that this instance of this class has come across
	 */
	private static int largestNumber;
	/**
	 * An array with all the numbers sorted from low to high, with no number occurring twice
	 */
	private static int[] sortedint;
	/**
	 * The total amount of numbers that this class has come across
	 */
	private static int amountOfNumbers;
	/**
	 * the sum of all the numbers that this class has come across
	 */
	private static BigInteger total;
	
	/**
	 * This method will process the given int
	 * @param unprocessed
	 */
	public static void processInt(int unprocessed){
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
	private static void addIntToArray(int toAdd){
		
	}
}
