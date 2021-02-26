package br.com.mauriciogoulart.modulo8.classes;

public class Aluno {

    //atributos da classe aluno

    int idade;

    String nome;
    String dataNascimento;
    String registroGeral;
    String numeroCpf;
    String nomeMae;
    String nomePai;
    String dataMatricula;
    String nomeEscola;
    String serieMatriculado;

    /*Construtores*/

    /*Construtor vazio*/
    public Aluno(){ /*Cria os dados na memoria (Por padrão é criado automaticamente pelo java)*/

    }

    /*Construtor com parametros*/
    public Aluno(String nomePadrao){
        nome = nomePadrao;
    }

    /*Construtor com multiplos parametros*/
    public Aluno(String nomePadrao, int idadePadrao){
        nome = nomePadrao;
        idade = idadePadrao;
    }

}
