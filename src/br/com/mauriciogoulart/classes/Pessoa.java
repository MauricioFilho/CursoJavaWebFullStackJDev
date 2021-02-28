package br.com.mauriciogoulart.classes;

import lombok.ToString;

import java.util.Objects;

@ToString(includeFieldNames = true)
public class Pessoa {

    //Superclasse costuma ser uma classe mais generica, não reprensenta uma entidade solida.

    private String nome;
    private int idade;
    private String dataNascimento;
    private String registroGeral;
    private String numeroCpf;
    private String nomePai;
    private String nomeMae;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade, String dataNascimento, String registroGeral, String numeroCpf, String nomePai, String nomeMae) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.registroGeral = registroGeral;
        this.numeroCpf = numeroCpf;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(numeroCpf, pessoa.numeroCpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroCpf);
    }
}
