package br.com.mauriciogoulart.executavel;

public class MainArray {

    public static void main(String[] args) {

        /*Array pode ser de qualquer tipo de dados e objetos*/

        double[] elementos = {9.5, 8.3}; //inserindo valores diretamente na criação do atribulo

        double[] notas = new double[4]; //precisa definir quantidade de posições

        notas[0] = 7.8;
        notas[1] = 8.7;
        notas[2] = 9.7;
        notas[3] = 9.9;

        /* Percorrendo os dados de um array e imprimindo na tela*/
        for (int i = 0; i < notas.length; i++) {

            System.out.println(notas[i]);
        }

        for (double nota:notas
             ) {

            System.out.println(nota);

        }
    }
}
