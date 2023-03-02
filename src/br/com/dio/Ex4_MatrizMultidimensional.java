package br.com.dio;

import java.util.Random;

public class Ex4_MatrizMultidimensional {
    public static void main(String[] args) {
        
        Random random = new Random();

        int[][] M = new int[4][4];

        int menor = 10;
        int numeroAleatorio = 0;
        int linhaMenor = 0;
        int colunaMenor = 0;

        for(int l = 0; l < 4; l++){
            for(int c = 0; c < 4; c++){
                numeroAleatorio = random.nextInt(9);
                M[l][c] = numeroAleatorio;
                if(menor > numeroAleatorio){
                    menor = numeroAleatorio;
                    linhaMenor = l;
                    colunaMenor = c;
                } 
                
            }

        }
        for (int[] linha : M) {
            for (int numero : linha) {
                System.out.print(numero + " ");
            }
            System.out.println();            
        }
        System.out.print("Menor numero é " + menor + ". ");
        System.out.print("E está na linha " + linhaMenor + " e na coluna " + colunaMenor);

    }
    
}
