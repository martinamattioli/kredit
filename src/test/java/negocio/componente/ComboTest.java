package negocio.componente;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ComboTest {

    static Combo combo;

    @BeforeClass
    public static void init(){
        Producto primerProducto = new Producto("Celular de alta gama", 200,
                new Foto(), "Samsung S21");
        Producto segundoProducto = new Producto("Celular de alta gama", 300,
                new Foto(), "iPhone 12 Pro Max");
        Producto tercerProducto = new Producto("Celular de gama media", 150,
                new Foto(), "Poco X3 Pro");
        combo = new Combo("Combo de celulares");
        combo.agregarComponente(primerProducto);
        combo.agregarComponente(segundoProducto);
        combo.agregarComponente(tercerProducto);
    }

    @Test
    public void testElPrecioDelComboEsLaSumaDelDeSusComponentes(){
        Assert.assertEquals(650, combo.getPrecio().intValue());
    }

    @Test
    public void testElPrecioDelComboConOtroComboAdentroEsLaSumaDeAmbos(){
        Producto primerProducto = new Producto("Celular de alta gama", 1000,
                new Foto(), "Samsung S21");
        Producto segundoProducto = new Producto("Celular de alta gama", 350,
                new Foto(), "iPhone 12 Pro Max");
        Combo otroCombo = new Combo("Combo de celulares 2");
        otroCombo.agregarComponente(primerProducto);
        otroCombo.agregarComponente(segundoProducto);
        combo.agregarComponente(otroCombo);
        Assert.assertEquals(2000, combo.getPrecio().intValue());
    }

}
