package negocio.pedido;

public abstract class EstadoPedido {

    protected Pedido pedido;

    public EstadoPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public abstract void pagar(Integer dinero);

    public abstract void entregar();

}
