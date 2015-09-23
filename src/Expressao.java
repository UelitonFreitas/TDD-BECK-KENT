/**
 * Created by Ueliton on 29/08/2015.
 */
public interface Expressao {


    public Dinheiro converte(Banco banco, String paraMoeda);

    Expressao mais(Expressao dezFrancos);
}
