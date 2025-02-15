package ProjetoPoo.src.lp.ordenacao;

import java.util.Random;

public class selectionSort {
    private static final int TAM = 8;

    public static void main(String[] args){
        int vetor[] = new int[TAM];
        Random rand = new Random();

        for (int i = 0; i < TAM; i++) {
            vetor[i] = rand.nextInt( TAM * TAM - 1) + 1;
            // System.out.println("[" + i + "] = " + vetor[i]);
        }
        System.out.println("Vetor desordenado:");
        print(vetor);

        for (int i = 0; i < TAM; i++){
            int menor = i;
            for (int j = i; j < TAM; j++){
                if (vetor[j] < vetor[menor]){
                    menor = j;
                }
            }
            //trocaria os elementos
            int aux = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = aux;
        }


        System.out.println("\n\nVetor ordenado");
        print(vetor);



    }

//================================================================

    public static void print(int vetor[]){
        for (int i = 0; i < vetor.length; i++){
            System.out.println("[" + i + "] = " + vetor[i]);
        }
    }
}
