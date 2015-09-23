/**
 * Created by Ueliton on 26/08/2015.
 */

public class Dinheiro implements Expressao{

    protected String moeda;
    protected int valor;

    Dinheiro(int valor, String moeda){
        this.valor = valor;
        this.moeda = moeda;
    }

    Expressao vezes(int multiplicador){

        return new Dinheiro(multiplicador * valor, moeda);
    }

    static Dinheiro dolar(int valor){
        return new Dinheiro(valor, "USD");
    }

    static Dinheiro franco(int valor){
        return new Dinheiro(valor, "CHF");
    }

    @Override
    public String toString() {
        return valor+" "+moeda;
    }

    public boolean equals(Object objeto) {
        Dinheiro dinheiro = (Dinheiro) objeto;
        return valor == dinheiro.valor && moeda.equals(dinheiro.moeda);
    }

    public Expressao mais(Expressao adendo) {
        return new Soma(this, adendo);
    }

    @Override
    public Dinheiro converte(Banco banco, String paraMoeda) {

        int taxa = banco.taxa(this.moeda, paraMoeda);

        return new Dinheiro(valor / taxa, paraMoeda);
    }
}