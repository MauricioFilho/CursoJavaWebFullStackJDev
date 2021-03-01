package br.com.mauriciogoulart.classes;

import br.com.mauriciogoulart.constantes.StatusAluno;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@ToString(callSuper = true) //callSuper = true se existir superClasse herdada,
// includeFieldNames = true para incluir os campos da propria classe.
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

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public List<Disciplina> getDisciplina() {
        return disciplinas;
    }

    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplinas = disciplina;
    }

    /*Métodos*/

    //Retorna a média das notas

    public double getMedia(){

        double mediaNotas = 0.0;
        int pos = 0;

        for (Disciplina disciplina:
                disciplinas) {
            mediaNotas += disciplina.getMediaNotas();
        }

        return mediaNotas;
    }

    /*METHODS*/

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

    //sobrescrevendo metodos da classe pai
    @Override
    public boolean pessoaMaioridade() {
        return getIdade() >= 21;
    }
    //metodo abstrato herdado da classe pai
    @Override
    public double salario() {
        return 1250;
    }

    public String msgMaioridade(){

        return this.pessoaMaioridade() ? "O aluno é maior de idade" : "O aluno é menor de idade";
    }
}

