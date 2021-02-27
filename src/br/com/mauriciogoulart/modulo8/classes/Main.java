package br.com.mauriciogoulart.modulo8.classes;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        /* Objeto ainda não existe na memoria, apenas existe uma referência a classe */

        Aluno aluno1;

        /*- Objeto criado na memoria a partir da palavra reservada "new"
        * - new Aluno(); Esse metodo se chama "instancia" de um objeto.
        * - Aluno aluno2 é uma referencia a classe aluno.*/

        Aluno aluno = new Aluno(); /*João*/

        /*Manipulando dados dos objetos*/
        aluno.setNome("João"); //setando valores no objeto aluno pelo metodo set
        System.out.println("Nome do aluno2 é: " + aluno.getNome()); //recuperando os valores setados pelo metodo set utilizando o metodo get

        Aluno aluno3 = new Aluno(); /*Pedro*/

        Aluno aluno4 = new Aluno(); /*Alex */

        Aluno aluno5 = new Aluno("Maria"); /*Criando o objeto utilizando o construtor com parametros*/

        Aluno aluno6 = new Aluno("José", 50); /*Objeto criado passando multiplos dados por parametro para o construtor*/

        //Adicionando elementos em uma lista

         //Adicionando de forma estatica

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setDisciplina("Banco de dados");
        disciplina1.setNota(90);

        //aluno.getDisciplina().add(disciplina1); //adicionado a lista

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Matematica");
        disciplina2.setNota(80);

        //aluno.getDisciplina().add(disciplina2); //adicionado a lista

        Disciplina disciplina3 = new Disciplina();
        disciplina3.setDisciplina("Geografia");
        disciplina3.setNota(97);

        //aluno.getDisciplina().add(disciplina3); //adicionado a lista

        Disciplina disciplina4 = new Disciplina();
        disciplina4.setDisciplina("Java Web");
        disciplina4.setNota(70);

        //aluno.getDisciplina().add(disciplina4); //adicionado a lista


        /*Adicionando elementos em uma lista de forma dinamica*/

        for (int i = 1; i <= 4; i++) {

            String nomeDisciplina = JOptionPane.showInputDialog("Digite nome da disciplina " + i);
            double notaDisciplina = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + i)) ;

            Disciplina disciplina = new Disciplina();

            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(notaDisciplina);

            aluno.getDisciplina().add(disciplina);
        }

        System.out.println("Média aluno: " + aluno.getMedia());
        System.out.println("Situação do aluno: " + aluno.getAlunoAprovado());


    }
}
