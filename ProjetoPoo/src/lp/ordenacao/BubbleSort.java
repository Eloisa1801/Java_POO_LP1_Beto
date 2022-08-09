package ProjetoPoo.src.lp.ordenacao;

import java.util.Random;

public class BubbleSort {
    private static final int TAM = 10000;
    

    public static void main(String[] args) {
        
        int vetor [] = new int [TAM];
        Random rand = new Random();
        
    
        for (int i=0; i < vetor.length; i++){
            vetor[i] = rand.nextInt(TAM * TAM - 1) + 1;
        }

        System.out.println("Vetor desordenado: ");
        // print(vetor);

        for (int i=0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " \t ");
        }

        System.out.println("Vetor ordenado: ");
        boolean troca = false;
        do {
            troca = false; 
            for (int j=0; j < vetor.length - 1; j++){
                if (vetor[j] > vetor[j + 1]){
                    troca = true;
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
            
        } 
        while(troca);
        
        // public static void print(int vetor[]){

        // }
    
    
    
    }
}
