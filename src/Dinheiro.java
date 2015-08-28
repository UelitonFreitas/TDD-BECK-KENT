/**
 * Created by Ueliton on 26/08/2015.
 */

public class Dinheiro {

    protected String moeda;
    protected int valor;

    Dinheiro(int valor, String moeda){
        this.valor = valor;
        this.moeda = moeda;
    }

    Dinheiro vezes(int multiplicador){
        return null;
    }

    static Dolar dolar(int valor){
        return new Dolar(valor, "USD");
    }

    static Franco franco(int valor){
        return new Franco(valor, "CHF");
    }

    @Override
    public String toString() {
        return valor+" "+moeda;
    }

    public boolean equals(Object objeto) {
        Dinheiro dinheiro = (Dinheiro) objeto;
        return valor == dinheiro.valor && moeda.equals(dinheiro.moeda);
    }
}