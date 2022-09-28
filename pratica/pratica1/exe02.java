package pratica.pratica1;
import java.util.*;

class exe02 {
    
    public static void main(String[] args) {
        
        try (Scanner s = new Scanner(System.in)) {
            int[] array = new int[10];
            Boolean[] primos = new Boolean[10];
            

            while(true){
                
                int count = 0;
                
                while (count < 10) {
                    
                    int resposta = 0;
                    int verifPrimo = 1;
                    int divisoes = 0;
                    String texto = " digite o número (int): ";
                    System.out.print("\nPosição " + count + texto);
                
                    resposta = s.nextInt();

                    array[count] = resposta;

                    while(verifPrimo <= resposta){

                        if(resposta % verifPrimo == 0){
                            divisoes++;
                        }

                        verifPrimo++;
                    }

                    if (divisoes < 3){
                        primos[count] = true;
                    }else {
                        primos[count] = false;
                    }

                    count++;
                }

                count = 0;

                while (count < 10) {
                    
                    if(primos[count]){
                        System.out.print("\nPosição " + count + " é primo. Valor: " + array[count]);
                    }
                    count++;
                }
            }
        }
    }
}
