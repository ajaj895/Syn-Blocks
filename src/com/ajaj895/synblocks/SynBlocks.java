// This is the main class for the Syn-Blocks project for the OpenHacks hackathon.
// Written by Evan Colwell, May 23, 2020.
// This program should only just call the GUI, the GUI will handle the interactions with a backend style system handling the blocks and the actual code.
package com.ajaj895.synblocks;

import com.ajaj895.synblocks.gui.Gui;

/**
 *
 * @author Evan Colwell
 */
public class SynBlocks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This is a test");//for testing purposes
        Gui gui = new Gui();//creates the GUI object.
        gui.setVisible(true);//makes the GUI visable.
        
    }
    
}
