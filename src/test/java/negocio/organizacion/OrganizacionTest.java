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

import java.io.IOException;

public class OrganizacionTest {

    static Organizacion organizacion;

    @BeforeClass
    public static void init(){
        organizacion = Organizacion.getInstance();
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
    public void testAgregarUnProductoLoAgregaAlCatalogo(){
        Producto producto = new Producto("Producto Test", "Test", new Foto(), 200, 10);
        organizacion.agregarAlCatalogo(producto);
        Assert.assertEquals(1, organizacion.getCatalogo().obtenerCantidadDeComponentes().intValue());
    }

    @Test
    public void testRegistrarUnPedidoLoAgregaCorrectamenteALaOrganizacion() throws IOException {
        Cliente cliente = new Cliente("Lionel Messi", "test@dds.com", TipoDeDocumento.DNI, "12345678", "Calle 123", null, Ubicacion.GRAN_BSAS);
        Componente componente = new Producto("Producto Test", "Test",  new Foto(), 200, 5);
        TipoDeEnvio tipoDeEnvio = new Moto();
        organizacion.registrarPedido(cliente, componente, tipoDeEnvio);
        Assert.assertEquals(1, organizacion.getPedidos().size());
    }
}
