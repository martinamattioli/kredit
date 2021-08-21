package negocio.envio;

import org.junit.Assert;
import org.junit.Test;

public class RapidoTest {

    @Test
    public void testCalcularCostoEsIgualA200(){
        Rapido rapido = new Rapido();
        Assert.assertEquals(200, rapido.calcularCosto().intValue());
    }
}
