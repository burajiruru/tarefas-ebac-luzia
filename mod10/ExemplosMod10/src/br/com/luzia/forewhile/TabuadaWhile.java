package br.com.luzia.forewhile;
import java.util.Scanner;

public class TabuadaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja calcular uma tabuda? ");
        String resposta = sc.next();

        while (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Digite um número: ");
            int num = sc.nextInt();
            for (int i = 0; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }

            System.out.println("\nDeseja calcular uma tabuda novamente? ");
            resposta = sc.next();
        }
        System.out.println("Obrigado");
    }


}
