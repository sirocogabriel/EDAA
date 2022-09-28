package pratica.pratica1;
import java.util.*;

class exe03 {
    
    public static void main(String[] args) {
        int op = 0;
        try (Scanner s = new Scanner(System.in)) {
            ArrayList<Carro> carros = new ArrayList<Carro>();
            
            while(op < 1000){
                
                System.out.println("\nDigite o número da opção desejada: \n");
                System.out.println("(1) Adicionar um carro");
                System.out.println("(2) Mostrar carro mais econômico");
                System.out.println("(3) Mostrar quantos litros cada carro consome para uma determinada distância");
                System.out.println("(4) Sair\n");
                op = s.nextInt();
                
                if(op == 1){
                    carros = AdicionaCarro(carros);
                }else if(op == 2){
                    System.out.println("\n"+MaisEconomico(carros));
                }else if(op == 3){
                    ConsumoPorDistancia(carros);
                }else if(op == 4){
                    op = 1000;
                }
            }
        }
    }
    
    static ArrayList<Carro> AdicionaCarro (ArrayList<Carro> carros) {
        
        try (Scanner s = new Scanner(System.in)) {
            Carro carro = new Carro();
            boolean tudoCerto = true;
                
            System.out.print("\nDigite o nome do "+(carros.size() + 1)+"º carro: ");
            carro.Nome = s.nextLine();
   
            for (Carro c : carros) {
                tudoCerto = c.ChecaNome(carro.Nome);
            }

            if(!tudoCerto) return carros;

            System.out.print("Digite quantos quilômetros por litro o "+(carros.size() + 1)+"º carro faz: ");
            carro.KmPorLitro = s.nextFloat();
   
            carros.add(carro);
        }
        return carros;
    }

    static String MaisEconomico (ArrayList<Carro> carros) {

        String maisEconomicoNome = "";
        Float maisEconomicoKmPorLitro = Float.parseFloat("-1");
        

        for (Carro carro : carros) {
            if(maisEconomicoKmPorLitro < carro.KmPorLitro){
                maisEconomicoNome = carro.Nome;
                maisEconomicoKmPorLitro = carro.KmPorLitro;
            }
        }
        return maisEconomicoNome;
    }

    static void ConsumoPorDistancia (ArrayList<Carro> carros) {
        System.out.print("\nDigite a distância percorrida: ");
        try (Scanner s = new Scanner(System.in)) {
            float dist = s.nextFloat();

            System.out.print("\nLitros gastos: ");

            for (Carro carro : carros) {
                System.out.print("\n" + carro.Nome + ": " + (dist/carro.KmPorLitro));
            }
        }
        System.out.print("\n");
    }
    
}

class Carro {
    String Nome;
    Float KmPorLitro;

    Boolean ChecaNome(String nomeCarro){
        if(Nome == nomeCarro){
            System.out.println("\nJá existe um carro com esse nome!\n");
            return false;
        }
        return true;
    }
}
