package negocio.pedido;

import negocio.cliente.TarjetaDeCredito;

public class Entregado extends EstadoPedido {

    public void pagar(Pedido pedido, TarjetaDeCredito tarjetaDeCredito, Integer monto) throws NoSePuedePagarException {
        throw new NoSePuedePagarException();
    }

    public void entregar(Pedido pedido) throws NoSePuedeEntregarException {
        throw new NoSePuedeEntregarException();
    }

    public void cancelar(Pedido pedido, TarjetaDeCredito tarjetaDeCredito, Integer monto) throws NoSePuedeCancelarException {
        throw new NoSePuedeCancelarException();
    }

}
