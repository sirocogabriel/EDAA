package pratica1;
public class exe01 {
    
    public static void main(String[] args) {

        int[][] Tabuada = new int[10][10];
        int a = 0, b = 0;
        
        while(a < 10){
            while(b < 10){
                Tabuada[a][b] = a+b;
                System.out.print(Tabuada[a][b] + " "); 
                b++;
            }
            System.out.print("\n");
            a++;
        }
    }   
}