/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab2.lourdesamador;

/**
 *
 * @author porti
 */
public class Entry {
    
    String username;
    long pos;
    Entry next;
    
    public Entry(String username, long pos){
        this.username=username;
        this.pos=pos;
        this.next=null;
    }
}
