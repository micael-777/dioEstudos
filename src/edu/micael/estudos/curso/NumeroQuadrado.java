package edu.micael.estudos.curso;

public class NumeroQuadrado {
    public static void main(String[] args) {
        double a = 15;
        double b = 24;
        double c = 36;
        double A, B, C;

        A = Math.sqrt(a);
        B = Math.sqrt(b);
        C = Math.sqrt(c);

        System.out.printf("Resultados das raizes quadradas são: \n%.2f \n%.2f \n%.2f \n", A, B, C);

        A = Math.pow(a, b);
        B = Math.pow(b, 3);
        C = Math.pow(c, 4);

        System.out.printf("Resultados das raizes quadradas são: \n%.1f \n%.1f \n%.1f", A, B, C);
    }
}
