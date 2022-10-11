import java.util.Scanner;

public class QuadradoPerfeito {

	  public static void main(String[] args) {
	        int n = Integer.parseInt(new Scanner(System.in).nextLine());

	        int[] d = new int[n + 1];
	        int menorNumero = 0;
	        //TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.
	        for (int i = 0; i < n; i++) {
	            if (Math.sqrt(i) * Math.sqrt(i) == i) {
	                if (i * i > n) {
	                    menorNumero++;
	                }
	            }
	        }
	        if (n % 2 != 0) {
	            menorNumero--;
	        }
	        System.out.println(menorNumero);
	    }
}
