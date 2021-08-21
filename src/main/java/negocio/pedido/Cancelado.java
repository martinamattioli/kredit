package negocio.pedido;

import negocio.cliente.TarjetaDeCredito;

public class Cancelado extends EstadoPedido {

    public Cancelado(Pedido pedido) {
        super(pedido);
    }

    public void pagar(TarjetaDeCredito tarjetaDeCredito, Integer costoAPagar) throws NoSePuedePagarException {
        throw new NoSePuedePagarException();
    }

    public void entregar() throws NoSePuedeEntregarException {
        throw new NoSePuedeEntregarException();
    }

    public void cancelar(TarjetaDeCredito tarjetaDeCredito, Integer montoADevolver) throws NoSePuedeCancelarException {
        throw new NoSePuedeCancelarException();
    }

}
