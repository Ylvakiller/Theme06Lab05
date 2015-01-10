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
		/*FileActions test = new FileActions();
		System.out.println(test.fileExcists());
		test.openStream();
		System.out.println(test.readInt());
		System.out.println(test.readInt());
		test.closeStream();*/
		FileActions.setFile("test.txt");
		System.out.println(FileActions.fileExcists());
		FileActions.openStream();
		Numbers.processInt(FileActions.readInt());
		Numbers.printArray();
		System.out.println();
		Numbers.processInt(FileActions.readInt());
		Numbers.printArray();
		System.out.println();
		Numbers.processInt(FileActions.readInt());
		Numbers.printArray();
		System.out.println();
		Numbers.processInt(FileActions.readInt());
		Numbers.printArray();
		System.out.println();
		Numbers.processInt(FileActions.readInt());
		Numbers.printArray();
		System.out.println();
		Numbers.processInt(FileActions.readInt());
		Numbers.printArray();
		System.out.println();
		Numbers.processInt(FileActions.readInt());
		Numbers.printArray();
		System.out.println();
		Numbers.processInt(FileActions.readInt());
		Numbers.printArray();
		System.out.println();
		Numbers.processInt(FileActions.readInt());
		Numbers.printArray();
		System.out.println();
		Numbers.processInt(FileActions.readInt());
		Numbers.printArray();
		System.out.println();
		FileActions.closeStream();
	}

}
