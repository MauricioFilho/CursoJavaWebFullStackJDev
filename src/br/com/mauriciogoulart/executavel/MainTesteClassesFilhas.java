package br.com.mauriciogoulart.executavel;

import br.com.mauriciogoulart.classes.Aluno;
import br.com.mauriciogoulart.classes.Diretor;
import br.com.mauriciogoulart.classes.Secretario;

/*Classe para testar herança das classes aluno, diretor e secretario*/
public class MainTesteClassesFilhas {

    public static void main(String[] args) {

        //metodos get e set herdados da classe pai "Pessoa"
        Aluno aluno = new Aluno();
        aluno.setNome("Mauricio Goulart");
        System.out.println("Aluno ->" + aluno.toString());

        Diretor diretor = new Diretor();
        diretor.setNome("Priscila Costa");
        System.out.println("Diretora -> " + diretor.toString());

        Secretario secretario = new Secretario();
        secretario.setNome("Fabiani Martinhago");
        System.out.println("Secretária -> " + secretario.toString());

    }
}
