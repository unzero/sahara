package database;

import java.util.LinkedList;
import java.io.IOException;
import core.Configuracion;
import core.FileReader;
//DEFINED CLASS
import core.Kanji;

public class Conexion {

    /*CLASS FIELDS*/
    private LinkedList<Kanji> kanji_list;
    private LinkedList<String> all_lectures;

    /*PUBLIC METHODS*/
    public Conexion(Configuracion cn) throws IOException {
        kanji_list = new LinkedList<Kanji>();
        all_lectures = new LinkedList<String>();
        open(cn.getFileName());
    }

    public Kanji get(int i) {
        return kanji_list.get(i);
    }

    public String get_lecture(int i) {
        return all_lectures.get(i);
    }

    public int size() {
        return kanji_list.size();
    }

    public int total_lectures() {
        return all_lectures.size();
    }

    private void open(String path) throws IOException{
        LinkedList<String> rawData = new FileReader("./resources/"+path).getContent();
        for(String el : rawData){
            Kanji newKanji = new Kanji(el);
            kanji_list.add(newKanji);
            for(String tmp : newKanji.get_lectures()){
                if(all_lectures.indexOf(tmp)==-1)all_lectures.add(tmp);
            }
        }
    }
    
}
