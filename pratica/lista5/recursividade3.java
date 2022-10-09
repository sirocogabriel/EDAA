package pratica.lista5;
import java.util.Scanner;

public class recursividade3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Qual o k?");
        int k = s.nextInt();

        System.out.println("\nQual o n?");
        int n = s.nextInt();

        System.out.println("\nResultado: " + ExponencialRecursivo(k, n, 0, 1));
        s.close();
    }

    public static int ExponencialRecursivo (int k, int n, int count, int total) {
        if(count == n) {
            return total;
        }
        else {
            total = k * total;
            count++;
            return ExponencialRecursivo(k, n, count, total);
        }
    }
}
