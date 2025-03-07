package br.com.luzia;

public class Exemplos {

    // Essas variáveis são de escopo class, então podem ser acessadas pelas variáveis de escopo method
    private int codigo;

    private long codigoMaior;

    private double valorDecimal1;

    private boolean status;

    private String texto;

    private float valorDecimal;

    private short shor;

    private byte bi;


    // Essas variáveis são de escopo de method e só podem ser acessadas dentro do mesmo

    public String retornaTexto() {
        this.codigo = 0;
        return "blablabla";
    }

    public long retornaLong (long num){
        return num;
    }

    public int retornaInt (int num){
        return num;
    }

}
