package negocio.pedido;

import negocio.cliente.TarjetaDeCredito;

import java.io.IOException;

public class Confirmado extends EstadoPedido {

    public Confirmado(Pedido pedido) {
        super(pedido);
    }

    public void pagar(TarjetaDeCredito tarjetaDeCredito, Integer costoAPagar)
            throws MontoInsuficienteException, IOException {
        if (tarjetaDeCredito.tieneMontoSuficiente(costoAPagar)) {
            tarjetaDeCredito.restarMonto(costoAPagar);
            pedido.setEstadoPedido(new Pagado(pedido));
            pedido.notificar("Pedido Pagado", "El pedido ha sido pagado.");
        } else throw new MontoInsuficienteException();
    }

    public void entregar() throws NoSePuedeEntregarException {
        throw new NoSePuedeEntregarException();
    }

    public void cancelar(TarjetaDeCredito tarjetaDeCredito, Integer montoADevolver) throws IOException {
        pedido.setEstadoPedido(new Cancelado(pedido));
        pedido.notificar("Pedido Cancelado", "El pedido ha sido cancelado.");
    }
}
