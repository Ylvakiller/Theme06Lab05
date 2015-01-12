package gui;
 
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import fileProgram.FileActions;
import fileProgram.Numbers;
 
/**
 * This class hold the whole gui for this program, that is open and save buttons and a log area
 * @author Ylva
 *
 */
@SuppressWarnings("serial")
public class GUI extends JPanel
                             implements ActionListener {
	/**
	 * Newline character, makes things easier to read in the log prints
	 */
    static private final String newline = "\n";
    /**
     * The two buttons
     */
    private static JButton openButton, saveButton;
    /**
     * The log area, this area is what allows the user to see the communications
     */
    public static JTextArea log;
    /**
     * This is the dialog box that allows the user to select a file from his/her computer
     */
    private static JFileChooser fc;
    /**
     * This button disables the save button until a file is opened and processed
     */
    private static boolean started = false;
    /**
     * Constructor, takes care of making the GUI and adding the action listeners etc
     */
    public GUI() {
        super(new BorderLayout());
        //create the log first, because the action listeners need to refer to it.
        log = new JTextArea(5,20);
        log.setMargin(new Insets(5,5,5,5));
        log.setEditable(false);
        JScrollPane logScrollPane = new JScrollPane(log);
        logScrollPane.setPreferredSize(new Dimension(300,400));
        //create a file chooser
        fc = new JFileChooser();
        fc.setCurrentDirectory(new File(System.getProperty("user.dir")));
 
        openButton = new JButton("Open a File...");
        openButton.addActionListener(this); //waits for a button press
 
        saveButton = new JButton("Save a File...");
        saveButton.addActionListener(this); //waits for a button press
        //for layout purposes, put the buttons in a separate panel
        JPanel buttonPanel = new JPanel(); //use FlowLayout
        buttonPanel.add(openButton);
        buttonPanel.add(saveButton);
 
        //add the buttons and the log to this panel.
        add(buttonPanel, BorderLayout.PAGE_START);
        add(logScrollPane, BorderLayout.CENTER);
        log.append("To start please open a file." + newline);
    }
 
    public void actionPerformed(ActionEvent e) {
 
        //handle open button action.
        if (e.getSource() == openButton) {
            int returnVal = fc.showOpenDialog(GUI.this);
 
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                log.append("Opening: " + file.getName() + "." + newline);
                FileActions.setReadFile(file);
                if (FileActions.fileExcists(FileActions.getReadFile())){//make sure that the file is correctly set in the FileActions class
                	
                	log.append("Opened the file, processing." + newline);
                	FileActions.openReadStream();
            		while (FileActions.hasNextLine()&&FileActions.hasNextInt()){
            		Numbers.processInt(FileActions.readInt());
            		}
            		FileActions.closeReadStream();
            		log.append(newline+"The largest number is : " + Numbers.getLargestNumber() + newline);	//these do not end with a . sign because they are numbers and that looked confusing 
            		log.append("The smallest number is : " + Numbers.getSmallestNumber() + newline);
            		log.append("The average is : " + Numbers.calculateAverage() + newline + newline);
            		started = true;
                }
            } else {
                log.append("Open command cancelled by user." + newline);
            }
            log.setCaretPosition(log.getDocument().getLength());
 
        //handle save button action.
        } else if (e.getSource() == saveButton&&started) {
            int returnVal = fc.showSaveDialog(GUI.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                log.append("Saving the data to: " + file.getName() + "." + newline);
                FileActions.setWriteFile(file);
        		FileActions.openWriteStream();
        		Numbers.writeArray();
        		FileActions.closeWriteStream();
        		log.append("Done saving." + newline);
            } else {
                log.append("Save command cancelled by user." + newline);
            }
            log.setCaretPosition(log.getDocument().getLength());
        }
    }
 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    public static void createAndShowGUI() {
        //create and set up the window.
        JFrame frame = new JFrame("NumberFileProgram");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //add content to the window.
        frame.add(new GUI());
 
        //display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
}