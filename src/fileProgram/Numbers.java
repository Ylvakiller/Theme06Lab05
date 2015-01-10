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
	 * An array List with all the numbers sorted from low to high, with no number occurring twice
	 * This is made in an ArrayList so that is is easy to expand this with new values, instead of having an array of predetermined length
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
			while(i<sortedInt.size()&&sortedInt.get(i)<toAdd){	//this will go to the place in the array where the number to add has to be
				i++;
			}
			if (i==sortedInt.size()){
				sortedInt.add(toAdd);	//if you are at the end, then add the new value there
			}else{						//if you are not at the end then check if the number is already in the arrayList and otherwise add the number (and move all the other numbers one down)
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

	/**
	 * @return the smallestNumber
	 */
	public static int getSmallestNumber() {
		return smallestNumber;
	}

	/**
	 * @return the largestNumber
	 */
	public static int getLargestNumber() {
		return largestNumber;
	}

	/**
	 * @return the sortedInt
	 */
	public static ArrayList<Integer> getSortedInt() {
		return sortedInt;
	}
	/**
	 * Will print out all the values in the ArrayList
	 */
	public static void printArray(){
		int i = 0;
		while (i<sortedInt.size()){
			System.out.println(sortedInt.get(i));
			i++;
		}
	}
}
