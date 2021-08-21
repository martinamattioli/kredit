package negocio.pedido;

import negocio.cliente.Tarjeta;

import java.io.IOException;

public class Confirmado extends EstadoPedido {

    public Confirmado(Pedido pedido) {
        super(pedido);
    }

    public void pagar() throws MontoInsuficienteException, IOException {
        Tarjeta tarjeta = pedido.getTarjetaDelCliente();
        Integer costoAPagar = pedido.calcularCosto();
        if (tarjeta.tieneMontoSuficiente(costoAPagar)) {
            tarjeta.restarMonto(costoAPagar);
            pedido.setEstadoPedido(new Pagado(pedido));
            pedido.notificar("Pedido Pagado", "El pedido ha sido pagado.");
        } else throw new MontoInsuficienteException();
    }

    public void entregar() throws NoSePuedeEntregarException {
        throw new NoSePuedeEntregarException();
    }

    public void cancelar() throws IOException {
        pedido.setEstadoPedido(new Cancelado(pedido));
        pedido.notificar("Pedido Cancelado", "El pedido ha sido cancelado.");
    }
}
