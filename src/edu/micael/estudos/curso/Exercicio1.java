package edu.micael.estudos.curso;

import java.util.Locale;

public class Exercicio1 {
    public static void main(String[] args) {

        String produto1 = "Computador";
        String produto2 = "Mesa de Escritório";

        int idade = 19;
        int codigo = 1234;
        char genero = 'M';

        double preco1 = 1000.00;
        double preco2 = 550.50;
        double medida = 5.234567;

        System.out.printf("Produtos: \n%s, cujo preço é de R$ %d\n%s, cujo preço é de R$ %d\n", produto1, (int)preco1, produto2, (int)preco2);
        System.out.println();
        System.out.printf("Registro: %d, código %d e gênero: %s\n", (int)idade, (int)codigo, genero);
        System.out.println();
        System.out.printf("Measue: %.8f\n", medida);
        System.out.printf("Rounded: %.3f\n",medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Ponto decimal dos EUA: %.3f\n", medida);


    }
}
