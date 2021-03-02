package br.com.mauriciogoulart.executavel;

import br.com.mauriciogoulart.classes.Aluno;
import br.com.mauriciogoulart.classes.Disciplina;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Banco de dados");

        double[] notasAluno2 = {1,2,3,4};
        disciplina2.setNotas(notasAluno);

        aluno.getDisciplina().add(disciplina2);

        /*Recuperando dados de um array*/

        for (Disciplina d:aluno.getDisciplina()
             ) {

            System.out.println("Disciplina do aluno -> " + d.getDisciplina());

            double maiorNota = 0.0;
            for (int i = 0; i < disciplina.getNotas().length; i++) {

                System.out.println("As notas da disciplina são -> " + d.getNotas()[i]);

            }
        }
        //Arrays de objetos
        Aluno[] arrayAluno = {aluno};

        /*Objeto aluno recebendo os dados do array*/
        for (Aluno alunos: arrayAluno
             ) {

            System.out.println(alunos.getNome());
            //Percorre todas as disciplinas
            for (Disciplina d: alunos.getDisciplina()
                 ) {

                System.out.println(d.getDisciplina());
                //percorre todas as notas da disciplinae
                for (double notasDisciplina:d.getNotas()
                     ) {

                    System.out.println(notasDisciplina);
                }
            }
        }

        /*Conversão de array para lista e lista para array*/

        String[] listaALunos = {"Mauricio", "Priscila", "Fabiani"};

        /*Array para lista*/
        List<String> list = Arrays.asList(listaALunos);

        for (String alunos:list
             ) {
            System.out.println(alunos);
        }

        /*Lista para array*/
        String[] listToArray = list.toArray(new String[3]);

        for (String s: listToArray
             ) {
            System.out.println(s);
        }
    }
}
