package br.com.dio;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        
        char[] vetor = {'a','d', 'w', 'e', 'l', 'i'};
        int quantConsoantes = 0;

        for(int cont = 0; cont < 6; cont++){
            if(vetor[cont] != 'a' && vetor[cont] != 'e' && vetor[cont] != 'i' && vetor[cont] != 'o' && vetor[cont] != 'u') {
                quantConsoantes++;
                System.out.println("Consoante " + vetor[cont]);
            }

        }

        System.out.println("Quantidade de consoantes no vetor = " + quantConsoantes);
    }
    
}
