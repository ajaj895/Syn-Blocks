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
    
    public InputBlock(JTextField txtField, String val, JLabel lab, int ty, int x, int y){
        setTxtField(txtField);
        setVal(val);
        setLab(lab);
        setType(ty);
        setX(x);
        setY(y);
    }
    
    private JTextField setTxtField(JTextField newTxt){
        inField = newTxt;
        return inField;
    }
    
    public String getText(){
        return inField.getText();
    }
    

}
