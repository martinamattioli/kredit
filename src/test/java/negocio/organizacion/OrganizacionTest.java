package negocio.organizacion;

import negocio.cliente.Cliente;
import negocio.cliente.TipoDeDocumento;
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
        organizacion.registrarCliente("Lionel Messi", "test@dds.com", TipoDeDocumento.DNI, "12345678");
        Assert.assertEquals(1, organizacion.getClientes().size());
    }

    @Test
    public void testAgregarUnProductoLoAgregaAlCatalogo(){
        Producto producto = new Producto("Producto Test", 200, new Foto(), "Test", 10);
        organizacion.agregarProducto(producto);
        Assert.assertEquals(1, organizacion.getCatalogo().size());
    }

    @Test
    public void testRegistrarUnPedidoLoAgregaCorrectamenteALaOrganizacion(){
        Cliente cliente = new Cliente("Lionel Messi", "test@dds.com", TipoDeDocumento.DNI, "12345678");
        Componente componente = new Producto("Producto Test", 200, new Foto(), "Test", 5);
        TipoDeEnvio tipoDeEnvio = new Moto();
        organizacion.registrarPedido(cliente, componente, tipoDeEnvio);
        Assert.assertEquals(1, organizacion.getPedidos().size());
    }

}
