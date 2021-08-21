package negocio.pedido;

import negocio.cliente.Cliente;
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

    public Pedido(Cliente cliente, LocalDate fecha, Componente componente, TipoDeEnvio tipoDeEnvio) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.componente = componente;
        this.tipoDeEnvio = tipoDeEnvio;
        this.estadoPedido = new Confirmado(this);
        this.notificador = new Notificador();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public Integer calcularCosto() {
        return componente.getPrecio() + tipoDeEnvio.calcularCosto();
    }

    public void pagar(Integer dinero) throws DineroInsuficienteException, IOException, NoSePuedePagarException {
        estadoPedido.pagar(dinero);
    }

    public void entregar() throws IOException, NoSePuedeEntregarException {
        estadoPedido.entregar();
    }

    public void cancelar() throws IOException, NoSePuedeCancelarException {
        estadoPedido.cancelar();
    }

    public void notificar(String asunto, String mensaje) throws IOException {
        notificador.notificar(cliente.getMail(), asunto, mensaje);
    }
}
