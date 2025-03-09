package br.com.luzia;

public class Cliente {

    //private int codigo1;
    private Long codigo;

    private Integer idade;

    private Long codigoMaior=2374982374l;

    private Double valorDecimal2=10.1;

    private Boolean status = false;

    private Float valorDecimal=10.0f;

    private Short shor;

    private Byte bi;

    private Character letra = 'A';


    public static   void main(String[] args) {
    }

    public void teste(){
        this.codigo = null;
        //this.codigo1 = null;
    }

    public Float getValorDecimal() {
        return valorDecimal;
    }

    public void setValorDecimal(Float valorDecimal) {
        this.valorDecimal = valorDecimal;
    }
}
