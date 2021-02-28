package br.com.mauriciogoulart.classes;

import br.com.mauriciogoulart.interfaces.PermitirAcesso;
import lombok.ToString;

import java.util.Objects;

@ToString(callSuper = true) //callSuper = true se existir superClasse herdada,
                            // includeFieldNames = true para incluir os campos da propria classe.
public class Secretario extends Pessoa implements PermitirAcesso {

    /*ATRIBUTES*/
    private String registro;
    private String nivelCargo;
    private String experiencia;

    private String usuario;
    private String senha;

    /*CONSTRUCTORS*/
    public Secretario() {

    }

    public Secretario(String registro, String nivelCargo, String experiencia, String login, String senha) {
        this.registro = registro;
        this.nivelCargo = nivelCargo;
        this.experiencia = experiencia;
        this.usuario = login;
        this.senha = senha;
    }

    /*GETTERS AND SETTERS*/
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    /*METHODS*/
    //metodo abstrato herdado da classe pai
    @Override
    public double salario() {
        return 1670;
    }

    //Metodo para autenticar usuario
    @Override
    public boolean autenticar() {
        return usuario.equals("Admin") && senha.equals("Admin");
    }

    /*HASHCODE AND EQUALS*/
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
