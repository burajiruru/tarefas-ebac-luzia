package br.com.luzia.forewhile;

import java.util.Scanner;
public class TabuadaFor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor para tabuada: ");
        int num = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}
