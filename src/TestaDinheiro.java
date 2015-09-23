import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ueliton on 26/08/2015.
 */
public class TestaDinheiro {

    @Test
    public void testaMultiplicacao() {

        Dinheiro cinco = Dinheiro.dolar(5);

        assertEquals(Dinheiro.dolar(10), cinco.vezes(2));
        assertEquals(Dinheiro.dolar(15), cinco.vezes(3));
    }

    @Test
    public void testaIgualdade() {

        assertTrue(Dinheiro.dolar(5).equals(Dinheiro.dolar(5)));
        assertFalse(Dinheiro.dolar(5).equals(Dinheiro.dolar(6)));
        assertFalse(Dinheiro.franco(5).equals(Dinheiro.dolar(5)));
    }

    @Test
    public void testaMultiplicacaoDeFrancos() {

        Dinheiro cinco = Dinheiro.franco(5);

        assertEquals(Dinheiro.franco(10), cinco.vezes(2));
        assertEquals(Dinheiro.franco(15), cinco.vezes(3));
    }

    @Test
    public void testaMoeda(){

        assertEquals("USD", Dinheiro.dolar(1).moeda);
        assertEquals("CHF", Dinheiro.franco(1).moeda);
    }

    @Test
    public void testaUmaSimplesAdicao(){

        Dinheiro cinco = Dinheiro.dolar(5);

        Expressao soma = cinco.mais(cinco);

        Banco banco = new Banco();

        Dinheiro convertido = banco.converte(soma, "USD");

        assertEquals(Dinheiro.dolar(10), convertido);
    }

    @Test
    public void testaSeMaisRetornaSoma(){

        Dinheiro cinco = Dinheiro.dolar(5);
        Expressao resultado = cinco.mais(cinco);

        Soma soma = (Soma) resultado;

        assertEquals(cinco, soma.augendo);
        assertEquals(cinco, soma.adendo);
    }

    @Test
    public void testaSomaConvertida(){

        Expressao soma = new Soma(Dinheiro.dolar(3), Dinheiro.dolar(4));

        Banco banco = new Banco();

        Dinheiro resultado = banco.converte(soma, "USD");

        assertEquals(Dinheiro.dolar(7), resultado);

    }

    @Test
    public void testaConversaoDeDinheiro(){

        Banco banco = new Banco();

        banco.adicionaTaxas("CHF", "USD", 2);

        Dinheiro resultado = banco.converte(Dinheiro.dolar(1), "USD");

        assertEquals(Dinheiro.dolar(1), resultado);
    }

    @Test
    public void testaConversaoDeDinheiroDeDiferentesMoedas(){

        Banco banco = new Banco();

        banco.adicionaTaxas("CHF", "USD", 2);

        Dinheiro resultado = banco.converte(Dinheiro.franco(2), "USD");

        assertEquals(Dinheiro.dolar(1), resultado);
    }

    @Test
    public void testaIdentidadesDaTaxa(){
        assertEquals(1, new Banco().taxa("USD", "USD"));
    }

    @Test
    public void testaAdicaoMista(){

        Expressao cincoDolares = Dinheiro.dolar(5);
        Expressao dezFrancos = Dinheiro.franco(10);

        Banco banco = new Banco();
        banco.adicionaTaxas("CHF", "USD", 2);

        Dinheiro resultado = banco.converte(cincoDolares.mais(dezFrancos), "USD");

        assertEquals(Dinheiro.dolar(10), resultado);
    }

    @Test
    public void testaSomaMaisDinheiro(){

        Expressao cincoDolares = Dinheiro.dolar(5);
        Expressao dezFrancos = Dinheiro.franco(10);

        Banco banco  = new Banco();
        banco.adicionaTaxas("CHF", "USD", 2);

        Expressao soma = new Soma(cincoDolares, dezFrancos).mais(cincoDolares);

        Dinheiro resultado = banco.converte(soma, "USD");

        assertEquals(Dinheiro.dolar(15), resultado);

    }

    @Test
    public void testaSomaVezes(){

        Expressao cincoDolares = Dinheiro.dolar(5);
        Expressao dezFrancos = Dinheiro.franco(10);

        Banco banco  = new Banco();
        banco.adicionaTaxas("CHF", "USD", 2);

        Expressao soma = new Soma(cincoDolares, dezFrancos).vezes(2);

        Dinheiro resultado = banco.converte(soma, "USD");

        assertEquals(Dinheiro.dolar(20), resultado);
    }

}
