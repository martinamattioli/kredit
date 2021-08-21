package negocio.envio;

import org.junit.Assert;
import org.junit.Test;


public class CorreoTest {

    @Test
    public void testCalcularCostoEsIgualA100(){
       Correo correo = new Correo();
       Assert.assertEquals(100, correo.calcularCosto().intValue());
    }

}
