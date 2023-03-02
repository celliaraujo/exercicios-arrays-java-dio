package br.com.dio;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        int[] vetor = new int[20];

        Random gerador = new Random();

        for(int x = 0; x < vetor.length; x++){
            vetor[x] = gerador.nextInt(100);
            //System.out.print(vetor[x] + ", " + (vetor[x] + 1) + ", ");
        }

        System.out.print("Números aleatórios: ");
        for (int numero : vetor) {
            System.out.print(numero + " ");            
        }

        System.out.print("\nSucessores dos números aleatórios: ");
        for (int numero : vetor) {
            System.out.print((numero + 1) + " ");            
        }
    }
    
}
