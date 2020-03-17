/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01.ex04;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anafrozza
 */
public class ThreadMonitora extends Thread {

    List<Thread> threads;

    public ThreadMonitora(List<Thread> threads) {
        this.threads = threads;
    }

    @Override
    public void run() {
        for (Thread thread : threads) {
            thread.start();
        }

        try {
            Thread t = new ThreadMonitora(threads);
            t.start();
            Thread.sleep(1000);

            List<Thread> lista = this.threads;
            while (true) {
                for (Thread thread : lista) {
                    if (thread.isInterrupted()) {
                        System.out.println("Thread: " + thread.getName() + " gerou interopição");
                        Thread.sleep(1000);
                    }
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadMonitora.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Deu ruim: "+ex);
        }
    }
}
