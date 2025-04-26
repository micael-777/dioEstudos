package edu.micael.estudos.curso;

public class Scanner {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double variavel;
        variavel = scanner.nextDouble();

            System.out.println("Número digitado: " + variavel);
    }
}
