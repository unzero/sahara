/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package core;

import javax.swing.*;

/**
 *
 * @author unzero
 */
public class Common {
    
    public static void errorMessage(String mes){
        JOptionPane.showMessageDialog(null, mes,"Sahara",JOptionPane.ERROR_MESSAGE);
    }
    
    public static void errorMessage(){
        errorMessage("Ha ocurrido un problema");
    }
    
    public static void message(String mes){
        JOptionPane.showMessageDialog(null, mes,"Sahara",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
