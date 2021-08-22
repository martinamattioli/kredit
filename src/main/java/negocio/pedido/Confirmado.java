package negocio.pedido;

import negocio.cliente.TarjetaDeCredito;

import java.io.IOException;

public class Confirmado extends EstadoPedido {

    public Confirmado(Pedido pedido) throws IOException {
        super(pedido);
        pedido.notificar("Pedido Confirmado", "El pedido ha sido confirmado.");
    }

    public void pagar(TarjetaDeCredito tarjetaDeCredito, Integer monto)
            throws MontoInsuficienteException, IOException {
        if (tarjetaDeCredito.tieneMontoSuficiente(monto)) {
            tarjetaDeCredito.restarMonto(monto);
            pedido.setEstadoPedido(new Pagado(pedido));
            pedido.notificar("Pedido Pagado", "El pedido ha sido pagado.");
        } else throw new MontoInsuficienteException();
    }

    public void entregar() throws NoSePuedeEntregarException {
        throw new NoSePuedeEntregarException();
    }

    public void cancelar(TarjetaDeCredito tarjetaDeCredito, Integer monto) throws IOException {
        pedido.setEstadoPedido(new Cancelado(pedido));
        pedido.notificar("Pedido Cancelado", "El pedido ha sido cancelado.");
    }
}
