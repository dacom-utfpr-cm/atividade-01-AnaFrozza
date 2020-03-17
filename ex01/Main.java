/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01.ex01;

/**
 *
 * @author anafrozza
 */
/**
 * Faça um programa que inicie três threads e, cada thread, espere um tempo
 * aleatório para terminar.
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            ThreadUtil thread = new ThreadUtil();
            thread.start();
        }
        System.out.println("Concluido!");
    }
}
