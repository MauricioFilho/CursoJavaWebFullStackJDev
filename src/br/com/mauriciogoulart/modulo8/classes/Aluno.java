package br.com.mauriciogoulart.modulo8.classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    //atributos da classe aluno

    private int idade;

    private String nome;
    private String dataNascimento;
    private String registroGeral;
    private String numeroCpf;
    private String nomeMae;
    private String nomePai;
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;


    /*cria uma lista de disciplinas*/
    private List<Disciplina> disciplinas = new ArrayList<>();




    /*Construtores*/

    /*Construtor vazio*/
    public Aluno() { /*Cria os dados na memoria (Por padrão é criado automaticamente pelo java)*/

    }

    /*Construtor com parametros*/
    public Aluno(String nomePadrao) {
        nome = nomePadrao;
    }

    /*Construtor com multiplos parametros*/
    public Aluno(String nomePadrao, int idadePadrao) {
        nome = nomePadrao;
        idade = idadePadrao;
    }

    /*Metodos Getters e Setters*/
    /*Setters é para adicionar valores para os atribulos*/
    /*Getters é para resgatar os valores adicionados no Setter*/
    /*this referencia a classe*/

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public List<Disciplina> getDisciplina() {
        return disciplinas;
    }

    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplinas = disciplina;
    }

    /*metodos*/

    //retorna a média das notas

    public double getMedia(){

        double somaTotal = 0.0;

        for (Disciplina disciplina:
             disciplinas) {
             somaTotal += disciplina.getNota();
        }

        return somaTotal / disciplinas.size();
    }

    //verifica o resultado final do aluno

    public String getAlunoAprovado(){

        if(getMedia() >= 50){
            if(getMedia() >= 70 ) {
                return "O Aluno está aprovado!";
            } else {
                return "O Aluno está em recuperação!";
            }
        }else {
            return "O Aluno aprovou!";
        }
    }

}

