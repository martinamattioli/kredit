package negocio.envio;

import org.junit.Assert;
import org.junit.Test;

public class MotoTest {

    @Test
    public void testCalcularCostoEsIgualA150(){
        Moto moto = new Moto();
        Assert.assertEquals(150, moto.calcularCosto().intValue());
    }
}
