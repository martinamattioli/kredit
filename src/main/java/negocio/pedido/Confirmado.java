package negocio.pedido;

import negocio.notificador.Notificador;

import java.io.IOException;

public class Confirmado extends EstadoPedido {

    public Confirmado(Pedido pedido) {
        super(pedido);
    }

    public void pagar(Integer dinero) throws DineroInsuficienteException, IOException {
        if (dinero >= pedido.calcularCosto()) {
            pedido.setEstadoPedido(new Pagado(pedido));
            pedido.notificar("Pedido Pagado", "El pedido ha sido pagado.");
        } else throw new DineroInsuficienteException();
    }

    public void entregar() throws NoSePuedeEntregarException {
        throw new NoSePuedeEntregarException();
    }

    public void cancelar() throws IOException {
        pedido.setEstadoPedido(new Cancelado(pedido));
        pedido.notificar("Pedido Cancelado", "El pedido ha sido cancelado.");
    }
}
