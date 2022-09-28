package pratica.pratica1;
import java.util.*;

class exe04 {
    
    public static void main(String[] args) {
        int op = 0;
        try (Scanner s = new Scanner(System.in)) {
            ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
            
            while(op < 1000){
                
                System.out.println("\nDigite o número da opção desejada: \n");
                System.out.println("(1) Adicionar valor as 10 pessoas do vetor");
                System.out.println("(2) Mostrar bandido que menos roubou");
                System.out.println("(3) Mostrar quantidade de dinheiro roubado");
                System.out.println("(4) Sair\n");
                op = s.nextInt();
                
                if(op == 1){
                    pessoas = AdicionaPessoas(pessoas);
                }else if(op == 2){
                    System.out.println("\n"+MenosRoubou(pessoas));
                }else if(op == 3){
                    QuantidadeDinheiroTotal(pessoas);
                }else if(op == 4){
                    op = 1000;
                }
            }
        }
    }
    
    static ArrayList<Pessoa> AdicionaPessoas (ArrayList<Pessoa> pessoas) {
        
        int count = 0;
        while(count < 10){

            Boolean valido = true;
            String textoErro = "";

            try (Scanner s = new Scanner(System.in)) {
                Pessoa pessoa = new Pessoa();                

                System.out.print("\nDigite o nome da "+(pessoas.size() + 1)+"º pessoa: ");
                pessoa.Nome = s.nextLine();
   
                System.out.print("Esta pessoa é um bandido? (S/N)");
                String bandido = s.nextLine();

                if(bandido.equals("S") || bandido.equals("s")){
                    pessoa.Bandido = true;
                }else {
                    pessoa.Bandido = false;
                }

                System.out.print("Digite a quantidade de dinheiro da "+(pessoas.size() + 1)+"º pessoa: ");
                pessoa.Dinheiro = s.nextInt();
                
                if(pessoa.Dinheiro % 10 != 0 && pessoa.Bandido){
                    valido = false;
                    textoErro = "Não foi possivel adicionar um valor não multiplo de 10 para um bandido.";
                }

                if (valido){
                    pessoas.add(pessoa);
                    count++;
                }else{
                    System.out.println(textoErro);
                }
            }
            
        }
    
        return pessoas;
    }

    static String MenosRoubou (ArrayList<Pessoa> pessoas) {

        String nome = "";
        int dinheiro = 999999999;
        

        for (Pessoa pessoa : pessoas) {
            if(pessoa.Bandido){
                if(pessoa.Dinheiro < dinheiro){
                    nome = pessoa.Nome;
                    dinheiro = pessoa.Dinheiro;
                }
            }
        }
        return nome;
    }

    static void QuantidadeDinheiroTotal (ArrayList<Pessoa> pessoas) {

        int TotalRoubado = 0;

        for (Pessoa pessoa : pessoas) {
            String textoBandido = pessoa.Bandido ? "(Bandido)" : "";
            
            System.out.print("\n" + pessoa.Nome + ": " + pessoa.Dinheiro + " " + textoBandido);
            if(pessoa.Bandido){
                TotalRoubado += pessoa.Dinheiro;
            }
        }
        System.out.print("\n" + "Total Roubado: " + TotalRoubado);

        System.out.print("\n");
    }
    
}

class Pessoa {
    String Nome;
    int Dinheiro;
    Boolean Bandido;
}
