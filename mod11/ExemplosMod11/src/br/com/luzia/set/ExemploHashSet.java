package br.com.luzia.set;

import br.com.luzia.domain.Aluno;

import java.util.*;

public class ExemploHashSet {

    public static void main(String args[]) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNovo();
    }

    private static void exemploNovo() {
        System.out.println("****** exemploNovo ******");
        Set<Integer> inteiros = new HashSet<>();
        inteiros.add(1);
        inteiros.add(2);
        System.out.println(inteiros);
    }

    /**
     * Não repete valores na lista
     */
    private static void exemploListaSimples() {
        System.out.println("****** exemploListaSimples ******");
        Set<String> lista = new HashSet<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("João da Silva");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("****** exemploListaSimplesOrdemAscendente ******");
        Set<String> lista = new HashSet<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        //Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
