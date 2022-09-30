import java.util.Scanner;

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
