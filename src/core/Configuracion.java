/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package core;
import java.util.LinkedList;
import java.io.IOException;

/**
 *
 * @author czero
 */
public class Configuracion {
    
    private String fileName = "data.dat";
    
    public Configuracion(){
        try{
            LinkedList<String> rawData = new FileReader("./resources/config.dat").getContent();
            fileName = rawData.get(0);
        }catch(IOException ex){}
        
    }
    
    public String getFileName(){
        return fileName;
    }
}
