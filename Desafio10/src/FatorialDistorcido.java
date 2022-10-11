import java.util.Scanner;

public class FatorialDistorcido {

	public static void main(String[] args) {
		int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int res = 0;
        int cnt = 1;
        int tmp = n;
        n--;
        while (n > 0) {
        	res=res*cnt;
       }
        System.out.println(res);
        
	}
}
