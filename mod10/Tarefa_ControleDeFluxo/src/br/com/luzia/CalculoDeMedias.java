package br.com.luzia;

import java.util.Random;

public class CalculoDeMedias {

    public static void main(String[] args) {
        nomeAluno();
        notaAluno();
    }

    private static void nomeAluno() {
        String[] firstName = {"Luiz", "Bruno", "João", "José"};
        String[] lastName = {"Silva", "Rodrigues", "Oliveira"};
        Random random = new Random();
        System.out.println("Nome: " + firstName[random.nextInt(firstName.length)] + " " + lastName[random.nextInt(lastName.length)]);
    }

    private static void notaAluno() {
        Random randomNum = new Random();
        int tri1 = randomNum.nextInt(10) + 1;
        int tri2 = randomNum.nextInt(10) + 1;
        int tri3 = randomNum.nextInt(10) + 1;
        int tri4 = randomNum.nextInt(10) + 1;

        System.out.println("Nota 1º Trimestre: " + tri1);
        System.out.println("Nota 2º Trimestre: " + tri2);
        System.out.println("Nota 3º Trimestre: " + tri3);
        System.out.println("Nota 4º Trimestre: " + tri4);

        int mediaF = (tri1 + tri2 + tri3 + tri4) / 4;
        System.out.println("Media Final: " + mediaF);

        if (mediaF >= 7) {
            System.out.println("Status: Aprovado");
        } else if (mediaF >= 5) {
            System.out.println("Status: Recuperação");
        } else {
            System.out.println("Status: Reprovado");
        }
    }
}