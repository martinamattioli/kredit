package negocio.organizacion;

import negocio.cliente.Cliente;
import negocio.cliente.TipoDeDocumento;
import negocio.cliente.Ubicacion;
import negocio.componente.Componente;
import negocio.componente.Foto;
import negocio.componente.Producto;
import negocio.envio.Moto;
import negocio.envio.TipoDeEnvio;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class OrganizacionTest {

    static Organizacion organizacion;
    static Producto celular;
    static Producto televisor;

    @BeforeClass
    public static void init(){
        organizacion = Organizacion.getInstance();
        televisor = new Producto("Lg 55 4k", "Televisor", 300,
                new Foto(), 10);
        celular = new Producto("Samsung S21", "Celular de alta gama", 100,
                new Foto(), 4);
        organizacion.agregarAlCatalogo(televisor);
        organizacion.agregarAlCatalogo(celular);
    }

    @Test
    public void testEsImposibleCrearUnaNuevaInstanciaDeOrganizacion(){
        Organizacion otraOrganizacion = Organizacion.getInstance();
        Assert.assertEquals(organizacion, otraOrganizacion);
    }

    @Test
    public void testRegistrarUnClienteLoAgregaCorrectamenteALaOrganizacion(){
        organizacion.registrarCliente("Lionel Messi", "test@dds.com", TipoDeDocumento.DNI, "12345678", "Calle 234", null, Ubicacion.CABA);
        Assert.assertEquals(1, organizacion.getClientes().size());
    }

    @Test
    public void testRegistrarUnPedidoLoAgregaCorrectamenteALaOrganizacion(){
        Cliente cliente = new Cliente("Lionel Messi", "test@dds.com", TipoDeDocumento.DNI, "12345678", "Calle 123", null, Ubicacion.GRAN_BSAS);
        Componente componente = new Producto("Producto Test", "Test", 200, new Foto(), 5);
        TipoDeEnvio tipoDeEnvio = new Moto();
        organizacion.registrarPedido(cliente, componente, tipoDeEnvio);
        Assert.assertEquals(1, organizacion.getPedidos().size());
    }

    @Test
    public void testDadoUnNombreSeRealizaLaBusquedaCorrectamenteEnElCatalogo(){
        Assert.assertEquals(celular, organizacion.buscarEnElCatalogoPorNombre("Samsung S21"));
    }

    @Test
    public void testAlFiltrarDelCatalogoPorPrecioMenorOIgualObtengoUnaListaDeUnProducto(){
        Assert.assertEquals(1, organizacion.filtrarDelCatalogoPorPrecioMenorOIgual(150).size());
    }

    @Test
    public void testAlFiltrarDelCatalogoPorPrecioMayorOIgualObtengoUnaListaDeDosProducto(){
        Assert.assertEquals(2, organizacion.filtrarDelCatalogoPorPrecioMayorOIgual(100).size());
    }
}
