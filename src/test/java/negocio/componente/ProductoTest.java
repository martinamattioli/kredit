package negocio.componente;

import negocio.envio.Correo;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProductoTest {

    static Producto producto;

    @BeforeClass
    public static void init(){
        producto = new Producto("Celular de alta gama", 200,
                new Foto(), "Samsung S21", 0.4);
    }

    @Test
    public void testElPrecioDelProductoCreadoEs200(){
        Assert.assertEquals(200, producto.getPrecio().intValue());
    }

    @Test
    public void testElModeloDelProductoCreadoEsSamsungS21(){
        Assert.assertEquals("Samsung S21", producto.getModelo());
    }

}
