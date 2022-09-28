import java.util.Scanner;

public class exeRecursividade {
    public static void main(String[] args) {
        System.out.println("Qual o número para a soma recursiva?");
        try (Scanner s = new Scanner(System.in)) {
            int num = s.nextInt();

            System.out.println("\n" + SomaRecursiva(num, 0));
        }
    }

    public static int SomaRecursiva (int num, int soma) {
        if(num == 0) {
            return soma;
        }else {
            soma += num;
            num--;
            return SomaRecursiva(num, soma);
        }
    }
}
