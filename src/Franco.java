/**
 * Created by Ueliton on 26/08/2015.
 */
public class Franco extends Dinheiro{

    public Franco(int valor) {
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
