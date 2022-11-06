package pratica.lista7;

import java.util.Scanner;

public class atv2 {
    
    public static void main(String[] args) {

        int op = 0;
        Scanner s = new Scanner(System.in);

        op = s.nextInt();

        System.out.println(Recursiva(op));
        
        s.close();
    }
    
    public static int Recursiva(int n) {
        int x;
        if (n <= 0)
            x = 1;
        else
            x = Recursiva(n-1) + Recursiva(n-1);
        return x;
    }
}

/* RESPOSTA:
 * 
 *      A função funciona para elevar o número dois, o usuário
 *      digitara o número de vezes que dois está sendo elevado.
 * 
 *      Ex: 7 resultara em 2^7, ou seja, 128.
 * 
 */