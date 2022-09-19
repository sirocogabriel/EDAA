package pratica1;
public class exeListas {
    
    public static void main(String[] args) {
        
        String op = "";
        Scanner s = new Scanner()

        while(op != 4){
            System.out.println("Digite uma opção:\n");

            System.out.println("(1) Adicionar");
            System.out.println("(2) Remover");
            System.out.println("(3) Checar Vazio");
            System.out.println("(4) Sair");

        }
    }
}

public class Produto {
    private int quant;
    private float valorTotal;
    private String nome;
    private String descricao;

    public void quantGet (){
        System.out.println(this.quant);
    }
    public void valorTotalGet (){
        System.out.println(this.valorTotal);
    }
    public void nomeGet (){
        System.out.println(this.nome);
    }
    public void descricaoGet (){
        System.out.println(this.descricao);
    }

    public void quantSet (int val){
        this.quant = val;
    }
    public void valorTotalSet (float val){
        this.valorTotal = val;
    }
    public void nomeSet (String val){
        this.nome = val;
    }
    public void descricaoSet (String val){
        this.descricao = val;
    }
}

public class Carrinho {

    private int ultimo = 0;
    private String nome = "Gabriel";  
    private Produto[] produtos = new Produto[10];

    public Carrinho () {}

    public Vazio () {
        return ultimo == 0;
    }

    public Inserir () {
        if(this.ultimo >= this.produtos.length) {
            System.out.println("Lista cheia");
        }else {
            this.produtos[this.ultimo] = a1;
            this.ultimo++;
            System.out.println("Produto adicionado");
        }
    }

    public Remover (int pos) {
        if(pos > 10 || pos < 1){
            System.out.println("Informe um valor valido (1, 2, 3... 10)");
        }else if(pos > ultimo){
            System.out.println("Não existe um produto nessa posição... ainda");
        }else {
            produtos[pos-1] = null;
            while(pos < ultimo) {
                produtos[pos-1] = produtos[pos];
                pos++;
            }
            produtos[pos] = null;
        }
    }
}
