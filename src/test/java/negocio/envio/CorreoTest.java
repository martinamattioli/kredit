package negocio.envio;

import negocio.cliente.Ubicacion;
import negocio.componente.Componente;
import negocio.componente.Foto;
import negocio.componente.Producto;
import org.junit.Assert;
import org.junit.Test;


public class CorreoTest {

    @Test
    public void testCalcularCostoEsIgualA100SiLaUbicacionDestinoEsCABA(){
        Componente componente = new Producto("Modelo 123", "Unas caracteristicas",
                new Foto(),200 , 123);
        Correo correo = new Correo();
        Assert.assertEquals(100,correo.calcularCosto(componente.getPeso(), Ubicacion.CABA).intValue());
    }

    @Test
    public void testCalcularCostoEsIgualA200SiLaUbicacionDestinoEsGranBSAS(){
        Componente componente = new Producto("Modelo 123", "Unas caracteristicas",
                new Foto(),200, 123);
        Correo correo = new Correo();
        Assert.assertEquals(200,correo.calcularCosto(componente.getPeso(), Ubicacion.GRAN_BSAS).intValue());
    }

    @Test
    public void testCalcularCostoEsIgualA2000SiLaUbicacionDestinoEsElInterior(){
        Componente componente = new Producto("Modelo 123", "Unas caracteristicas",
                new Foto(),200, 123);
        Correo correo = new Correo();
        Assert.assertEquals(2000,correo.calcularCosto(componente.getPeso(), Ubicacion.INTERIOR).intValue());
    }

}
