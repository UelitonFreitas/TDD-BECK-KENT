import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ueliton on 26/08/2015.
 */
public class TestaMultiplicacao {

    @Test
    public void testaMultiplicacao() {

        Dolar cinco = new Dolar(5);

        assertEquals(new Dolar(10), cinco.vezes(2));
        assertEquals(new Dolar(15), cinco.vezes(3));
    }

    @Test
    public void testaIgualdade() {
        assertTrue(new Dolar(5).equals(new Dolar(5)));
        assertFalse(new Dolar(5).equals(new Dolar(6)));
        assertTrue(new Franco(5).equals(new Franco(5)));
        assertFalse(new Franco(5).equals(new Franco(6)));
    }

    @Test
    public void testaMultiplicacaoDeFrancos() {
        Franco cinco = new Franco(5);

        assertEquals(new Dolar(10), cinco.vezes(2));
        assertEquals(new Dolar(15), cinco.vezes(3));
    }
}
