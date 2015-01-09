package fileProgram;

import java.io.File;

/**
 * This class will do all the actions that have anything to do with accesing or writing a file
 * @author Ylva
 *
 */
public class FileActions {

	/**
	 * This is the file object, is initialized during construction
	 */
	public File currentFile;
	
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
}
