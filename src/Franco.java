/**
 * Created by Ueliton on 26/08/2015.
 */
public class Franco extends Dinheiro {


    Franco(int valor, String moeda) {
        super(valor, moeda);
    }

    public Dinheiro vezes(int multiplicador) {
        return new Dinheiro(valor * multiplicador, moeda);
    }
}
