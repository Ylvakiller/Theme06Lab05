package fileProgram;

/**
 * This class will be able to do all the tasks as discussed in the program, that is reading int values from a file, 
 * calculating the lowest and highest number, calculating the average, 
 * and creating a new file with all the numbers only occurring ones and in order from lowest to highest number
 */

/*
 * Descriptions as found on blackboard are saved in the description file in this project folder
 */
public class Runner {

	public static void main(String[] args) {
		FileActions.setReadFile("Read.txt");
		System.out.println(FileActions.fileExcists(FileActions.getReadFile()));
		FileActions.openReadStream();
		while (FileActions.hasNextLine()&&FileActions.hasNextInt()){
		Numbers.processInt(FileActions.readInt());
		}
		FileActions.closeReadStream();
		System.out.println("The largest number is :" + Numbers.getLargestNumber());
		System.out.println("The smallest number is :" + Numbers.getSmallestNumber());
		FileActions.setWriteFile("Write.txt");
		FileActions.openWriteStream();
		Numbers.writeArray();
		FileActions.closeWriteStream();
		System.exit(0);
	}

}
