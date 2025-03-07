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
        int trimestre1 = randomNum.nextInt(10) + 1;
        int trimestre2 = randomNum.nextInt(10) + 1;
        int trimestre3 = randomNum.nextInt(10) + 1;
        int trimestre4 = randomNum.nextInt(10) + 1;

        System.out.println("Nota 1º Trimestre: " + trimestre1);
        System.out.println("Nota 2º Trimestre: " + trimestre2);
        System.out.println("Nota 3º Trimestre: " + trimestre3);
        System.out.println("Nota 4º Trimestre: " + trimestre4);

        int mediaF = (trimestre1 + trimestre2 + trimestre3 + trimestre4) / 4;
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
