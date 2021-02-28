package br.com.mauriciogoulart.classes;

import java.util.Objects;

public class Pessoa {

    private String nome;
    private int idade;
    private String dataNascimento;
    private String RegistroGeral;
    private String numeroCpf;
    private String nomePai;
    private String nomeMae;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade, String dataNascimento, String registroGeral, String numeroCpf, String nomePai, String nomeMae) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        RegistroGeral = registroGeral;
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
        return RegistroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        RegistroGeral = registroGeral;
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
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", RegistroGeral='" + RegistroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                '}';
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
