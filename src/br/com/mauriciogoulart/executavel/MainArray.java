package br.com.mauriciogoulart.executavel;

import br.com.mauriciogoulart.classes.Aluno;
import br.com.mauriciogoulart.classes.Disciplina;

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

        /*testando arrays*/
        Aluno aluno = new Aluno();
        aluno.setNome("Mauricio");
        aluno.setNomeEscola("JDev Treinamentos");

        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Curso Java");

        double[] notasAluno = {1,2,3,4};
        disciplina.setNotas(notasAluno);

        aluno.getDisciplina().add(disciplina);

    }
}
