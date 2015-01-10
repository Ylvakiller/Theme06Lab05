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
	private File currentFile;
	/**
	 * This will be the stream, has to be opened
	 */
	private Scanner readStream;
	/**
	 * Default constructor, sets the file to open to be test.txt in the project folder
	 */
	public FileActions(){
		currentFile = new File("test.txt");
	}
	
	/*
	 * Will check if the file in this object exists
	 */
	public boolean fileExcists(){
		return currentFile.exists();
	}
	/**
	 * Will open the stream, should only be run if fileExcists() returns true
	 */
	public void openStream(){
		try {
			readStream = new Scanner(currentFile);
		} catch (FileNotFoundException e) {
			System.err.println("Error opening the file!");
			e.printStackTrace();
		}
	}
	/**
	 * This will close the input stream, should always be run after you are done reading the file
	 */
	public void closeStream(){
		readStream.close();
	}
	
	/**
	 * Will read an int from the input stream and return that
	 * Hint, make sure that there is an int type next in the stream with the hasNextInt method
	 * @return the next int on the input stream
	 */
	public int readInt(){
		return readStream.nextInt();
	}
	/**
	 * Will check if there is another line in the stream
	 * @return true if there is another line in the stream
	 */
	public boolean hasNextLine(){
		return readStream.hasNextLine();
	}
	/**
	 * Will check if the stream has an int value as next token,
	 * Should only be run if the hasNextLine() method returns true
	 * @return true if the next token is an int
	 */
	public boolean hasNextInt(){
		return readStream.hasNextInt();
	}
	
	
	
	
	
	
}
