/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01.ex05;

/**
 *
 * @author anafrozza
 */

/**
 * Faça uma thread que fica aguardando uma sequência numérica de tamanho 
 * arbitrário digitado por usuário para realizar uma soma
 * Use o join().
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int soma = 0;
        
        System.out.println("Informe um valor: ");
        ThreadSoma thread = new ThreadSoma(soma);
        thread.start();
        
        thread.join();
        
        System.out.println("Concluido!");
        
        System.exit(0);
    }
}
