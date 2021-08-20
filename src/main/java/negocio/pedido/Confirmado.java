package negocio.pedido;

public class Confirmado extends EstadoPedido {

    public Confirmado(Pedido pedido) {
        super(pedido);
    }

    public void pagar(Integer dinero) {
        if (dinero == pedido.calcularCosto()) {
            pedido.setEstadoPedido(new Pagado(pedido));
        } else {
            // TODO: lanzar excepcion
        }
    }

    public void entregar() {

    }
}
