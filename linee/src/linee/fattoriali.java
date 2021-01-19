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
public class fattoriali implements Runnable{
boolean attiva=true;
int a;
long somma;
int b;
public fattoriali(int b){
    this.b=b;
}
    @Override
    public void run() {
        if(b==0){
            somma=5;
            a=4;
        }else{
            somma=6;
            a=5;
        }
       while(attiva=true){
           if(b==0){
               somma=somma*a;
                   System.out.println(somma);
                   a--;
               try {
                   sleep(500);
               } catch (InterruptedException ex) {
                   Logger.getLogger(fattoriali.class.getName()).log(Level.SEVERE, null, ex);
               }
           if(a==1){
              stop();
           }
           
       }else{
             somma=somma*a;
                   System.out.println("               "+somma);
                   a--;
               try {
                   sleep(500);
               } catch (InterruptedException ex) {
                   Logger.getLogger(fattoriali.class.getName()).log(Level.SEVERE, null, ex);
               }
           if(a==1){
              stop();
           }
           }  
       }
    }
      
       
    public void stop(){
        attiva=false;
    }
    } 



