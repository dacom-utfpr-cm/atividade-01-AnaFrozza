/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01.ex02;

/**
 *
 * @author anafrozza
 */

/**
 * Faça uma thread que realize a leitura de um arquivo 
 * texto com frases e exiba as frases a cada 10 segundos.
 */

public class Main {
    public static void main(String[] args) {
        ThreadLeitura thread = new ThreadLeitura();
        thread.start();
        
        System.out.println("Concluido!");
    }
 
}
