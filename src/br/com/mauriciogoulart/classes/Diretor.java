package br.com.mauriciogoulart.classes;

import java.util.Objects;

public class Diretor extends Pessoa {

    private String registroEducacao;
    private String tempoDirecao;
    private String titulacao;

    public Diretor(String registroEducacao, String tempoDirecao, String titulacao) {
        super();
        this.registroEducacao = registroEducacao;
        this.tempoDirecao = tempoDirecao;
        this.titulacao = titulacao;
    }

    public String getRegistroEducacao() {
        return registroEducacao;
    }

    public void setRegistroEducacao(String registroEducacao) {
        this.registroEducacao = registroEducacao;
    }

    public String getTempoDirecao() {
        return tempoDirecao;
    }

    public void setTempoDirecao(String tempoDirecao) {
        this.tempoDirecao = tempoDirecao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "RegistroEducacao='" + registroEducacao + '\'' +
                ", TempoDirecao='" + tempoDirecao + '\'' +
                ", Titulacao='" + titulacao + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Diretor diretor = (Diretor) o;
        return Objects.equals(registroEducacao, diretor.registroEducacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registroEducacao);
    }
}
