/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linee;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author russo.salvatore
 */
public class stampa2 implements Runnable{
boolean attiva=true;
int a=100;
    @Override
    public void run() {
       while(attiva==true){
          if(a!=49){
              try {
                  System.out.println("    "+a);
                  a--;
                  sleep(500);
              } catch (InterruptedException ex) {
                  Logger.getLogger(stampa2.class.getName()).log(Level.SEVERE, null, ex);
              }
          }else{
            termina();  
          } 
           
       }
    }
    public void termina(){
      attiva=false;  
    }
}
   
