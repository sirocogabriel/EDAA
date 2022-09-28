package pratica.pratica1;
import java.util.Scanner;

public class exeListas {

    public static void main(String[] args) {

        int op = 0;
        Carrinho carrinho = new Carrinho();

        while (op != 5) {
            try (Scanner s = new Scanner(System.in)) {
                System.out.println("Digite uma opção para a lista do Gabriel :)\n");

                System.out.println("(1) Adicionar");
                System.out.println("(2) Remover");
                System.out.println("(3) Checar Vazio");
                System.out.println("(4) Mostrar Carrinho");
                System.out.println("(5) Sair\n");

                op = s.nextInt();

                if (op == 1) {

                    try (Scanner s2 = new Scanner(System.in)) {
                        Produto produto = new Produto();
                        
                        System.out.println("\nInsira o nome do Produto: ");
                        produto.nomeSet(s2.nextLine());

                        System.out.println("Insira a descrição do Produto: ");
                        produto.descricaoSet(s2.nextLine());

                        System.out.println("Insira a quantidade de Produto: ");
                        produto.quantSet(s2.nextInt());

                        System.out.println("Insira o Valor do Produto: ");
                        produto.valorTotalSet(s2.nextFloat());

                        carrinho.Inserir(produto);
                    }
                    
                }else if(op == 2){

                    System.out.print("\nDigite a posição do produto: ");
                    int pos = s.nextInt();
                    carrinho.Remover(pos);

                }else if(op == 3){

                    if(carrinho.Vazio()){
                        System.out.println("\nO Carrinho está vazio :)\n");
                    }else {
                        System.out.println("\nO Carrinho tem produtos\n");
                    }

                }else if(op == 4){

                    int i = 0;

                    while(i < carrinho.ultimoGet()){
                        Produto produtoView = carrinho.produtosGet(i);
                        System.out.println(produtoView.nomeGet());
                        System.out.println(produtoView.descricaoGet());
                        System.out.println(produtoView.quantGet());
                        System.out.println(produtoView.valorTotalGet() + "\n");
                        i++;
                    }
                
                }else {
                    op = 5;
                }
            }

        }
    }

}

class Produto {

    public int p;
    private int quant;
    private float valorTotal;
    private String nome;
    private String descricao;

    public int quantGet() {
        return this.quant;
    }

    public float valorTotalGet() {
        return this.valorTotal;
    }

    public String nomeGet() {
        return this.nome;
    }

    public String descricaoGet() {
        return this.descricao;
    }

    public void quantSet(int val) {
        this.quant = val;
    }

    public void valorTotalSet(float val) {
        this.valorTotal = val;
    }

    public void nomeSet(String val) {
        this.nome = val;
    }

    public void descricaoSet(String val) {
        this.descricao = val;
    }
}

class Carrinho {

    private int ultimo = 0;
    private String nome = "Gabriel";
    private Produto[] produtos = new Produto[10];

    public int ultimoGet() {
        return this.ultimo;
    }

    public String nomeGet() {
        return this.nome;
    }

    public Carrinho() {
    }

    public Produto produtosGet (int i){
        return produtos[i];
    }

    public boolean Vazio() {
        return (this.ultimo == 0);
    }

    public void Inserir(Produto p1) {
        if (this.ultimo >= this.produtos.length) {
            System.out.println("Lista cheia\n\n");
        } else {
            this.produtos[this.ultimo] = p1;
            this.ultimo++;
            System.out.println("\nProduto adicionado\n");
        }
    }

    public void Remover(int pos) {
        if (pos > 10 || pos < 1) {
            System.out.println("\nInforme um valor valido (1, 2, 3... 10)\n");
        } else if (pos > ultimo) {
            System.out.println("\nNão existe um produto nessa posição... ainda\n");
        } else {
            produtos[pos - 1] = null;
            while (pos < ultimo) {
                produtos[pos - 1] = produtos[pos];
                pos++;
            }
            produtos[pos-1] = null;
            ultimo--;
            System.out.println("\nItem removido com sucesso\n");
        }
    }
}
