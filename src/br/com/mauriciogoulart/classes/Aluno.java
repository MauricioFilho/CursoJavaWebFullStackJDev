package br.com.mauriciogoulart.classes;

import br.com.mauriciogoulart.constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa {

    //atributos da classe aluno

    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;

    /*Cria uma lista de disciplinas*/
    private List<Disciplina> disciplinas = new ArrayList<>();

    /*Construtores*/

    /*Construtor vazio*/
    public Aluno() { /*Cria os dados na memoria (Por padrão é criado automaticamente pelo java)*/

    }

    /*Construtor com parametros*/

    public Aluno(String nomeAluno){
        super();
        this.setNome(nomeAluno);
    }

    /*Construtor com multiplos parametros*/

    public Aluno(String dataMatricula, String nomeEscola, String serieMatriculado, List<Disciplina> disciplinas) {
        this.dataMatricula = dataMatricula;
        this.nomeEscola = nomeEscola;
        this.serieMatriculado = serieMatriculado;
        this.disciplinas = disciplinas;
    }

    /*Metodos Getters e Setters*/
    /*Setters é para adicionar valores para os atribulos*/
    /*Getters é para resgatar os valores adicionados no Setter*/
    /*this referencia a classe*/



    public List<Disciplina> getDisciplina() {
        return disciplinas;
    }

    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplinas = disciplina;
    }

    /*Métodos*/

    //Retorna a média das notas

    public double getMedia(){

        double somaTotal = 0.0;

        for (Disciplina disciplina:
             disciplinas) {
             somaTotal += disciplina.getNota();
        }

        return somaTotal / disciplinas.size();
    }

    //Verifica o resultado final do aluno

    public String getAlunoAprovado(){

        if(getMedia() >= 50){
            if(getMedia() >= 70 ) {
                return StatusAluno.APROVADO;
            } else {
                return StatusAluno.RECUPERACAO;
            }
        }else {
            return StatusAluno.REPROVADO;
        }
    }

    //Metodo toString



    //Metodos equals e hashcode


}

