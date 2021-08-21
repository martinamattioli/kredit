package negocio.organizacion;

import negocio.catalogo.Catalogo;
import negocio.cliente.Cliente;
import negocio.cliente.TarjetaDeCredito;
import negocio.cliente.TipoDeDocumento;
import negocio.cliente.Ubicacion;
import negocio.componente.Componente;
import negocio.envio.TipoDeEnvio;
import negocio.pedido.Pedido;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Organizacion {
    private static Organizacion instance = null;
    private String nombre;
    private Catalogo catalogo;
    private List<Cliente> clientes;
    private List<Pedido> pedidos;

    private Organizacion(){
        nombre = null;
        catalogo = new Catalogo();
        clientes = new ArrayList<Cliente>();
        pedidos = new ArrayList<Pedido>();
    }

    public static Organizacion getInstance(){
        if(instance == null){
            instance = new Organizacion();
        }
        return instance;
    }

    // INICIO - GETTER & SETTER

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // FIN - GETTER & SETTER

    public void agregarAlCatalogo(Componente componente){
        catalogo.agregar(componente);
    }

    public void removerDelCatalogo(Componente componente){
        catalogo.remover(componente);
    }

    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void registrarCliente(String nombreCompleto, String mail, TipoDeDocumento tipoDeDocumento,
                                 String nroDeDocumento, String direccion, TarjetaDeCredito tarjetaDeCredito,
                                 Ubicacion ubicacion){
        this.agregarCliente(new Cliente(nombreCompleto, mail, tipoDeDocumento,
                nroDeDocumento, direccion, tarjetaDeCredito,ubicacion));
    }

    public void registrarPedido(Cliente cliente, Componente componente, TipoDeEnvio tipoDeEnvio){
        pedidos.add(new Pedido(cliente, LocalDate.now(), componente, tipoDeEnvio));
    }

    public Componente buscarEnElCatalogoPorNombre(String nombre){
        return catalogo.buscarPorNombre(nombre);
    }

    public ArrayList<Componente> filtrarDelCatalogoPorPrecioMayorOIgual(Integer precio){
        return catalogo.filtrarComponentesConPrecioMayorOIgual(precio);
    }

    public ArrayList<Componente> filtrarDelCatalogoPorPrecioMenorOIgual(Integer precio){
        return catalogo.filtrarComponentesConPrecioMenorOIgual(precio);
    }

}
