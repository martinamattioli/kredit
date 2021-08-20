package negocio.pedido;

import negocio.cliente.Cliente;
import negocio.componente.Componente;
import negocio.envio.TipoDeEnvio;

import java.time.LocalDate;

public class Pedido {
    private Cliente cliente;
    private LocalDate fecha;
    private Componente componente;
    private TipoDeEnvio tipoDeEnvio;
    private EstadoPedido estadoPedido;

    public Pedido(Cliente cliente, LocalDate fecha, Componente componente, TipoDeEnvio tipoDeEnvio) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.componente = componente;
        this.tipoDeEnvio = tipoDeEnvio;
        this.estadoPedido = new Confirmado(this);
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public Integer calcularCosto() {
        return componente.getPrecio() + tipoDeEnvio.calcularCosto();
    }

    public void pagar(Integer dinero) {
        estadoPedido.pagar(dinero);
    }

    public void entregar(){
        estadoPedido.entregar();
    }
}
