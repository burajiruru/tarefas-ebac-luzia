package br.com.luzia;

import java.util.Random;

public class TarefaCalculoMedia {

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
        int sem1 = randomNum.nextInt(10) + 1;
        int sem2 = randomNum.nextInt(10) + 1;

        System.out.println("Nota 1º Semestre: " + sem1);
        System.out.println("Nota 2º Semestre: " + sem2);

        int mediaF = (sem1 + sem2) / 2;
        System.out.println("Media Final: " + mediaF);

        boolean reprovado = mediaF < 5;
        if (reprovado) {
            System.out.println("Satus: Reprovado");
        }
        boolean recuperacao = mediaF >= 5 && mediaF <= 6;
        if (recuperacao) {
            System.out.println("Status: Recuperação");
        }
        boolean aprovado = mediaF >= 7;
        if (aprovado) {
            System.out.println("Status: Aprovado");
        }
    }
}
