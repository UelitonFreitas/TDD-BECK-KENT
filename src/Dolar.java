/**
 * Created by Ueliton on 26/08/2015.
 */
public class Dolar extends Dinheiro{

    Dolar(int valor, String moeda) {
        super(valor, moeda);
    }

    public Dinheiro vezes(int multiplicador) {
        return new Dolar(valor * multiplicador, moeda);
    }
}
