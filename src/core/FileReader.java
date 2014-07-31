/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package core;

import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author czero
 */
public class FileReader {
    
    LinkedList<String> fileContent;
    
    public FileReader(String path) throws IOException{
        fileContent = new LinkedList<String>();
        read(path);
    }
    
    public int size(){
        return fileContent.size();
    }
    
    public LinkedList<String> getContent(){
        return fileContent;
    }
    
    private void read(String path) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(new FileInputStream(path),"UTF-8"));	
        String line;
        while( (line = buf.readLine() ) != null){	
            fileContent.add(line);
        }
        buf.close();
    }
}
