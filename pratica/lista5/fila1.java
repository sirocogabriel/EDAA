package pratica.lista5;

import java.util.Scanner;

public class fila1 {
    
    public static void main(String[] args) {

        System.out.println("Digite suas letrinhas :)");
        Scanner s = new Scanner(System.in);

        String letras = s.nextLine();
        
        String letrasMin = new String();
        String letrasMai = new String();

        for (var i = 0; i < letras.length(); i++) {
            char[] letraChar = new char[1];
            letraChar[0] = letras.charAt(i);
            String letraString = new String(letraChar);
            String letraStringCompar = letraString.toLowerCase();

            if(letraString == letraStringCompar){
                letrasMin = letrasMin.concat(letraString);
            }else {
                letrasMai = letrasMai.concat(letraString);
            }
        }

        System.out.println("\nMinúsculas: " + letrasMin);
        System.out.println("Maiúsculas: " + letrasMai);

        s.close();
    }
}