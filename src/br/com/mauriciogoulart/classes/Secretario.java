package br.com.mauriciogoulart.classes;

import lombok.ToString;

import java.util.Objects;

@ToString(callSuper = true) //callSuper = true se existir superClasse herdada,
                            // includeFieldNames = true para incluir os campos da propria classe.
public class Secretario extends Pessoa {

    private String registro;
    private String nivelCargo;
    private String experiencia;

    public Secretario(String registro, String nivelCargo, String experiencia) {
        this.registro = registro;
        this.nivelCargo = nivelCargo;
        this.experiencia = experiencia;
    }

    public Secretario() {

    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Secretario that = (Secretario) o;
        return Objects.equals(registro, that.registro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registro);
    }
}
