/*
 * Created on: May 24, 2020 
 * Author: Evan Colwell
 * 
 * Description: 
*/

package com.ajaj895.synblocks.core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Evan
 */
public class FileHandler {
    
    public FileHandler(){
        
    }
    
    public int saveFile(String fileName, String data){
        File file = new File(fileName);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch(IOException e){
                System.err.println("File can not be saved.");
                return 1;//Standard error code
            }
        }
        
        FileWriter fw;
        
        try { 
            fw = new FileWriter(file);
            fw.write(data);
            fw.flush();
            fw.close();
        } catch(IOException e){
            System.err.println("File can not be written to, opened, or found.");
            return 1;
        }
        
        return 0;//Standard non-error code.
        
    }
    
    public boolean exists(String name){
        File file = new File(name);
        return file.exists();
    }
}
