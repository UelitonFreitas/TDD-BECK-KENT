import java.util.Hashtable;

/**
 * Created by Ueliton on 29/08/2015.
 */
public class Banco {

    private Hashtable<Par, Integer> taxas = new Hashtable<Par, Integer>();

    public Dinheiro converte(Expressao expressao, String paraMoeda) {

        return expressao.converte(this, paraMoeda);
    }

    public int taxa(String de, String para){

        if (de.equals(para)) return 1;

        Integer taxa = (Integer) taxas.get(new Par(de, para));
        return taxa.intValue();
    }

    public void adicionaTaxas(String de, String para, int taxa) {
        taxas.put(new Par(de, para), taxa);
    }
}
