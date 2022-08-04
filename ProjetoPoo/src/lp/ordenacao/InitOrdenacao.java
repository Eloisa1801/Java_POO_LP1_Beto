package ProjetoPoo.src.lp.ordenacao;

import java.util.Scanner;

public class InitOrdenacao {
    
    public static void main(String[] args) {
        
        //Fazer a leitura pelo teclado
        Scanner in = new Scanner(System.in);
        //classe   - comando -contrutor da clsse - parametro para leitura
       
        int vetor[] = new int[5];

        int vetor2[] = {1, 2, 3, 4, 5, 6, 7, 8};

        int matriz[][] = new int[3][3];

        vetor[2] = 30;
        vetor2[0] = 10;
        matriz[0][0] = 1;


        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i]);
            
        }

        for(int i = 0; i < 5; i++) {
            System.out.println("Digite o #" + (i + 1) + " = " + " número");
            vetor[i] = in.nextInt();

        }


    }

}
