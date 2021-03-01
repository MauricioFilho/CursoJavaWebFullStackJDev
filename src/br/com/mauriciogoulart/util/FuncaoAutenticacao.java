package br.com.mauriciogoulart.util;

import br.com.mauriciogoulart.interfaces.PermitirAcesso;

/*Controlar as classes que possui interface "PermitirAcesso" implementada */
public class FuncaoAutenticacao {

    private PermitirAcesso permitirAcesso;

    public boolean autenticar(){

        return permitirAcesso.autenticar();

    }
    public FuncaoAutenticacao (PermitirAcesso acesso){
        this.permitirAcesso = acesso;
    }
}
