package negocio.envio;

import negocio.cliente.Ubicacion;
import negocio.componente.Componente;
import negocio.componente.Foto;
import negocio.componente.Producto;
import org.junit.Assert;
import org.junit.Test;

public class RapidoTest {

    @Test
    public void testCalcularCostoEsIgualA10000(){
        Rapido rapido = new Rapido();
        Componente componente = new Producto("Modelo 123", "Unas caracteristicas",
                new Foto(),200,  123);
        Assert.assertEquals(10000, rapido.calcularCosto(componente.getPeso(), Ubicacion.INTERIOR).intValue());
    }
}
