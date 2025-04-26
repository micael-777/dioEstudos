package edu.micael.estudos.curso;

import java.util.Scanner;

public class Concatenar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual foi sua nota?");
            int numero = scanner.nextInt();
            scanner.nextLine();
                System.out.println("RESULTADO = " + numero);
    }
}
