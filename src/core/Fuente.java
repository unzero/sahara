/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package core;

import java.awt.Font;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author unzero
 */
public class Fuente {
    
    private Font ttfBase;
    private int size;
    public Fuente(int size){
        this.size = size;
        try{
             InputStream myStream = new BufferedInputStream(new FileInputStream("./resources/MicroHei.ttc"));
             ttfBase = Font.createFont(Font.TRUETYPE_FONT, myStream);
        }catch(Exception e){
            core.Common.errorMessage();
        }
    }
    
    public Font getFont(){
        if(ttfBase != null){
            return ttfBase.deriveFont(Font.TRUETYPE_FONT,size);
        }
        return null;
    }
    
}
