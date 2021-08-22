package negocio.pedido;

import negocio.cliente.Cliente;
import negocio.cliente.Ubicacion;
import negocio.componente.Componente;
import negocio.envio.TipoDeEnvio;
import negocio.notificador.Notificador;

import java.io.IOException;
import java.time.LocalDate;

public class Pedido {
    private Cliente cliente;
    private LocalDate fecha;
    private Componente componente;
    private TipoDeEnvio tipoDeEnvio;
    private EstadoPedido estadoPedido;
    private Notificador notificador;

    public Pedido(Cliente cliente, LocalDate fecha, Componente componente, TipoDeEnvio tipoDeEnvio) throws IOException {
        this.cliente = cliente;
        this.fecha = fecha;
        this.componente = componente;
        this.tipoDeEnvio = tipoDeEnvio;
        this.notificador = new Notificador();
        this.estadoPedido = new Confirmado(this);
    }

    // INICIO - GETTER & SETTER

    public Cliente getCliente() {
        return cliente;
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    // FIN - GETTER & SETTER

    public Integer calcularCosto() {
        return componente.getPrecio() + tipoDeEnvio.calcularCosto(this.componente.getPeso(), cliente.getUbicacion());
    }

    public void pagar() throws MontoInsuficienteException, IOException, NoSePuedePagarException {
        estadoPedido.pagar(cliente.getTarjetaDeCredito(), this.calcularCosto());
    }

    public void entregar() throws IOException, NoSePuedeEntregarException {
        estadoPedido.entregar();
    }

    public void cancelar() throws IOException, NoSePuedeCancelarException {
        estadoPedido.cancelar(cliente.getTarjetaDeCredito(), this.calcularCosto());
    }

    public void notificar(String asunto, String mensaje) throws IOException {
        notificador.notificar(cliente.getMail(), asunto, mensaje);
    }

}
