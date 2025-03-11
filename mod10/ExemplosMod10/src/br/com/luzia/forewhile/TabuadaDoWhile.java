package br.com.luzia.forewhile;
import java.util.Scanner;

public class TabuadaDoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String resposta = "";
        do {
            System.out.println("\nDigite um número para calcular a tabuada: ");
            int num = sc.nextInt();
            for (int i = 0; i < 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }

            System.out.println("\nDeseja calcular uma tabuda novamente? ");
            resposta = sc.next();
        } while (resposta.equalsIgnoreCase("Sim"));

        System.out.println("\nObrigado ");
    }
}
