package negocio.pedido;

import negocio.cliente.Tarjeta;

import java.io.IOException;

public class Pagado extends EstadoPedido {

    public Pagado(Pedido pedido) {
        super(pedido);
    }

    public void pagar() {

    }

    public void entregar() throws IOException {
        pedido.setEstadoPedido(new Entregado(pedido));
        pedido.notificar("Pedido Entregado","El pedido ha sido entregado");
    }


    public void cancelar() throws IOException {
        Tarjeta tarjeta = pedido.getTarjetaDelCliente();
        Integer montoADevolver = pedido.calcularCosto();
        tarjeta.sumarMonto(montoADevolver);
        pedido.setEstadoPedido(new Cancelado(pedido));
        pedido.notificar("Pedido Cancelado","El pedido ha sido cancelado");
    }

}
