/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01.ex01;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anafrozza
 */
public class ThreadUtil extends Thread {

    @Override
    public void run() {
        Random ran = new Random();
        try {
            int time = ran.nextInt(5000);
            System.out.println("Thread "+Thread.currentThread().getName()+" dormindo por: " + time);
            Thread.sleep(time);
            System.out.println("Thread "+Thread.currentThread().getName()+" Acordou!");
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
