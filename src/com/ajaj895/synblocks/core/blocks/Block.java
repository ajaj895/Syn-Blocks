/*
 * Created on: May 23, 2020 
 * Author: Evan Colwell
 * 
 * Description: A block object is going to be an object that contains little code snippets and together will combine to make whole simple programs.
*/

package com.ajaj895.synblocks.core.blocks;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author Evan
 */
public class Block {
    
    private String value;//The actual code value of the block.
    private JLabel label;//The label of the block.
    private int type;//The type of block
    private Color color;//Color of the block. Type will determine color. Color will also change if there is an error in the code
    
    private int xCoord;//X coordinate for the block's position.
    private int yCoord;//Y coordinate for the block's position.
    
    public Block(){
        
    }
    
    public Block(String val, JLabel lab, int ty, int x, int y){
        setVal(val);
        setLab(lab);
        setType(ty);
        setX(x);
        setY(y);
    }
    
    public int setX(int newX){
        return chgX(newX);
    }
    
    public int setY(int newY){
        return chgY(newY);
    }
    
    private int chgX(int newX){ xCoord = newX; return xCoord; }
    
    private int chgY(int newY){ yCoord = newY; return yCoord; }
    
    protected String setVal(String inStr){
        //String newValue = ""; If things break, work on this.
        //parse in string for breakable text like \ or "
        /*
        for(int i = 0; i < inStr.length(); i++){
            String nextChar = inStr.substring(i, i+1);
            /*
            switch(nextChar){
                case "\""://Quotes
                    newValue += nextChar;
                    break;
                case "\\"://Forward slash
                    newValue += nextChar;
                    break;
                case 
            }
            */
            
        /*    
        }
        */
        value = inStr;
        return value;
    }
    
    protected JLabel setLab(JLabel inLab){
        label = inLab;
        return label;
    }
    
    protected int setType(int inType){
        type = inType;
        return type;
    }
    
    protected Color setColor(Color inColor){
        color = inColor;
        return color;
    }
    
    /**
     * getX() returns the x Coordinate
     * @return int: the X coordinate
     */
    public int getX(){ return xCoord; }
    
    /**
     * getY() returns the y Coordinate
     * @return int: the Y coordinate
     */
    public int getY(){ return yCoord; }
    
    /**
     * getValue() returns the value contained by the block
     * @return String: the value of the block
     */
    public String getValue(){ return value; }
    
    /**
     * getLabel() returns a Javax Swing JLabel
     * @return JLabel: the JLabel of the block
     */
    public JLabel getLabel(){ return label; }
    
    /**
     * getType() returns a int that represents types of the blocks
     * @return int: the type of the block (0, 1, 2, 3)
     */
    public int getType(){ return type; }
    
    /**
     * getColor() returns the Java AWT Color of the block
     * @return Color: returns the color of the block
     */
    public Color getColor(){ return color; }
    
}
