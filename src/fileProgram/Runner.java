package fileProgram;

import gui.GUI;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;



/*
 * Descriptions as found on blackboard are saved in the description file in this project folder
 */
/**
 * This class will open the GUI which will do all the other actions
 * @author Ylva
 *
 */
public class Runner {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //turn off metal's use of bold fonts
                UIManager.put("swing.boldMetal", Boolean.FALSE); 
                GUI.createAndShowGUI();
            }
        });
	}

}
