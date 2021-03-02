package br.com.mauriciogoulart.threads;

public class MainThread {

    public static void main(String[] args) throws InterruptedException {



        for (int i = 0; i < 10; i++) {

            /*executando tarefa com intervalo de tempo usando Theads*/

            Thread.sleep(1000); /*Para o tempo de execução em milisegundos*/
            System.out.println("Envio de email!!");

        }
    }
}
