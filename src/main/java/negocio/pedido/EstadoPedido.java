package negocio.pedido;

import negocio.notificador.Notificador;
import org.mockito.internal.matchers.Not;

import java.io.IOException;

public abstract class EstadoPedido {

    protected Pedido pedido;

    public EstadoPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public abstract void pagar(Integer dinero) throws DineroInsuficienteException, IOException, NoSePuedePagarException;

    public abstract void entregar() throws IOException, NoSePuedeEntregarException;

    public abstract void cancelar() throws IOException, NoSePuedeCancelarException;

}
