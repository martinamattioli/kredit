package negocio.pedido;

import negocio.cliente.TarjetaDeCredito;

import java.io.IOException;

public class Pagado extends EstadoPedido {

    public void pagar(Pedido pedido, TarjetaDeCredito tarjetaDeCredito, Integer monto) {

    }

    public void entregar(Pedido pedido) throws IOException {
        pedido.setEstadoPedido(new Entregado());
        pedido.notificar("Pedido Entregado","El pedido ha sido entregado");
    }


    public void cancelar(Pedido pedido, TarjetaDeCredito tarjetaDeCredito, Integer monto) throws IOException {
        tarjetaDeCredito.sumarMonto(monto);
        pedido.setEstadoPedido(new Cancelado());
        pedido.notificar("Pedido Cancelado","El pedido ha sido cancelado");
    }

}
