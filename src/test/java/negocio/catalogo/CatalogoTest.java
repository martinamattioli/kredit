package negocio.catalogo;

import negocio.componente.Producto;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CatalogoTest {

    static Catalogo catalogo;
    static Producto celular;
    static Producto televisor;

    @BeforeClass
    public static void init(){
        catalogo = new Catalogo("Tecnologia");
        televisor = new Producto("Lg 55 4k", "Televisor", "", 300, 10);
        celular = new Producto("Samsung S21", "Celular de alta gama", "",100,4);
        catalogo.agregar(celular);
        catalogo.agregar(televisor);
    }

    @Test
    public void testDadoUnNombreSeRealizaLaBusquedaCorrectamenteEnElCatalogo(){
        Assert.assertEquals(celular, catalogo.buscarPorNombre("Samsung S21"));
    }

    @Test
    public void testAlFiltrarDelCatalogoPorPrecioMayorOIgualObtengoUnaListaDeDosProducto(){
        Assert.assertEquals(2, catalogo.filtrarComponentesConPrecioMayorOIgual(100).size());
    }

    @Test
    public void testAlFiltrarDelCatalogoPorPrecioMenorOIgualObtengoUnaListaDeUnProducto(){
        Assert.assertEquals(1, catalogo.filtrarComponentesConPrecioMenorOIgual(150).size());
    }

}

