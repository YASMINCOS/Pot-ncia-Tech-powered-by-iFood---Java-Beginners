import java.util.*;

public class ValidacaoParenteses {





    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

      String caracter = scanner.nextLine();

        System.out.println(caracter);
        if(caracter.equals("(")) {
     	   System.out.println(true);
        }else if(caracter.equals(")")) {
      	   System.out.println(true);
         }
        else if(caracter.equals("]")) {
       	   System.out.println(true);
          }
        else if(caracter.equals("[")) {
       	   System.out.println(true);
          }
        else if(caracter.equals("()")) {
       	   System.out.println(true);
          }
        else if(caracter.equals("[]")) {
       	   System.out.println(true);
 
         }else {
     	   System.out.println(false);
        }

    }

	


}

