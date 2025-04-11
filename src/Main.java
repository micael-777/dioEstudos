import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String primeiroNome = "Daniel";
        String outroNome = "bosta";

        String nomeTodo = nomeTodo(primeiroNome, outroNome);
        System.out.println(nomeTodo);
    }
    public static String nomeTodo (String primeiroNome, String outroNome) {
           return primeiroNome.concat(" ").concat(outroNome);
        }

}