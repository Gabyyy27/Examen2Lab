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
public class HashTable {
    
    private Entry us;
    
    public void add(String username, long pos){
        Entry newEntry = new Entry(username, pos);
        if (us ==null){
            us = newEntry;
               }else {
            Entry current = us;
            while(current.next !=null){
                   current = current.next;
               }
            current.next=newEntry;
        }
    }
    public void remove (String username){
        if(us == null){
            return;
        }
        if(us.username.equals(us)){
            us = us.next;
            return;
        }
        Entry current = us;
        while (current.next != null && !current.next.username.equals(us)){
            current = current.next;
        }
        if(current.next != null){
            current.next = current.next.next;
            
        }
    }
    public long search(String username){
        Entry current = us;
        while (current != null){
            if (current.username.equals(username)){
                return current.pos;
            }
            current = current.next;
        }
        return -1;
    }

  
}
