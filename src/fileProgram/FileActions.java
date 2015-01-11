package fileProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This class will do all the actions that have anything to do with accesing or writing a file
 * @author Ylva
 *
 */
public class FileActions {

	/**
	 * This is the object from which to read
	 */
	private static File readFile;

	/**
	 * This is the object from which to write
	 */
	private static File writeFile;
	/**
	 * The read stream, has to be opened
	 */
	private static Scanner readStream;
	/**
	 * This is the write stream
	 */
	private static PrintWriter writeStream;
	/**
	 * Default constructor, sets the file default files
	 */
	public FileActions(){
		readFile = new File("Read.txt");
		writeFile = new File("Write.txt");
	}
	
	/**
	 * @return the readFile
	 */
	public static File getReadFile() {
		return readFile;
	}

	/**
	 * @return the writeFile
	 */
	public static File getWriteFile() {
		return writeFile;
	}

	/**
	 * Sets the location of the file from which you need to read
	 * @param fileLocation the location of the file to be read from, has to exist
	 */
	public static void setReadFile(String fileLocation){
		readFile = new File(fileLocation);
	}
	/**
	 * Sets the location of the file to which you want to write
	 * @param fileLocationthe location of the file to be written to
	 */
	public static void setWriteFile(String fileLocation){
		writeFile = new File(fileLocation);
	}
	/*
	 * Will check if the file in this object exists
	 */
	public static boolean fileExcists(File fileToCheck){
		return fileToCheck.exists();
	}
	/**
	 * Will open the stream, should only be run if fileExcists() returns true
	 */
	public static void openReadStream(){
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
	public static void closeReadStream(){
		readStream.close();
	}
	
	public static void openWriteStream(){
		try {
			writeStream = new PrintWriter(writeFile);
		} catch (FileNotFoundException e) {
			System.err.println("Error opening the file!");
			e.printStackTrace();
		}
	}
	/**
	 * Will close the write stream, should always be done when you are ready with the file
	 */
	public static void closeWriteStream(){
		writeStream.close();
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
	/**
	 * Will write an int to the write stream, and then end the line
	 * @param toWrite the int to write
	 */
	public static void writeInt(int toWrite){
		writeStream.println(toWrite);
	}
	
	
	
	
	
	
}
