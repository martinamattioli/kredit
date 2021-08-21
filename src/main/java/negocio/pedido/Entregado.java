package negocio.pedido;

public class Entregado extends EstadoPedido {

    public Entregado(Pedido pedido) {
        super(pedido);
    }

    public void pagar() throws NoSePuedePagarException {
        throw new NoSePuedePagarException();
    }

    public void entregar() throws NoSePuedeEntregarException {
        throw new NoSePuedeEntregarException();
    }

    public void cancelar() throws NoSePuedeCancelarException {
        throw new NoSePuedeCancelarException();
    }

}
