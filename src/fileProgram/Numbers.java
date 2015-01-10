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
	private static int[] sortedInt;
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
		addIntToArray(unprocessed);
	}
	
	/**
	 * This will add the given input to the array if that number is not already in the array
	 * @param toAdd the number to add to the array
	 */
	private static void addIntToArray(int toAdd){
		int i = 0;
		while(sortedInt[i]<toAdd&&i<sortedInt.length){	//this will go to the place in the array where the number to add has to be
			i++;
		}
		if (sortedInt[i]!=toAdd){//this will check if the number is already in the array
			while (i<sortedInt.length){	//this should move all the variables up one place in the array until the array is done
				int temp = sortedInt[i];
				sortedInt[i] = toAdd;
				toAdd = temp;
				i++;
			}
			sortedInt[i] = toAdd;	//add the last number to the array, as such increasing the size by one
		}
		
	}
}
