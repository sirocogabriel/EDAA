package pratica.lista6;

import java.util.Random;
import java.util.Scanner;

public class Ordenacao {
    
    public static void main(String[] args) {

        int op = 0;
        int[] vetor = new int[500];

        Random gerador = new Random();

        for (int i = 0; i < 500; i++) {
            vetor[i] = gerador.nextInt(9999) + 1;
        }

        Scanner s = new Scanner(System.in);
        while (op != 5) {
            System.out.println("\nDigite uma opção\n");

            System.out.println("(1) Ordenar por Insertion Sort");
            System.out.println("(2) Busca pelo método binário, indicando a posição em que ele se encontra (precisa estar ordenado)");
            System.out.println("(3) Busca pelo metodo sequencial, indicando a quantidade de elementos iguais a este presente na matriz (precisa estar ordenado)");
            System.out.println("(4) Mostrar Números");
            System.out.println("(5) Sair\n");

            op = s.nextInt();

            if (op == 1) {

                for (int j = 1; j < 500; j++) {  
                
                    int key = vetor[j];  
                    int i = j-1;
                
                    while (i > -1 && vetor[i] > key) {  
                
                        vetor[i+1] = vetor[i];  
                        i--;  
                
                    }  
                    vetor[i+1] = key;  
                }  

            }else if(op == 2){

                System.out.print("\nDigite o número a ser encontrado: ");
                var x = s.nextInt();

                int inicio = 0;
                int meio;
                int fim = 499;
                
                while(inicio <= fim) {
                    meio = (fim + inicio) / 2;

                    if(vetor[meio] == x) {
                        System.out.println("Posição: " + meio);
                        break;
                    }
                    
                    if(vetor[meio] < x) {
                        inicio = meio + 1;
                    } else {
                        fim = meio - 1;
                    }
                }
                
                if(inicio > fim) {
                    System.out.println("Número não encontrado");
                }

            }else if(op == 3){
                
                System.out.print("\nDigite o número a ser encontrado: ");
                var x = s.nextInt();

                int sequencia = 0;

                boolean encontrou = false;

                int count = 0;
                
                for(count = 0; count < 500; count++) {
                    if (vetor[count] == x) {
                        sequencia++;
                        encontrou = true;
                    }else if(encontrou == true){
                        System.out.println("Número encontrado " + sequencia + " vezes em sequência");
                        break;
                    }
                }
                
                if(count >= vetor.length)
                    System.out.println("Número não encontrado");

            }else if(op == 4){
                
                int i = 0;
                System.out.println();

                while(i < 500){
                    System.out.println(vetor[i]);
                    i++;
                }
            
            }else {
                op = 5;
            }
        }
        s.close();
    }
}