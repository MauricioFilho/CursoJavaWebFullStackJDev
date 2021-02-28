package br.com.mauriciogoulart.executavel;

import br.com.mauriciogoulart.classes.Aluno;
import br.com.mauriciogoulart.classes.Diretor;
import br.com.mauriciogoulart.classes.Secretario;

/*Classe para testar herança das classes aluno, diretor e secretario*/
public class MainTesteClassesFilhas {

    public static void main(String[] args) {

        //metodos herdados da classe pai "Pessoa"
        Aluno aluno = new Aluno();
        aluno.setNome("Mauricio Goulart");
        aluno.setIdade(21);

        System.out.println("Aluno ->" + aluno.toString());
        System.out.println(aluno.pessoaMaioridade() + " - " + aluno.msgMaioridade());

        Diretor diretor = new Diretor();
        diretor.setNome("Priscila Costa");
        diretor.setIdade(50);

        System.out.println("Diretora -> " + diretor.toString());
        diretor.pessoaMaioridade();

        Secretario secretario = new Secretario();
        secretario.setNome("Fabiani Martinhago");
        secretario.setIdade(34);

        System.out.println("Secretária -> " + secretario.toString());
        secretario.pessoaMaioridade();
    }
}
