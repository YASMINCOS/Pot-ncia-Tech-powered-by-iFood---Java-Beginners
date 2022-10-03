import java.util.Scanner;
//Nesse desafio, dados dois números, verifique se eles são iguais. Caso sejam, retorne "Sao iguais!”. Caso contrário, retorne "Nao sao iguais!” sem as aspas. 


public class SaoIguais {

	    public static void main(String[] args) {

	       Scanner teclado= new Scanner(System.in);
	       int a=teclado.nextInt();
	       int b=teclado.nextInt();
	      
	      if (a==b){
	        System.out.println("Sao iguais");
	      } else{
	        System.out.println("Sao diferentes");
	      }

	    }
	}
