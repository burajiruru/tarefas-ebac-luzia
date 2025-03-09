package br.com.luzia;

public class Exemplo2 {

    public static void main(String[] args) {

        //Casting explícito
        int num1 = 10;
        short num2 = (short)num1;

        long numL = 1111111111111111111L;
        System.out.println(numL);
        int numI = (int) numL;
        System.out.println(numI);

        //Casting implícito
        int idade = 10;
        long idadeL = idade;
        System.out.println(idadeL);

        byte b = 1;
        short s = b;


    }
}
