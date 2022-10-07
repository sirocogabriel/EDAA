package pratica.lista5;
import java.util.Scanner;

public class recursividade2 {
    public static void main(String[] args) {
        System.out.println("Qual o número inteiro positivo?");
        try (Scanner s = new Scanner(System.in)) {
            int num = s.nextInt();

            PrintRecursivo(num, 0);
        }
    }

    public static int PrintRecursivo (int num, int numPrint) {
        if(numPrint == num) {
            return numPrint;
        }
        else {
            numPrint++;
            return PrintRecursivo(num, numPrint);
        }
    }
}
