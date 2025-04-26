package edu.micael.estudos.faculdade;

public class CadastroProduto {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Meia", 20.00, 45);
        Produto produto2 = new Produto("Cerveja", 30.00, 33);
        Produto produto3 = new Produto("Calça", 25.00, 55);

        produto1.exibirDados();
        produto2.exibirDados();
        produto3.exibirDados();
    }
}

