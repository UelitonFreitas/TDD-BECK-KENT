import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ueliton on 26/08/2015.
 */
public class TestaMultiplicacao {

    @Test
    public void testaMultiplicacao() {

        Dolar cinco = Dinheiro.dolar(5);

        assertEquals(Dinheiro.dolar(10), cinco.vezes(2));
        assertEquals(Dinheiro.dolar(15), cinco.vezes(3));
    }

    @Test
    public void testaIgualdade() {
        assertTrue(Dinheiro.dolar(5).equals(Dinheiro.dolar(5)));
        assertFalse(Dinheiro.dolar(5).equals(Dinheiro.dolar(6)));
        assertTrue(Dinheiro.franco(5).equals(Dinheiro.franco(5)));
        assertFalse(Dinheiro.franco(5).equals(Dinheiro.franco(6)));
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
    public void testaDiferencaDaIgualdadeDeClasses(){
        assertTrue(new Dinheiro(10, "CHF").equals(new Franco(10, "CHF")));
    }
}
