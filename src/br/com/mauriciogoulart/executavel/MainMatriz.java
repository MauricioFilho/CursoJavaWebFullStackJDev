package br.com.mauriciogoulart.executavel;

public class MainMatriz {

    public static void main(String[] args) {

        /*Declaração de uma matriz*/
        int notas[][] = new int[2][3];

        /*Adicionando elementos na matriz*/
        notas[0][0] = 90;
        notas[0][1] = 80;
        notas[0][2] = 70;

        notas[1][0] = 60;
        notas[1][1] = 50;
        notas[1][2] = 40;

        /*Recuperando valores de uma matriz*/
        for (int i = 0; i < notas.length; i++) {
            {
                for (int j = 0; j < notas[i].length; j++) {
                    System.out.println("Notas do aluno -> " + notas[i][j]);
                }
            }
        }
    }
}
