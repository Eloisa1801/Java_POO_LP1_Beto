package ProjetoPoo.src.lp.ordenacao;

import java.util.Random;
import java.util.Scanner;

public class InitOrdenacao {
    
    public static void main(String[] args) {
        
        //Fazer a leitura pelo teclado
        Scanner in = new Scanner(System.in);
        //classe   - comando -contrutor da clsse - parametro para leitura
       
        int vetor[] = new int[10];

        // int vetor2[] = {1, 2, 3, 4, 5, 6, 7, 8};

        // int matriz[][] = new int[3][3];

        // vetor[2] = 30;
        // vetor2[0] = 10;
        // matriz[0][0] = 1;


        // for (int i = 0; i < 5; i++) {
        //     System.out.println(vetor[i]);
            
        // }

        // for(int i = 0; i < 5; i++) {
        //     System.out.println("Digite o # " + (i + 1) + " = " + " número");
        //     vetor[i] = in.nextInt();

        // }
//-----------------------------------------------------------------\\---------------------------------\\
        // int num =  1 + ((int) (Math.random()) * 10);

        int min = 10, max = 20;
        Random rand = new Random();
        // System.out.println(rand.nextInt(max - min) + min);

        // for (int i = 0; i < 5; i++) {
            
        //     System.out.println("Vetor " + i + " - " + rand.nextInt(max - min) + min );
            
        // }
        
        // System.out.println("\n");

        // for (int i = 0; i < 8; i++) {
            
        //     System.out.println("Vetor " + i + " - " + rand.nextInt(max - min) + min );
            
        // }

        // System.out.println("\n");

        // for (int i = 0; i < 8; i++) {
            
            

        // Continuar colocar numeros  aleatorios no vetor e na matriz 3x3

        // for (int i = 0; i < 8; i++) {
        //     System.out.println(vetor2[i]);
            
        // }

        // Criar um vetor de sem repetir 10 a 20
        int qto = 0;

        for (int i = 0; i < 10; i++) {
            boolean found = true;
            int temp = 0;
            while (found) {
                found = false;
                temp = rand.nextInt(max - min) + min;
                for (int j = 0; j < qto; j++) {
                    if (temp == vetor[j]) {
                        found = true;
                    }
                }
            }
            vetor[i] = temp;
            System.out.println(temp + "");
            qto++;
        }

        



//-----------------------------------------------------------------\\---------------------------------\\







    }

}
