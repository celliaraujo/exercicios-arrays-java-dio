package br.com.dio;

import java.util.Scanner;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[5];

        for(int cont = 0; cont <= 4; cont++){
            System.out.println("Insira um número no vetor: ");
            vetor[cont] = scan.nextInt();
        }

        for(int cont = 4; cont >= 0; cont--){
            System.out.println("Valor do vetor na posição " + cont + " é " + vetor[cont]);
        }
    }
    
}
