/*
 * Created on: May 23, 2020 
 * Author: Evan Colwell
 * 
 * Description: 
*/

package com.ajaj895.synblocks.core.blocks;

import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author Evan
 */
public class DropdownBlock extends Block {
    
    JComboBox<String> dropdownBox;
    
    public DropdownBlock(){
        
    }
    
    public DropdownBlock(JComboBox<String> drop, String val, JLabel lab, int ty, int leftX, int rightX, int topY, int botY){
        
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
    
    private JComboBox<String> setDropdown(JComboBox<String> newCombo){
        dropdownBox = newCombo;
        return dropdownBox;
    }
    
    public String getDropdown(){
        return dropdownBox.getItemAt(dropdownBox.getSelectedIndex());
    }

}
