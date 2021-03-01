package br.com.mauriciogoulart.excecoes;

/*Implementando uma classe de exceções personalizadas*/
public class ExcecaoProcessarNota extends  Exception { //extende a classe Exception

    //Ao instanciar a classe obriga a receber uma mensagem personalizada por parametro
    public ExcecaoProcessarNota(String erro){
        super("Erro ao processar arquivos de nota -> " + erro);
    }


}
