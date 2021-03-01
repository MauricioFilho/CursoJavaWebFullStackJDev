package br.com.mauriciogoulart.classes;

import lombok.ToString;
import java.util.Objects;
@ToString
public class Disciplina {

    private double[] notas = new double[4];
    private String disciplina;

    public Disciplina()
    {

    }

    public Disciplina(double[] nota, String disciplina) {
        this.notas = nota;
        this.disciplina = disciplina;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    /*METHODS*/

    public double getMediaNotas(){

        double somaTotalNotas = 0.0;

        for (int i = 0; i < notas.length; i++) {

            somaTotalNotas += notas[i];

        }
        return somaTotalNotas / notas.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Objects.equals(disciplina, that.disciplina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disciplina);
    }
}
