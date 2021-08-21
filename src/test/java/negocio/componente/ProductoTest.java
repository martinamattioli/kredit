package negocio.componente;

import negocio.envio.Correo;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProductoTest {

    static Producto producto;

    @BeforeClass
    public static void init(){
        producto = new Producto("Samsung S21", "Celular de alta gama", 200,
                new Foto(), 0.4);
    }

    @Test
    public void testElPrecioDelProductoCreadoEs200(){
        Assert.assertEquals(200, producto.getPrecio().intValue());
    }

    @Test
    public void testElNombreDelProductoCreadoEsSamsungS21(){
        Assert.assertEquals("Samsung S21", producto.getNombre());
    }

}
