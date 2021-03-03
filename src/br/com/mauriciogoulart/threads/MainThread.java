package br.com.mauriciogoulart.threads;

import javax.swing.*;

public class MainThread {

    public static void main(String[] args) throws InterruptedException {


        /*Declaração de uma thread para processamento paralelo (envio de email)*/
        Thread threadEmail = new Thread(thread1);//Objeto do tipo thread
        threadEmail.start();

        /*Declaração de uma thread para processamento paralelo (envio de notas fiscais)*/
        Thread threadNf = new Thread(thread2); //Objeto do tipo thread
        threadNf.setPriority(Thread.MAX_PRIORITY); //Define a prioridade de execução entre as threads
        threadNf.start();

        System.out.println("Processo chegou ao fim!");
        JOptionPane.showMessageDialog(null,"Sistema continua executando para o usuario!");
    }

    /*Metodos Runnable para poder instanciar um objeto thread*/
    private static Runnable thread1 = new Runnable() {
        @Override
        public void run() {

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
    };

    private static Runnable thread2 = new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {

                /*executando tarefa com intervalo de tempo usando Theads*/
                System.out.println("Envio de nota fiscal!!");
                try{
                    Thread.sleep(1000); /*Para o tempo de execução em milisegundos*/
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    };
}
