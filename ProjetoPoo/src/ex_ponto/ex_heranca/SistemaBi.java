package ProjetoPoo.src.ex_ponto.ex_heranca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaBi {
    private final static String[] opcoes ={
            " -----------------------------------------------------------------",
            "|                  +++ Sistema biblioteca +++                     |",
            "|-----------------------------------------------------------------|",
            "|                      Escolha uma opção                          |",
            "|-----------------------------------------------------------------|",
            "|1 - Cadastrar Livro                                              |",
            "|2 - Cadastrar Funcionario                                        |",
            "|3 - Cadastrar Estudante                                          |",
            "|4 - Cadastrar Autor                                              |",
            "|5 - Realizar Emprestimo                                          |",
            "|6 - Receber Emprestimo                                           |",
            "|0 - Sair                                                         |",
            "|                                                                 |",
            " -----------------------------------------------------------------",

    };

    private static List<livros>livros = new ArrayList<livros>();
    private static List<autores>autores = new ArrayList<autores>();


    private static Scanner buffer = new Scanner(System.in);


    public static void main(String[] args) throws IOException{
        int op = 1;
        while (op != 0) {
            printMenu();
            System.out.print("\n\n");
            op = buffer.nextInt();
            escolha(op);
        }
            
    }

    // ====================================================================================
    private static void printMenu() {
        System.out.print("\033[H\033{23");
        System.out.flush();
        for (String op : opcoes) {
            System.out.println(op);
        }
    }

    // =====================================================================================
    private static void escolha(int op) {
        switch (op) {
            // cadastrar Livro
            case 1:
                Livro novoLivro = Livro.cadastrarLivro();
                System.out.println("Livro cadastrado!\nResumo...\n");
                System.out.println(novoLivro.toString());
                livros.add(novoLivro);
                break;

            //cadastrar funcionario
            case 2:
                Funcionario novoFunc = new Funcionario.cadastrarFuncionario();
            default:
                System.out.println("Saindo da função escolha");

        }
    }
}
