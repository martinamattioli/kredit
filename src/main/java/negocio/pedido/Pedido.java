package negocio.pedido;

import negocio.cliente.Cliente;
import negocio.cliente.Ubicacion;
import negocio.componente.Componente;
import negocio.envio.TipoDeEnvio;
import negocio.notificador.Notificador;
import negocio.persistentEntity.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import java.io.IOException;
import java.time.LocalDate;

@Entity
public class Pedido extends PersistentEntity {
    @OneToOne
    private Cliente cliente;
    private LocalDate fecha;
    @ManyToOne
    private Componente componente;
    @ManyToOne
    private TipoDeEnvio tipoDeEnvio;
    @ManyToOne
    private EstadoPedido estadoPedido;
    @Transient
    private Notificador notificador;

    public Pedido(Cliente cliente, LocalDate fecha, Componente componente, TipoDeEnvio tipoDeEnvio) throws IOException {
        this.cliente = cliente;
        this.fecha = fecha;
        this.componente = componente;
        this.tipoDeEnvio = tipoDeEnvio;
        this.notificador = new Notificador();
        this.estadoPedido = new Confirmado(this);
    }

    public Pedido() {

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
        estadoPedido.pagar(this, cliente.getTarjetaDeCredito(), this.calcularCosto());
    }

    public void entregar() throws IOException, NoSePuedeEntregarException {
        estadoPedido.entregar(this);
    }

    public void cancelar() throws IOException, NoSePuedeCancelarException {
        estadoPedido.cancelar(this, cliente.getTarjetaDeCredito(), this.calcularCosto());
    }

    public void notificar(String asunto, String mensaje) throws IOException {
        notificador.notificar(cliente.getMail(), asunto, mensaje);
    }

}
