package negocio.envio;

import negocio.componente.Combo;
import negocio.componente.Componente;
import negocio.componente.Foto;
import negocio.componente.Producto;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class CorreoTest {
    @Test
    public void testCalcularCostoEsIgualA100(){
       Componente componente = new Producto("Unas caracteristicas", 200, new Foto(), "Modelo 123", 123);
       Correo correo = new Correo();
       Assert.assertEquals(100,correo.calcularCosto(componente).intValue());
    }

}
