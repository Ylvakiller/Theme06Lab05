package fileProgram;

import java.math.BigInteger;
import java.util.ArrayList;

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
	private static ArrayList<Integer> sortedInt = new ArrayList<Integer>();
	/**
	 * The total amount of numbers that this class has come across
	 */
	private static int amountOfNumbers;
	/**
	 * the sum of all the numbers that this class has come across
	 */
	private static BigInteger total = BigInteger.ZERO;

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
		if (sortedInt.isEmpty()){
			sortedInt.add(toAdd);//add first element to the array
		}else{
			while(sortedInt.get(i)<toAdd&&i+1<sortedInt.size()){	//this will go to the place in the array where the number to add has to be
				i++;
			}
			if (sortedInt.get(i)!=toAdd){//this will check if the number is already in the array
				while (i<sortedInt.size()){	//this should move all the variables up one place in the arraylist until the array is done
					int temp = sortedInt.get(i);
					sortedInt.set(i, toAdd);
					toAdd = temp;
					i++;
				}
				sortedInt.add(toAdd);	//add the last number to the arrayList, as such increasing the size by one
			}
		}

	}
}
