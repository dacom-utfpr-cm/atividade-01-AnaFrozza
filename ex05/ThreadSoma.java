/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01.ex05;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anafrozza
 */
public class ThreadSoma extends Thread{
    
    public int valor;

    public ThreadSoma(int valor) {
        this.valor = valor;
    }
    
    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(System.in);
            valor = scanner.nextInt();
            Thread.sleep(3000);
            throw new InterruptedException();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadSoma.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Deu ruim: "+ex);
        }

    }
}
