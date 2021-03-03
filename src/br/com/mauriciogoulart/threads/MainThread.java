package br.com.mauriciogoulart.threads;

import javax.swing.*;

public class MainThread {

    public static void main(String[] args) throws InterruptedException {


        /*Declaração de uma thread para processamento paralelo*/
        new Thread(){
            @Override
            public void run() { //run() executa o bloco de codigo dentro da tread
                /*Bloco a ser executado em paralelo*/
                for (int i = 0; i < 10; i++) {

                    /*executando tarefa com intervalo de tempo usando Theads*/
                    System.out.println("Envio de email!!");
                    try{
                        Thread.sleep(1000); /*Para o tempo de execução em milisegundos*/
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }.start(); //.start() executa a tread

        System.out.println("Processo chegou ao fim!");
        JOptionPane.showMessageDialog(null,"Sistema continua executando para o usuario!");
    }
}
