package ProjetoPoo.src.ex_ponto.ex_heranca;

import java.time.LocalDate;
import java.time.Month;

public class TestExHeranca {
    
    public static void main(String[] args) {

        LocalDate dtNascimento = LocalDate.of(2022, Month.JULY, 15);
        
        Autor beto = new Autor("Paulo", dtNascimento,"R:02", "Computação", qtoLivro);
        
        //obejeto livro Poo
        Livro livroPoo = new Livro("ProjetoPoo");
        livroPoo.setEditora("Editora Erica");
        LocalDate dataLancamentoPoo = LocalDate.of(2022, Month.APRIL, 1);
        livroPoo.setDtLancamento(dataLancamentoPoo);

        //objeto livro LP
        Livro livroLP = new Livro("Progrmação");
        livroLP.setDtEditora("Editora Lais");
        LocalDate dataLancamentoLP = LocalDate.of(2022, Month.APRIL, 10);
        livroLP.setDtLancamentoLP(dataLancamentoLP);


        //objeto funcionario
        Funcionario func = new Funcionario();
        func.setNome("Leticia");
        

        //objeto estudante
        Estudante estudante1 = new Estudante();
        estudante1.setNome("Paulo");
        estudante1.setEndereco("R:0123");
        LocalDate dataNascEstudante1 = LocalDate.of(2022, Month.APRIL, 10);
        estudante1.setDtNascimento(dataNascEstudante1);
        estudante1.setRa("123");
        estudante1.setCurso("Computação");
        LocalDate dataInicio = LocalDate.of(2022, Month.APRIL, 25);
        estudante1.setDtInicio(dataInicio);
    }
}
