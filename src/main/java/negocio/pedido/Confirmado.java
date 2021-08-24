package negocio.pedido;

import negocio.cliente.TarjetaDeCredito;

import java.io.IOException;

public class Confirmado extends EstadoPedido {

    public Confirmado(Pedido pedido) throws IOException {
        pedido.notificar("Pedido Confirmado", "El pedido ha sido confirmado.");
    }

    public void pagar(Pedido pedido, TarjetaDeCredito tarjetaDeCredito, Integer monto)
            throws MontoInsuficienteException, IOException {
        if (tarjetaDeCredito.tieneMontoSuficiente(monto)) {
            tarjetaDeCredito.restarMonto(monto);
            pedido.setEstadoPedido(new Pagado());
            pedido.notificar("Pedido Pagado", "El pedido ha sido pagado.");
        } else throw new MontoInsuficienteException();
    }

    public void entregar(Pedido pedido) throws NoSePuedeEntregarException {
        throw new NoSePuedeEntregarException();
    }

    public void cancelar(Pedido pedido, TarjetaDeCredito tarjetaDeCredito, Integer monto) throws IOException {
        pedido.setEstadoPedido(new Cancelado());
        pedido.notificar("Pedido Cancelado", "El pedido ha sido cancelado.");
    }
}
