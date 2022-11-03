package prova.A1;

public class Ativ1 {
    
    public class ItemPedido_questaoA {
        double valor;
        int quantidade;
        Produto produto;
        ItemPedido_questaoA proximo;    
    }
    
    public class ItemPedido_questaoB {
        double valor;
        int quantidade;
        Produto produto;
        ItemPedido_questaoB proximo;    
        ItemPedido_questaoB anterior;
    }
    
    public class ItemPedido_questaoC {
        double valor;
        int quantidade;
        Produto produto;
        ItemPedido_questaoC proximo;    
        ItemPedido_questaoC anterior;
    }


    public class Produto {

    }
}

/*
- Lista Encadeada: Uma serie de estruturas que avançam apenas para um lado.
- Fila: Uma serie de estruturas onde a ultima a ser colocada será a primeira a sair.
- Pilha: Uma serie de estruturas onde a ultima a ser colocada será a ultima a sair.
*/