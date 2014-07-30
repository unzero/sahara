/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package core;

/**
 *
 * @author unzero
 */
public class Score {
    
    private int total;
    
    public Score(){
        total = 0;
    }
    
    public void plus(){
        total++;
    }
    
    public String toString(){
        return ""+total;
    }
    
}
