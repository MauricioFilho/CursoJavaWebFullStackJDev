package br.com.mauriciogoulart.modulo8.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Disciplina {

    private double nota;
    private String disciplina;

    public Disciplina(){

    }

    public Disciplina(double nota, String disciplina) {
        this.nota = nota;
        this.disciplina = disciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Double.compare(that.nota, nota) == 0 && disciplina.equals(that.disciplina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nota, disciplina);
    }
}
