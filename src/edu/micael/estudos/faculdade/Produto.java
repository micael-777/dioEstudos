package edu.micael.estudos.faculdade;

public class Produto {
    String nome;
    double preco;
    int quantidade;


    public Produto(String nomeProduto, double precoProduto, int quantidadeProduto) {
        this.nome = nomeProduto;
        this.preco = precoProduto;
        this.quantidade = quantidadeProduto;


    }
    public void exibirDados() {
        System.out.printf("\n Produtos: \n%s \nR$ %d \n%d quantidade \n", nome, (int)preco, quantidade);

    }
}

