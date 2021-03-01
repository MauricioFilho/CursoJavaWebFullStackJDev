package br.com.mauriciogoulart.interfaces;

public interface PermitirAcesso {
    /*Em uma interface devese declarar o metodo sem sua execucao*/
    boolean autenticar(String usuario, String senha);

    boolean autenticar();
}
