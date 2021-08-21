package negocio.pedido;

public abstract class EstadoPedido {

    protected Pedido pedido;

    public EstadoPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public abstract void pagar(Integer dinero) throws DineroInsuficienteException;

    public abstract void entregar();

    public abstract void cancelar();
}
