package com.tracchis.saopayne;


import java.io.File;
import java.io.IOException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saopayne
 */
public class FileUtils {
    
    private FileUtils(){
        
    }
    
    public static String getSafeDir(String dir){
        
        if (dir.lastIndexOf(File.separator) == dir.length() -1){
            dir = dir.substring(0, dir.length()-1);
        }
        return dir;
    }
    
    public static File getSafeFile(String dirPath, String fileName) throws IOException{
        
        dirPath = getSafeDir(fileName);
        File file = new File(dirPath);
        file.mkdirs();
        File newFile = new File(dirPath+File.separator+fileName);
        if (newFile.exists() == false){
            newFile.createNewFile();
        }
        return newFile;
    }
    
    
}
