/**
 * Created by Ueliton on 29/08/2015.
 */
public class Soma implements Expressao{

    Dinheiro augendo;
    Dinheiro adendo;

    public Soma(Dinheiro augendo, Dinheiro adendo) {

        this.augendo = augendo;
        this.adendo = adendo;
    }

    public Dinheiro converte(Banco banco, String tipoDeMoeda) {

        int resultado = augendo.valor+adendo.valor;
        return new Dinheiro(resultado, tipoDeMoeda);
    }
}
