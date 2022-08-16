package ProjetoPoo.src.ex_ponto.ex_heranca;

public class Livro {
    private String titulo;
    private String editora;
    private String dtLancamento;


    public Livro(String titulo){
        this.titulo = titulo;
    }
    

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getDtLancamento() {
        return this.dtLancamento;
    }

    public void setDtLancamento(String dtLancamento) {
        this.dtLancamento = dtLancamento;
    }

}
