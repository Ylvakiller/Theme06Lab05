package fileProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This class will do all the actions that have anything to do with accesing or writing a file
 * @author Ylva
 *
 */
public class FileActions {

	/**
	 * This is the file object, is initialized during construction
	 */
	private static File readFile;
	/**
	 * This is the file object, is initialized during construction
	 */
	private static File writeFile;
	/**
	 * This will be the stream, has to be opened
	 */
	private static Scanner readStream;
	/**
	 * Default constructor, sets the file to open to be test.txt in the project folder
	 */
	public FileActions(){
		readFile = new File("Read.txt");
		writeFile = new File("Write.txt");
	}
	
	public static void setFile(String fileLocation){
		readFile = new File(fileLocation);
	}
	/*
	 * Will check if the file in this object exists
	 */
	public static boolean fileExcists(){
		return readFile.exists();
	}
	/**
	 * Will open the stream, should only be run if fileExcists() returns true
	 */
	public static void openStream(){
		try {
			readStream = new Scanner(readFile);
		} catch (FileNotFoundException e) {
			System.err.println("Error opening the file!");
			e.printStackTrace();
		}
	}
	/**
	 * This will close the input stream, should always be run after you are done reading the file
	 */
	public static void closeStream(){
		readStream.close();
	}
	
	/**
	 * Will read an int from the input stream and return that
	 * Hint, make sure that there is an int type next in the stream with the hasNextInt method
	 * @return the next int on the input stream
	 */
	public static int readInt(){
		return readStream.nextInt();
	}
	/**
	 * Will check if there is another line in the stream
	 * @return true if there is another line in the stream
	 */
	public static boolean hasNextLine(){
		return readStream.hasNextLine();
	}
	/**
	 * Will check if the stream has an int value as next token,
	 * Should only be run if the hasNextLine() method returns true
	 * @return true if the next token is an int
	 */
	public static boolean hasNextInt(){
		return readStream.hasNextInt();
	}
	
	
	
	
	
	
}
