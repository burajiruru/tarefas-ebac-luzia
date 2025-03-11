package br.com.luzia.forewhile;

import java.util.ArrayList;
import java.util.List;

public class ExemploPPT1 {
    public static void main(String[] args) {
        //for (int i = 1; i < 11; i++) {System.out.println("Linha " + i);}

        List<Integer> valores = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            System.out.println("Linha " + i);
            valores.add(i);
        }

        for (Integer i : valores) {
            System.out.println("Linha " + i);
        }

        valores.forEach(i -> System.out.println("Linha " + i));


    }
}
