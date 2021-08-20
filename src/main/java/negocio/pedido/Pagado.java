package negocio.pedido;

public class Pagado extends EstadoPedido {

    public Pagado(Pedido pedido) {
        super(pedido);
    }

    public void pagar(Integer dinero) {

    }

    public void entregar() {
        pedido.setEstadoPedido(new Entregado(pedido));
    }

}
