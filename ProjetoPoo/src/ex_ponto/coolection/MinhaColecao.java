package ProjetoPoo.src.ex_ponto.coolection;

import java.util.ArrayList;
import java.util.List;
import ProjetoPoo.src.ex_ponto.ex_heranca.Livro;

public class MinhaColecao {

    public static void main(String[] args) {
        // int vetor[] = new int[5];

        //dessa forma eu declaro uma collection
        List<Livro> livros = new ArrayList<Livro>();

        Livro l1 = new Livro("Minha Coleção part 1");
        Livro l2 = new Livro("Minha Coleção part 2");
        Livro l3 = new Livro("Minha Coleção part 3");
        Livro l4 = new Livro("Minha Coleção part 4");

        livros.add(l1);
        livros.add(l2);
        livros.add(l3);
        livros.add(l4);


        //opção 1 para imprimir a lista
        for (int i = 0; i < livros.size(); i++) {
            System.out.println(livros.get(i));
        }
        
        //opção 2  avançado para imprimir a lista
        for (Livro l : livros) {
            System.out.println(l);
        }

        livros.remove(0);
        

    }
    
}
