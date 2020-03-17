/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01.ex02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anafrozza
 */
public class ThreadLeitura extends Thread {

    @Override
    public void run() {
        
        File arquivo = new File("/home/anafrozza/NetBeansProjects/AtividadesProg/src/atividade01/ex02/arquivo.txt");

        try {
            if (arquivo.exists()) {
                FileReader fr = new FileReader(arquivo);
                BufferedReader br = new BufferedReader(fr);

                while (br.ready()) {
                    String linha = br.readLine();
                    Thread.sleep(10000);
                    System.out.println(linha);
                }

                br.close();
                fr.close();

            }
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(ThreadLeitura.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Deu ruim");
        }

    }
}
