package edu.micael.estudos.curso;

import java.util.Scanner;

public class BoletimEstudantil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Digite sua média");
        int media = scanner.nextInt();
        scanner.nextLine();

            if (media < 5)
                System.out.println("REPROVADO");
            else if(media == 5)
                System.out.println("MÉDIA");
            else if (media >= 6)
                System.out.println("APROVADO");

        scanner.close();
    }

}