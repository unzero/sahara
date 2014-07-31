/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

/**
 *
 * @author czero
 */
public class FileWriter {

    public FileWriter(String path,LinkedList<String> data) throws IOException {
        write(path,data);
    }

    private void write(String path,LinkedList<String> data) throws IOException {
        BufferedWriter buf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
        for(String el : data){
            buf.write(el);
        }
        buf.close();
    }

    public void write_lectures() throws IOException {
        /*BufferedWriter buf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./resources/all_lectures.dat"),"UTF-8"));
         for(int x=0;x<all_lectures.size();++x){
         buf.write(all_lectures.get(x)+"\n");
         }
         buf.close();*/
    }

    public void write_p1p() throws IOException {
        /*BufferedWriter buf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./resources/p1p.dat"),"UTF-8"));
         BufferedWriter buf1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./resources/kj.dat"),"UTF-8"));
         for(int x=0;x<kanji_list.size();++x){
         Kanji ac = kanji_list.get(x);
         for(String el : ac.get_lectures()){
         buf.write(ac.get_kanji()+"　"+el+"\n");
                            
         }
         buf1.write(ac.get_kanji()+"\n");
         }
         buf.close();
         buf1.close();*/
    }
}
