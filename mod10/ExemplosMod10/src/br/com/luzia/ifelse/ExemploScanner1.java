package br.com.luzia.ifelse;

import java.util.Scanner;

public class ExemploScanner1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int idade = s.nextInt();
        System.out.println("Você tem " + idade + " anos.");
    }

}
