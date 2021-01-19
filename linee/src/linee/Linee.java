/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linee;

/**
 *
 * @author russo.salvatore
 */
public class Linee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       stampa a=new stampa();
//       stampa2 b=new stampa2();
//       Thread t1=new Thread(a);
//       Thread t2=new Thread(b);
//       t1.start();
//       t2.start();
fattoriali a1=new fattoriali(1);
fattoriali a2=new fattoriali(0);
       Thread t1=new Thread(a1);
       Thread t2=new Thread(a2);
       t1.start();
       t2.start();
      

    }
    
}
