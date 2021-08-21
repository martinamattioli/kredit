package negocio.pedido;

import negocio.cliente.TarjetaDeCredito;

import java.io.IOException;

public class Pagado extends EstadoPedido {

    public Pagado(Pedido pedido) {
        super(pedido);
    }

    public void pagar(TarjetaDeCredito tarjetaDeCredito, Integer monto) {

    }

    public void entregar() throws IOException {
        pedido.setEstadoPedido(new Entregado(pedido));
        pedido.notificar("Pedido Entregado","El pedido ha sido entregado");
    }


    public void cancelar(TarjetaDeCredito tarjetaDeCredito, Integer montoADevolver) throws IOException {
        tarjetaDeCredito.sumarMonto(montoADevolver);
        pedido.setEstadoPedido(new Cancelado(pedido));
        pedido.notificar("Pedido Cancelado","El pedido ha sido cancelado");
    }

}
