/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01.ex04;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anafrozza
 */

/**
 * Faça uma thread que monitora um conjunto de threads e exiba quais threads receberam sinais de interrupção.
 */

public class Main {
    public static void main(String[] args) {
        List<Thread> listThreads = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread();
            listThreads.add(thread);
        }
        
        Thread monitora = new Thread(new ThreadMonitora(listThreads));
        monitora.start();
        
        System.out.println("Concluido!");
        System.exit(0);
    }
}
