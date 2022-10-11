import java.util.*;

public class Palindromo {

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        
        String contrario = "";
        
        
        String nome = ent.nextLine();

        
        for (int i = (nome.length() -1); i >= 0; i--) {
            contrario = contrario + nome.charAt(i);
        }
        
        
        if (contrario.toLowerCase().equals(nome.toLowerCase())) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        
    }
    
}
    
