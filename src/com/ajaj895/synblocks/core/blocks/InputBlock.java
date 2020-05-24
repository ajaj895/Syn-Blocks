/*
 * Created on: May 23, 2020 
 * Author: Evan Colwell
 * 
 * Description: 
*/

package com.ajaj895.synblocks.core.blocks;

//import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author Evan
 */
public class InputBlock extends Block {
    
    JTextField inField;
    //Scanner sc;
    
    public InputBlock(){
        
    }
    
    public InputBlock(JTextField txtField, String val, JLabel lab, int ty, int leftX, int rightX, int topY, int botY){
        setTxtField(txtField);
        setVal(val);
        setLab(lab);
        setType(ty);
        /*
        setLeftX(leftX);
        setRightX(rightX);
        setTopY(topY);
        setBotY(botY);
        */
    }
    
    private JTextField setTxtField(JTextField newTxt){
        inField = newTxt;
        return inField;
    }
    
    public String getText(){
        return inField.getText();
    }
    

}
