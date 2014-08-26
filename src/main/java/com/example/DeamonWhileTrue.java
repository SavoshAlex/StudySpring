package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;


public class DeamonWhileTrue {
  
    
    public static void main(String[] args) {
        String[] strs = new String[0];
    }
    
    
//    public static void main(String[] args) {
//        boolean tru = true;
//        while(tru);
//        
//        Thread thread = new Thread(new DaemonThread());
//        thread.setDaemon(true);
//        thread.start();
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(DeamonWhileTrue.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
}


class DaemonThread implements Runnable{

    public void run() {
        while(true){
            System.out.println("I'm alive");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(DaemonThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}