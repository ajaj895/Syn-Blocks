/*
 * Created on: May 23, 2020 
 * Author: Evan Colwell
 * 
 * Description: A block object is going to be an object that contains little code snippets and together will combine to make whole simple programs.
*/

package com.ajaj895.synblocks.core.blocks;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.MouseInfo;
import javax.swing.JComponent;
import javax.swing.JLabel;

/**
 *
 * @author Evan
 */
public class Block extends JComponent implements MouseListener, MouseMotionListener{
    
    
    private String value;//The actual code value of the block.
    private JLabel label;//The label of the block.
    private int type;//The type of block
    private Color color;//Color of the block. Type will determine color. Color will also change if there is an error in the code
    private Dimension dim;//Dimension to be set.
    /*
    private int leftX;//X coordinate for the leftmost block's position.
    private int rightX;//X coordinate for the rightmost block's position.
    
    private int topY;//Y coordinate for the uppermost block's position.
    private int botY;//Y coordinate for the bottommost block's postition.
    */
    
    public Block(){
        
    }
    
    public Block(String val, JLabel lab, int ty, int leftX, int rightX, int topY, int botY){
        super();
        setVal(val);
        setLab(lab);
        setType(ty);
        //setLeftX(leftX);
        //setRightX(rightX);
        //setTopY(topY);
        //setBotY(botY);
        addMouseListener(this);
    }
    /*
    public int setLeftX(int newX){
        return chgLeftX(newX);
    }
    
    public int setRightX(int newX){
        return chgRightX(newX);
    }
    
    public int setTopY(int newY){
        return chgTopY(newY);
    }
    
    public int setBotY(int newY){
        return chgBotY(newY);
    }
    */
    /*
    private int chgLeftX(int newX){ leftX = newX; return leftX; }
    private int chgRightX(int newX){ rightX = newX; return rightX; }
    
    private int chgTopY(int newY){ topY = newY; return topY; }
    private int chgBotY(int newY){ botY = newY; return botY; }
    */
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
        label.setBackground(color);
        
        return color;
    }
    
    
    /**
     * getX() returns the x Coordinate
     * @return int: the X coordinate
     */
    //public int getLeftX(){ return leftX; }
    
    //public int getRightX(){ return rightX; }
    
    /**
     * getY() returns the y Coordinate
     * @return int: the Y coordinate
     */
    //public int getTopY(){ return topY; }
    
    //public int getBotY(){ return botY; }
    
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
    
    // ### MOUSE LISTENER METHODS ###

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Entered!");//for testing purposes
        this.setColor(Color.BLUE);
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Exited!");//also for testing purposes
        this.setColor(Color.CYAN);
    }

    // ### MOUSE MOTION LISTENER ###
    
    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // ### JComponent ###
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(getWidth(), getHeight());
    }
    
    @Override
    public Dimension getMinimumSize(){
        return getPreferredSize();
    }
    
    @Override
    public Dimension getMaximumSize(){
        return getPreferredSize();
    }
    
}
