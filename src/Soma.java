/**
 * Created by Ueliton on 29/08/2015.
 */
public class Soma implements Expressao{

    Expressao augendo;
    Expressao adendo;

    public Soma(Expressao augendo, Expressao adendo) {

        this.augendo = augendo;
        this.adendo = adendo;
    }

    public Dinheiro converte(Banco banco, String tipoDeMoeda) {

        int resultado = augendo.converte(banco, tipoDeMoeda).valor+adendo.converte(banco, tipoDeMoeda).valor;
        return new Dinheiro(resultado, tipoDeMoeda);
    }

    @Override
    public Expressao mais(Expressao adendo) {
        return new Soma(this, adendo);
    }

    public Expressao vezes(int multiplicador) {
        return new Soma(augendo.vezes(multiplicador), adendo.vezes(multiplicador));
    }
}
