package ProjetoPoo.src.ex_ponto.ex_heranca;

import java.time.LocalDate;

public class Autor extends Pessoa {
    private String formacao;
    private int qtoLivro;//nunca armazenar isso


    public Autor(String nome, LocalDate dtNascimento, String endereco, String formacao, int qtoLivro) {
       super(nome, dtNascimento, endereco);
        this.formacao = formacao;
        this.qtoLivro = qtoLivro; 
    }


    public String getFormacao() {
        return this.formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public int getQtoLivro() {
        return this.qtoLivro;
    }

    public void setQtoLivro(int qtoLivro) {
        this.qtoLivro = qtoLivro;
    }

    @Override
    public String toString() {
        return "Formação: " + this.formacao;
    }
    

}
