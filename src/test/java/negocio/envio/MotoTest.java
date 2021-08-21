package negocio.envio;

import negocio.componente.Componente;
import negocio.componente.Foto;
import negocio.componente.Producto;
import org.junit.Assert;
import org.junit.Test;

public class MotoTest {

    @Test
    public void testCalcularCostoEsIgualA150(){
        Moto moto = new Moto();
        Componente componente = new Producto("Unas caracteristicas", 200, new Foto(), "Modelo 123", 123);
        Assert.assertEquals(150, moto.calcularCosto(componente).intValue());
    }
}
