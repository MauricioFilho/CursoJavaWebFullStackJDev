package br.com.mauriciogoulart.executavel;

import br.com.mauriciogoulart.classes.Aluno;
import br.com.mauriciogoulart.classes.Disciplina;
import br.com.mauriciogoulart.classes.Secretario;
import br.com.mauriciogoulart.constantes.StatusAluno;
import br.com.mauriciogoulart.util.FuncaoAutenticacao;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MainEscola {

    public static void main(String[] args) {

        //Validação de acesso
        String login = JOptionPane.showInputDialog("Informe o login");
        String senha = JOptionPane.showInputDialog("Informe a senha");

        try {
            lerArquivo();
            if (new FuncaoAutenticacao(new Secretario(login, senha)).autenticar()) {

                //Cria lista de alunos
                List<Aluno> alunosList = new ArrayList<>();

                /*Hashmap é uma lista que identifica valores(V) a partir de uma chave (K)*/
                HashMap<String, List<Aluno>> alunosMap = new HashMap<>();

                //Automatizando o processo de inserção de dados na lista de alunos
                for (int i = 0; i < 5; i++) {

                    /* Objeto ainda não existe na memoria, apenas existe uma referência a classe */
                    //Aluno aluno1;

                    /*- Objeto criado na memoria a partir da palavra reservada "new"
                     * - new Aluno(); Esse metodo se chama "instancia" de um objeto.
                     * - Aluno aluno2 é uma referencia a classe aluno.*/
                    Aluno aluno = new Aluno();

                    /*Manipulando dados dos objetos*/
                    aluno.setNome(JOptionPane.showInputDialog(null, "Informe o nome do " + (i + 1) + "º aluno.")); //setando valores no objeto aluno pelo metodo set
                    aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a idade do aluno")));

                    System.out.println("Nome do aluno é: " + aluno.getNome()); //recuperando os valores setados pelo metodo set utilizando o metodo get
                    System.out.println("A idade do aluno é: " + aluno.getIdade());
                    //Adicionando elementos em uma lista

                    //Adicionando de forma estatica
                    Disciplina disciplina1 = new Disciplina();
                    disciplina1.setDisciplina("Banco de dados");
                    disciplina1.setNotas(90);

                    //aluno.getDisciplina().add(disciplina1); //adicionado a lista

                    Disciplina disciplina2 = new Disciplina();
                    disciplina2.setDisciplina("Matematica");
                    disciplina2.setNotas(80);

                    //aluno.getDisciplina().add(disciplina2); //adicionado a lista

                    Disciplina disciplina3 = new Disciplina();
                    disciplina3.setDisciplina("Geografia");
                    disciplina3.setNotas(97);

                    //aluno.getDisciplina().add(disciplina3); //adicionado a lista

                    Disciplina disciplina4 = new Disciplina();
                    disciplina4.setDisciplina("Java Web");
                    disciplina4.setNotas(70);

                    //aluno.getDisciplina().add(disciplina4); //adicionado a lista


                    /*Adicionando elementos em uma lista de disciplinas de forma dinamica*/
                    for (int pos = 1; pos <= 1; pos++) {

                        String nomeDisciplina = JOptionPane.showInputDialog("Digite nome da disciplina " + pos);
                        double notaDisciplina = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + pos));

                        Disciplina disciplina = new Disciplina();

                        disciplina.setDisciplina(nomeDisciplina);
                        disciplina.setNotas(notaDisciplina);

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
                //Cria 3 listas de alunos por status dentro do map alunosMap utilizando os atributos staticos como chave
                alunosMap.put(StatusAluno.APROVADO, new ArrayList<>());
                alunosMap.put(StatusAluno.REPROVADO, new ArrayList<>());
                alunosMap.put(StatusAluno.RECUPERACAO, new ArrayList<>());

                //Separa os alunos por seu status
                for (Aluno aluno : alunosList
                ) {
                    if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
                        alunosMap.get(StatusAluno.APROVADO).add(aluno);
                    } else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                        alunosMap.get(StatusAluno.RECUPERACAO).add(aluno);
                    } else {
                        alunosMap.get(StatusAluno.REPROVADO).add(aluno);
                    }
                }
                //Imprime a quantidade de alunos por status
                System.out.println(
                        "Quantidade de alunos aprovados: " + alunosMap.get(StatusAluno.APROVADO).size() +
                                "\nQuantidade de alunos em recuperação: " + alunosMap.get(StatusAluno.RECUPERACAO).size() +
                                "\nQuantidade de alunos reprovados: " + alunosMap.get(StatusAluno.REPROVADO).size()
                );


                //foreach percorrendo toda a lista e imprimindo os dados
                for (Aluno aluno : alunosList
                ) {
                    //remove aluno por nome
                    if (JOptionPane.showConfirmDialog(null, "Deseja remover o aluno: " + aluno.getNome()) == 0) {
                        alunosList.remove(aluno);
                    } else { //Imprime os dados na tela
                        System.out.println("Detalhes -> " + aluno);
                        System.out.println("Média aluno: " + aluno.getMedia());
                        System.out.println("Situação do aluno: " + aluno.getAlunoAprovado());
                    }
                }
                //Percorrendo a lista utilizando o for e o index de cada elemento
                for (int pos = 0; pos < alunosList.size(); pos++) {

                    Aluno aluno = alunosList.get(pos); //recupera o aluno conforme o index (pos) passado por parametro.
                    System.out.println("Nome aluno: " + aluno.getNome()); //imprime o nome do aluno respectivamente

                    //Trocar aluno por posição
                    if (aluno.getNome().equalsIgnoreCase("Mauricio")) {

                        //Cria novo aluno a ser trocado
                        Aluno alunoNovo = new Aluno("João");
                        Disciplina disciplina = new Disciplina(55, "Matematica");
                        alunoNovo.getDisciplina().add(disciplina);

                        //Adiciona elemento por posição
                        alunosList.set(pos, alunoNovo);

                        //Atribui o novo aluno da lista ao objeto aluno
                        //aluno = alunosList.get(pos);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario ou senha invalidas!");
            }
            /*Multiplos catch de captura de erros*/
        }catch (NumberFormatException e){

            /*Imprime o erro no console*/
            e.printStackTrace();

            /*Imprime a mensagem do erro ou causa*/
            System.out.println("Mensagem -> " +  e.getMessage());

            /*Percorrendo uma pilha de erros e imprimindo utilizando metodo da classe exception*/
            for (int i = 0; i < e.getStackTrace().length; i++) {

                System.out.println("Classe de erro: " + e.getStackTrace()[i].getClass()); //Retorna a classe do erro
                System.out.println("Metodo de erro: " + e.getStackTrace()[i].getMethodName()); //Retorna o metodo do erro
                System.out.println("Linha de erro: " + e.getStackTrace()[i].getLineNumber()); //Retorna a linha em que ocorreu erro
                System.out.println("Tipo de exceção: " +  e.getClass().getName()); //Retorna qual tipo de exceção ocorreu
            }

            JOptionPane.showMessageDialog(null, "Erro na conversão de números -> " + e.getMessage());
        /* tipos de erros comuns durante o desenvolvimento */
        }catch(NullPointerException e){

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro NullPointerException -> " + e.getMessage());

        } catch (FileNotFoundException e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro FileNotFoundException -> " + e.getMessage());

        }/*catch (ExcecaoProcessarNota e){ //exceção personalizada.

            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Erro Exceção personalizada -> " + e.getMessage());

        }*/finally { /* Sempre executado ao final do processo, ocorrendo erro ou não  (Não é obrigatório) -
                         Normalmente utilizado para executar alguma tarefa após a realização de um bloco de códigos*/

            JOptionPane.showMessageDialog(null, "Obrigado por aprender Java!");

        }
    }
    /*metodo de teste para ler um arquivo e lançar uma exceção personalizada para o bloco de código*/
    public static void lerArquivo() throws FileNotFoundException{ //throws na assinatura do metodo joga a exceção para
                                                                // a parte do bloco em que o metodo está sendo executado
            File arquivoExceptionTeste = new File("arquivo.txt");
            Scanner scan = new Scanner(arquivoExceptionTeste);

    }
}
