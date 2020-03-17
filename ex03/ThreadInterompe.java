/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01.ex03;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anafrozza
 */
public class ThreadInterompe extends Thread {

    @Override
    public void run() {
        ThreadEx01 thread01 = new ThreadEx01();
        ThreadEx02 thread02 = new ThreadEx02();

        try {
            thread01.start();
            Thread.sleep(2000);
            System.out.println("Interrompendo a Thread do exercicio 01");
            thread01.interrupt();
            
            thread02.start();
            Thread.sleep(5000);
            System.out.println("Interrompendo a Thread do exercicio 02");
            thread02.interrupt();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadInterompe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
