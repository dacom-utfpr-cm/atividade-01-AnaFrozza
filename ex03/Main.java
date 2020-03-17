/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01.ex03;

/**
 *
 * @author anafrozza
 */

/**
 * Faça um programa que envia interrupções para as threads dos exercicios anteriores
 * As threads devem fazer o tratamento dessas interrupções e realizar uma finalização limpa.
 */
public class Main {
    public static void main(String[] args) {
        ThreadInterompe thread = new ThreadInterompe();
        thread.start();
        
        System.out.println("Concluido!");
    }
}
