package br.com.mauriciogoulart.modulo8.classes;

public class Main {

    public static void main(String[] args) {

        /* Objeto ainda não existe na memoria, apenas existe uma referência a classe */

        Aluno aluno1;

        /*- Objeto criado na memoria a partir da palavra reservada "new"
        * - new Aluno(); Esse metodo se chama "instancia" de um objeto.
        * - Aluno aluno2 é uma referencia a classe aluno.*/

        Aluno aluno2 = new Aluno(); /*João*/

        Aluno aluno3 = new Aluno(); /*Pedro*/

        Aluno aluno4 = new Aluno(); /*Alex */

        Aluno aluno5 = new Aluno("Maria"); /*Criando o objeto utilizando o construtor com parametros*/

        Aluno aluno6 = new Aluno("José", 50); /*Objeto criado passando multiplos dados por parametro para o construtor*/
    }
}
