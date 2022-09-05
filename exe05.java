import java.lang.reflect.Array;
import java.util.*;

class exe05 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        EscritaUnica[] arrayEscritaUnica = new EscritaUnica[10];
        
        while(true){
            
            int count = 0;
            String resposta = "";

            while (count < 10) {
            
                if(arrayEscritaUnica[count] == null){
                    arrayEscritaUnica[count] = new EscritaUnica(); 
                    arrayEscritaUnica[count].Valor = ""; 
                    arrayEscritaUnica[count].Escrito = false; 
                }
                
                String texto = arrayEscritaUnica[count].Escrito ? (" escrita, impossível alterar. Valor atual: " + arrayEscritaUnica[count].Valor) : " não escrita, deseja escrever? [S/N]";
                System.out.print("\nPosição " + count + texto);
            
                if(!arrayEscritaUnica[count].Escrito){
                    resposta = s.nextLine();

                    if(resposta.equals("S") || resposta.equals("s")){
                        System.out.print("\nDigite o valor (String) para a posição " + count + ": ");
                        resposta = s.nextLine();
                        arrayEscritaUnica[count].Valor = resposta;
                        arrayEscritaUnica[count].Escrito = true;
                    }
                }
        
                count++;
            }
        }
    }
}

class EscritaUnica {
    String Valor;
    Boolean Escrito;
}
