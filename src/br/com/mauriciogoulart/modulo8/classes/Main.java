package br.com.mauriciogoulart.modulo8.classes;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Cria lista de alunos
        List<Aluno> alunosList = new ArrayList<Aluno>();

        //Automatizando o processo de inserção de dados
        for (int i = 0; i < 2; i++) {

            /* Objeto ainda não existe na memoria, apenas existe uma referência a classe */

            Aluno aluno1;

            /*- Objeto criado na memoria a partir da palavra reservada "new"
             * - new Aluno(); Esse metodo se chama "instancia" de um objeto.
             * - Aluno aluno2 é uma referencia a classe aluno.*/

            Aluno aluno = new Aluno(); /*João*/

            /*Manipulando dados dos objetos*/

            aluno.setNome(JOptionPane.showInputDialog(null, "Informe o nome do " + (i+1) + "º aluno.")); //setando valores no objeto aluno pelo metodo set
            System.out.println("Nome do aluno é: " + aluno.getNome()); //recuperando os valores setados pelo metodo set utilizando o metodo get

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


            /*Adicionando elementos em uma lista de disciplinas de forma dinamica*/

            for (int pos = 1; pos <= 1; pos++) {

                String nomeDisciplina = JOptionPane.showInputDialog("Digite nome da disciplina " + pos);
                double notaDisciplina = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + pos));

                Disciplina disciplina = new Disciplina();

                disciplina.setDisciplina(nomeDisciplina);
                disciplina.setNota(notaDisciplina);

                aluno.getDisciplina().add(disciplina);
            }

            /*Removendo elementos de uma Lista*/

            int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?"); //caixa de escolha dinamica
            int index = 1;
            //Continua até o usuário selecionar "Não ou Cancelar"
            while (escolha == 0) { //0 = Sim

                String disciplinaRemover = JOptionPane.showInputDialog("Insira a disciplina a ser removida: 1 , 2 , 3 ou 4");
                aluno.getDisciplina().remove(Integer.parseInt(disciplinaRemover) - index); //removendo elemento da lista
                index++;
                escolha = JOptionPane.showConfirmDialog(null, "Deseja remover mais alguma matéria?");
            }

            alunosList.add(aluno); //adiciona o aluno na lista de alunos.
        }

        //foreach percorrendo toda a lista e imprimindo os dados
        for (Aluno aluno: alunosList
        ) {
            //remove aluno por nome
            if(JOptionPane.showConfirmDialog(null,"Deseja remover o aluno: " + aluno.getNome()) == 0) {
                alunosList.remove(aluno);
            } else  { //Imprime os dados na tela
                System.out.println("Detalhes -> " + aluno);
                System.out.println("Média aluno: " + aluno.getMedia());
                System.out.println("Situação do aluno: " + aluno.getAlunoAprovado());
            }
        }
        //Percorrendo a lista utilizando o for e o index de cada elemento
        for(int pos = 0; pos < alunosList.size(); pos++){

            Aluno aluno = alunosList.get(pos); //recupera o aluno conforme o index (pos) passado por parametro.
            System.out.println("Nome aluno: " + aluno.getNome()); //imprime o nome do aluno respectivamente

            //Trocar aluno por posição
            if(aluno.getNome().equalsIgnoreCase("Mauricio")){

                //Cria novo aluno a ser trocado
                Aluno alunoNovo = new Aluno("João");
                Disciplina disciplina = new Disciplina(55, "Matematica");
                alunoNovo.getDisciplina().add(disciplina);

                //Adiciona elemento por posição
                alunosList.set(pos, alunoNovo);

                //Atribui o novo aluno da lista ao objeto aluno
                aluno = alunosList.get(pos);
            }
        }
    }
}
