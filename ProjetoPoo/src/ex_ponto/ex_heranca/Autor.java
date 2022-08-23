package ProjetoPoo.src.ex_ponto.ex_heranca;

import java.time.LocalDate;

public class Autor extends Pessoa {
    private String formacao;
    private int qtoLivros;//nunca armazenar isso


    public Autor(String nome, LocalDate dtNascimento, String endereco, String formacao, int qtoLivros) {
       super(nome, dtNascimento, endereco);
        this.formacao = formacao;
        this.qtoLivros = qtoLivros; 
    }


    public String getFormacao() {
        return this.formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public int getQtoLivro() {
        return this.qtoLivros;
    }

    public void setQtoLivro(int qtoLivro) {
        this.qtoLivros = qtoLivro;
    }

    // @Override
    // public String toString() {
    //     return "Formação: " + this.formacao;
    // }
    

}
