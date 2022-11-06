package pratica.lista7;

import java.util.Random;
import java.util.Scanner;

public class atv1 {
    
    public static void main(String[] args) {

        int op = 0;
        int[] vetor = new int[100];

        Random gerador = new Random();

        for (int i = 0; i < 100; i++) {
            vetor[i] = gerador.nextInt(9999) + 1;
        }

        Scanner s = new Scanner(System.in);
        while (op != 3) {
            System.out.println("\nDigite uma opção\n");

            System.out.println("(1) Inverter vetor por recursão");
            System.out.println("(2) Mostrar Números");
            System.out.println("(3) Sair\n");

            op = s.nextInt();

            if (op == 1) {

                vetor = InverterVetor(vetor, vetor.clone(), 0);

            }else if(op == 2){
                
                int i = 0;
                System.out.println();

                while(i < 100){
                    System.out.println(vetor[i]);
                    i++;
                }
            
            }else {
                op = 3;
            }
        }
        s.close();
    }

    public static int[] InverterVetor(int[] vetor, int[] vetorResultado, int contador) {
        if(contador == vetor.length){
            return vetorResultado;
        }else {
            vetorResultado[contador] = vetor[(vetor.length - 1) - contador];
            contador++;
            return InverterVetor(vetor, vetorResultado, contador);
        }
    }
}