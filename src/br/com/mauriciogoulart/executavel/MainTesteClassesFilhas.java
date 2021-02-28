package br.com.mauriciogoulart.executavel;

import br.com.mauriciogoulart.classes.Aluno;
import br.com.mauriciogoulart.classes.Diretor;
import br.com.mauriciogoulart.classes.Pessoa;
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
        System.out.println("Salario do aluno -> " + aluno.salario());

        Diretor diretor = new Diretor();
        diretor.setNome("Priscila Costa");
        diretor.setIdade(50);

        System.out.println("Diretora -> " + diretor.toString());
        System.out.println(diretor.pessoaMaioridade());
        System.out.println("Salario da diretora -> " + diretor.salario());

        Secretario secretario = new Secretario();
        secretario.setNome("Fabiani Martinhago");
        secretario.setIdade(34);

        System.out.println("Secretária -> " + secretario.toString());
        System.out.println(aluno.pessoaMaioridade());
        System.out.println("Salario da secretária -> " + secretario.salario());

        /*EXEMPLO DE POLIMORFISMO*/
        teste(aluno);
        teste(diretor);
        teste(secretario);


    }

    /*METODO PARA TESTE DE POLIMORFISMO*/
    public static void teste(Pessoa pessoa) {

        System.out.println(
                "Nome da pessoa -> " + pessoa.getNome()
                        + "\nSalario -> " + pessoa.salario()
        );
    }
}
