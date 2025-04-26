package edu.micael.estudos.curso;

public class Bhaskara {
    public static void main(String[] args) {
        double delta;
        double a = 1;
        double b = -1;
        double c = -6;
        double x1;
        double x2;

        delta = Math.pow(b, 2.0) -4*a*c;
        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.println("RESULTADO DE X1 = " + x1);
        System.out.println("RESULTADO DE X2 = " + x2);

    }
}
