package negocio.organizacion;

import negocio.catalogo.Catalogo;
import negocio.catalogo.RepositorioCatalogo;
import negocio.cliente.*;
import negocio.componente.Componente;
import negocio.envio.TipoDeEnvio;
import negocio.pedido.Pedido;
import negocio.pedido.RepositorioPedido;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Organizacion {
    private static Organizacion instance = null;
    private String nombre;
    private List<Catalogo> catalogo;
    private List<Cliente> clientes;
    private List<Pedido> pedidos;

    private Organizacion(){
        nombre = "TechBuy";
        catalogo = RepositorioCatalogo.getInstance().getCatalogos();
        clientes = RepositorioCliente.getInstance().getClientes();
        pedidos = RepositorioPedido.getInstance().getPedidos();
    }

    public static Organizacion getInstance(){
        if(instance == null){
            instance = new Organizacion();
        }
        return instance;
    }

    // INICIO - GETTER & SETTER

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

    public void agregarAlCatalogo(Catalogo catalogo, Componente componente){
        catalogo.agregar(componente);
    }

    public void removerDelCatalogo(Catalogo catalogo, Componente componente){
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

    public void registrarPedido(Cliente cliente, Componente componente, TipoDeEnvio tipoDeEnvio) throws IOException {
        pedidos.add(new Pedido(cliente, LocalDate.now(), componente, tipoDeEnvio));
    }

    public Componente buscarEnElCatalogoPorNombre(Catalogo catalogo, String nombre){
        return catalogo.buscarPorNombre(nombre);
    }

    public ArrayList<Componente> filtrarDelCatalogoPorPrecioMayorOIgual(Catalogo catalogo, Integer precio){
        return catalogo.filtrarComponentesConPrecioMayorOIgual(precio);
    }

    public ArrayList<Componente> filtrarDelCatalogoPorPrecioMenorOIgual(Catalogo catalogo, Integer precio){
        return catalogo.filtrarComponentesConPrecioMenorOIgual(precio);
    }

}
