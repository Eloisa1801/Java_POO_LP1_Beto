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

    private static List<Livro> livros = new ArrayList<Livro>();
    // private static List<Autores> autores = new ArrayList<Autores>();
    private static List<Funcionario> funcionarios = new ArrayList<Funcionario>();


    private static Scanner buffer = new Scanner(System.in);


    public static void main(String[] args) throws IOException{
        int op = 1;
        while (op != 0) {
            printMenu();
            System.out.print("\n\n");
            op = buffer.nextInt();
            escolha(op);
            System.in.read();//System("pause")
        }
            
    }

    // ====================================================================================
    private static void printMenu() {
        System.out.print("\033[H\033[2j");
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
                System.out.println("Novo funcionário cadastrado!\nResumo...\n");
                System.out.println(novoFuncionario.toString());
                funcionarios.add(novoFuncionarios);
                break;
            default:
                System.out.println("Saindo da função escolha");

        }
    }
}
