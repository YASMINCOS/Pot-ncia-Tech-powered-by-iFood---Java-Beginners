//Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0.   


import java.util.*;

public class Recursao {

    public static void main(String[] args) {

    	Scanner sc= new Scanner(System.in);

        System.out.println(somatorio(sc.nextInt()));
    }

    
    static int somatorio(int numero) {

    	
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
