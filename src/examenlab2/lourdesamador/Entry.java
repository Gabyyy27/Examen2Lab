/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab2.lourdesamador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author porti
 */
public class Entry {
    
    String username;
    long pos;
    Entry next;
    List<Trophy> trophies;
    
    public Entry(String username, long pos){
        this.username=username;
        this.pos=pos;
        this.next=null;
        this.trophies= new ArrayList<>();
    }
}
