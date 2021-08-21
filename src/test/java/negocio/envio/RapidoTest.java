package negocio.envio;

import negocio.cliente.Ubicacion;
import negocio.componente.Componente;
import negocio.componente.Foto;
import negocio.componente.Producto;
import org.junit.Assert;
import org.junit.Test;

public class RapidoTest {

    @Test
    public void testCalcularCostoEsIgualA200(){
        Rapido rapido = new Rapido();
        Componente componente = new Producto("Unas caracteristicas", 200, new Foto(), "Modelo 123", 123);
        Assert.assertEquals(10000, rapido.calcularCosto(componente, Ubicacion.INTERIOR
        ).intValue());
    }
}
