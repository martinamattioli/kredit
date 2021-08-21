package negocio.pedido;

public class Cancelado extends EstadoPedido {

    public Cancelado(Pedido pedido) {
        super(pedido);
    }

    public void pagar(Integer dinero) {

    }

    public void entregar() {

    }

    public void cancelar() {

    }
}
