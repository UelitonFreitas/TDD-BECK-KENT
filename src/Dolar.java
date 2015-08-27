/**
 * Created by Ueliton on 26/08/2015.
 */
public class Dolar extends Dinheiro{

    public Dolar(int valor) {
        this.valor = valor;
    }

    public Dolar vezes(int multiplicador) {
        return new Dolar(valor * multiplicador);
    }

    public boolean equals(Object objeto){
        Dinheiro dinheiro = (Dinheiro) objeto;
        return valor == dinheiro.valor;
    }
}
